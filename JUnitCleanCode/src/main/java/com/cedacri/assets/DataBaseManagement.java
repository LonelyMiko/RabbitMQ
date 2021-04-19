package com.cedacri.assets;

import com.cedacri.pojo.Doctor;
import com.cedacri.pojo.Patient;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;


/**
 * This class contains methods related to database operations
 */
public class DataBaseManagement {
    private static SessionFactory factory;

    /**
     * This method establishes a connection to the database
     * It has the private type because it is used for other methods from this class
     */
    private static void connectionToDataBase()
    {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * This method checks if Patient.getDoctorID() has the correct doctor ID
     * @see Patient
     * @param id Patient.getDoctorID()
     * @return true if the patient has a valid doctor ID,otherwise false
     */
    private static boolean checkDoctorID(int id)
    {
        AtomicBoolean isCorrectId = new AtomicBoolean(false);
        Map<String, Doctor> doctorsList = getDoctorsFromDataBase();
        doctorsList.forEach(((s, doctor) -> {
            if (id == doctor.getID())
            {
                isCorrectId.set(true);
            }
        }));
        return isCorrectId.get();
    }

    /**
     * This method checks if the doctor's data is valid
     * @param doctor the object to be checked
     * @return true, if all fields are valid, otherwise false
     */
    private static boolean isDoctorValid(Doctor doctor)
    {
        if (doctor.getID() < 0)
        {
            return false;
        }
        else if (doctor.getAge() < 18 )
        {
            return false;
        }
        else return doctor.getExperience() >= 0;
    }

    /**
     * This method checks if the patient's data is valid
     * @param patient the object to be checked
     * @return true, if all fields are valid, otherwise false
     */
    private static boolean isPatientValid(Patient patient)
    {
        if (patient.getID() < 0)
        {
            return false;
        }
        else if (patient.getAge() < 0 && patient.getAge() > 122 )
        {
            return false;
        }
        else if (patient.getHeight() < 54.6 && patient.getHeight() > 272)
        {
            return false;
        }
        else if (patient.getWeight() < 0 && patient.getWeight() > 635)
        {
            return false;
        }
        else return checkDoctorID(patient.getDoctorID());
    }

    /**
     * This method returns the list of medics retrieved from the database
     * @return the list of medics
     */
    public static Map<String, Doctor> getDoctorsFromDataBase()
    {
        Map<String, Doctor> doctorsList = new ConcurrentHashMap<>();
        connectionToDataBase();
        try (Session session = factory.openSession()) {
            List doctors = session.createQuery("FROM Doctor ").list();
            for (Object doctor : doctors) {
                Doctor convertedDoctor = (Doctor) doctor;
                if (!doctorsList.containsKey(convertedDoctor.getName())) {
                    if (isDoctorValid(convertedDoctor)) {
                        doctorsList.put(convertedDoctor.getName(), convertedDoctor);
                    }
                }
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return doctorsList;
    }

    /**
     * This method returns the list of patients retrieved from the database
     * @return the list of patients
     */
    public static Map<String, Patient> getPatientsFromDataBase()
    {
        Map<String, Patient> patientList = new ConcurrentHashMap<>();
        connectionToDataBase();
        try (Session session = factory.openSession()) {
            List patients = session.createQuery("FROM Patient").list();
            for (Object patient : patients) {
                Patient convertedPatient = (Patient) patient;
                if (!patientList.containsKey(((Patient) patient).getName())) {
                    if (isPatientValid(convertedPatient)) {
                        patientList.put(convertedPatient.getName(), convertedPatient);
                    }
                }
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return patientList;
    }

    /**
     * This method checks if the doctor can treat the patient's disease by querying the database
     * @param doctor is used to get type of doctor
     * @param patient is used to get the patient's disease
     * @return true if this type of doctor can treat this disease, otherwise false
     */
    public static boolean checkIfDoctorIsRightForThePatient(Doctor doctor, Patient patient)
    {
        String diagnosis = patient.getDiagnosis();
        connectionToDataBase();
        try (Session session = factory.openSession()) {
            String sqlQuery = "FROM Doctor WHERE doctorName = '" + doctor.getName() +  "' AND DoctorType IN (" +
                    "SELECT DoctorType FROM Diagnosis WHERE DiagnosisName = '" + diagnosis + "')";
            List doctors = session.createQuery(sqlQuery).list();
            for (Object currentDoctor : doctors)
            {
                Doctor convertedDoctor = (Doctor)currentDoctor;
                if (doctor.getName().equals(convertedDoctor.getName()) &&
                        doctor.getDoctorType().equals(convertedDoctor.getDoctorType()))
                {
                    return true;
                }
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return false;
    }



}
