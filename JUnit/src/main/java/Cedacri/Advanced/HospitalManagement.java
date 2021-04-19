package Cedacri.Advanced;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HospitalManagement {
    private final Map<String, Doctor> doctorsList = new ConcurrentHashMap<String, Doctor>();
    private final Map<String, Patient> patientsList = new ConcurrentHashMap<String, Patient>();

    public Map<String, Doctor> getDoctorsList() {
        return doctorsList;
    }

    public Map<String, Patient> getPatientsList() {
        return patientsList;
    }

    public void addDoctor(Doctor doctor)
    {
        checkIfDoctorAlreadyExist(doctor);
        doctorsList.put(doctor.getName(),doctor);
    }

    public void addPatient(Patient patient)
    {
        checkIfPatientAlreadyExist(patient);
        patientsList.put(patient.getName(),patient);
    }

    public void checkIfDoctorAlreadyExist(Doctor doctor)
    {
        if (doctorsList.containsKey(doctor.getName()))
        {
            throw new RuntimeException("Doctor Already Exists");
        }
    }

    public void checkIfPatientAlreadyExist(Patient patient)
    {
        if (patientsList.containsKey(patient.getName()))
        {
            throw new RuntimeException("Patient Already Exists");
        }
    }

    public void removePatient(Patient patient)
    {
        if (patientsList.containsKey(patient.getName()))
        {
            patientsList.remove(patient.getName());
        }
        else
            {
                throw new RuntimeException("Patient Does Not Exists");
            }
    }

    public void removeDoctor(Doctor doctor)
    {
        if (doctorsList.containsKey(doctor.getName()))
        {
            doctorsList.remove(doctor.getName());
        }
        else
            {
                throw new RuntimeException("Doctor Does Not Exists");
            }
    }

    public void setDoctorID(Patient patient, int id)
    {
        doctorsList.forEach((s, doctor) -> {
            if (doctor.getID() == id) {
                patientsList.get(patient.getName()).setDoctorID(id);
            }
            else
                {
                    throw new RuntimeException("Invalid ID");
                }
        });
    }
    public boolean checkIfDoctorIsRightForThePatient(DoctorTypes doctorType,String patientDiagnosis)
    {
        TEST test = new TEST();
        boolean isRight = false;
        ArrayList<String> test_1 = test.map.get(doctorType.toString());
        if (test_1.contains(patientDiagnosis))
        {
            isRight = true;
        }
        return isRight;
    }
}
