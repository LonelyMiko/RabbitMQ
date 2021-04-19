package com.cedacri.assets;


import com.cedacri.pojo.Doctor;
import com.cedacri.pojo.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class DataBaseManagementTest {
    final Doctor fakeDoctor = new Doctor(4,45,15, "Test Doc","PATHOLOGISTS");

    final Doctor trueDoctor = new Doctor(0, 38, 5, "Adam Smith", "PSYCHIATRISTS");

    final Patient fakePatient = new Patient(4, 25, 2,
            "Test Patient", "Diabetes", "male", 189.8, 94.7);

    final Patient truePatient = new Patient(1, 60, 1,
            "Adelaisa Vendicci", "Insomnia", "female", 167.8, 85);

    @Test
    @DisplayName("Get a list of doctors from the database")
    void getDoctorsFromDataBase() {
        Assertions.assertEquals(3,
                DataBaseManagement.getDoctorsFromDataBase().size());
    }

    @Test
    @DisplayName("Get a list of patients from the database")
    void getPatientsFromDataBase() {
        Assertions.assertEquals(3,
                DataBaseManagement.getPatientsFromDataBase().size());
    }

    @Test
    @DisplayName("Should return true if doctor type is right for patient diagnostic")
    void checkIfDoctorIsRightForThePatient(){
        Assertions.assertTrue(DataBaseManagement.checkIfDoctorIsRightForThePatient(trueDoctor,truePatient));
    }

    @Test
    void checkIfDoctorIsNotSuitableForThePatient()
    {
        Assertions.assertFalse(DataBaseManagement.checkIfDoctorIsRightForThePatient(fakeDoctor,fakePatient));
    }
}