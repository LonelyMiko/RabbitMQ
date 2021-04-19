package com.cedacri.assets;

import com.cedacri.pojo.Doctor;
import com.cedacri.pojo.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HospitalManagementTest {
    Doctor doctor = new Doctor(4,45,15, "Adam Smith","PATHOLOGISTS");
    Patient patient = new Patient(1, 60, 1,
            "Adelaisa Vendicci", "Diabetes", "female", 167.8, 85);

    HospitalManagement hospitalManagement;

    @BeforeEach
    public void setup()
    {
        hospitalManagement = new HospitalManagement();
    }
    @Test
    void addDoctor() {
        hospitalManagement.addDoctor(new Doctor(5,55,21, "Test","PATHOLOGISTS"));
        Assertions.assertEquals(4,hospitalManagement.doctorsList.size());
    }

    @Test
    void removeDoctor() {
        hospitalManagement.removeDoctor(doctor);
        Assertions.assertEquals(2,hospitalManagement.doctorsList.size());
    }

    @Test
    void addPatient() {
        hospitalManagement.addPatient(new Patient(3,42,2,
                "Test Patient","Worry","male",167.8,85));
        Assertions.assertEquals(4,hospitalManagement.patientList.size());
    }

    @Test
    void removePatient() {
        hospitalManagement.removePatient(patient);
        Assertions.assertEquals(2,hospitalManagement.patientList.size());
    }

    @Test
    void doctorAlreadyExist() {
        Assertions.assertThrows(RuntimeException.class, () -> hospitalManagement.addDoctor(doctor));
    }

    @Test
    void patientAlreadyExist() {
        Assertions.assertThrows(RuntimeException.class, () -> hospitalManagement.addPatient(patient));
    }
}