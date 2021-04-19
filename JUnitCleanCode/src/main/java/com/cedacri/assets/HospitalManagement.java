package com.cedacri.assets;

import com.cedacri.pojo.Doctor;
import com.cedacri.pojo.Patient;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * This class contains methods related to hospital operations
 */
public class HospitalManagement {
    Map<String, Doctor> doctorsList = DataBaseManagement.getDoctorsFromDataBase();
    Map<String, Patient> patientList = DataBaseManagement.getPatientsFromDataBase();

    private boolean checkDoctorID(int id)
    {
        AtomicBoolean isCorrectId = new AtomicBoolean(false);
        doctorsList.forEach((s, doctor) -> {
            if (id == doctor.getID())
            {
                isCorrectId.set(true);
            }
        });
        return isCorrectId.get();
    }

    private boolean isDoctorValid(Doctor doctor)
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
    private boolean isPatientValid(Patient patient)
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
     * This method adds the doctor to the list
     * @param doctor doctor to be added
     */
    public void addDoctor(Doctor doctor)
    {
       if (!doctorAlreadyExist(doctor))
       {
           if (isDoctorValid(doctor)) {
               doctorsList.put(doctor.getName(), doctor);
           }
       }
       else
       {
           throw new RuntimeException("Doctor Already Exists");
       }
    }

    /**
     * This method remove the doctor to the list
     * @param doctor doctor to be removed
     */
    public void removeDoctor(Doctor doctor)
    {
        if (doctorAlreadyExist(doctor))
        {
            doctorsList.remove(doctor.getName());
        }
        else
        {
            throw new RuntimeException("Doctor Does Not Exists");
        }
    }

    /**
     * This method adds the patient to the list
     * @param patient patient to be added
     */
    public void addPatient(Patient patient)
    {
        if (!patientAlreadyExist(patient))
        {
            if (isPatientValid(patient)) {
                patientList.put(patient.getName(), patient);
            }
        }
        else
        {
            throw new RuntimeException("Patient Already Exists");
        }
    }

    /**
     * This method remove the patient to the list
     * @param patient patient to be removed
     */
    public void removePatient(Patient patient)
    {
        if (patientAlreadyExist(patient))
        {
            patientList.remove(patient.getName());
        }
        else
        {
            throw new RuntimeException("Patient Does Not Exists");
        }
    }

    /**
     * This method checks if the doctor is already on the list
     * @param doctor doctor to be checked
     * @return true if doctor is already on the list, otherwise false
     */
    public boolean doctorAlreadyExist(Doctor doctor)
    {
        return doctorsList.containsKey(doctor.getName());
    }

    /**
     * This method checks if the patient is already on the list
     * @param patient patient to be checked
     * @return true if patient is already on the list, otherwise false
     */
    public boolean patientAlreadyExist(Patient patient)
    {
        return patientList.containsKey(patient.getName());
    }
}
