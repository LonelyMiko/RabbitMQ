package com.cedacri.pojo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PatientTest {
    Patient patient;

    @BeforeEach
    void setup()
    {
        patient = new Patient(1, 60, 1,
            "Adelaisa Vendicci", "Insomnia", "female", 167.8, 85);
    }

    @Test
    void getID() {
        Assertions.assertEquals(1,patient.getID());
    }

    @Test
    void setID() {
        patient.setID(2);
        Assertions.assertEquals(2,patient.getID());
    }

    @Test
    void getAge() {
        Assertions.assertEquals(60,patient.getAge());
    }

    @Test
    void setAge() {
        patient.setAge(61);
        Assertions.assertEquals(61,patient.getAge());
    }

    @Test
    void getDoctorID() {
        Assertions.assertEquals(1,patient.getDoctorID());
    }

    @Test
    void setDoctorID() {
        patient.setDoctorID(2);
        Assertions.assertEquals(2,patient.getDoctorID());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Adelaisa Vendicci",patient.getName());
    }

    @Test
    void setName() {
        patient.setName("TEST");
        Assertions.assertEquals("TEST",patient.getName());
    }

    @Test
    void getDiagnosis() {
        Assertions.assertEquals("Insomnia",patient.getDiagnosis());
    }

    @Test
    void setDiagnosis() {
        patient.setDiagnosis("TEST");
        Assertions.assertEquals("TEST",patient.getDiagnosis());
    }

    @Test
    void getGender() {
        Assertions.assertEquals("female",patient.getGender());
    }

    @Test
    void setGender() {
        patient.setGender("TEST");
        Assertions.assertEquals("TEST",patient.getGender());
    }

    @Test
    void getHeight() {
        Assertions.assertEquals(167.8,patient.getHeight());
    }

    @Test
    void setHeight() {
        patient.setHeight(178.5);
        Assertions.assertEquals(178.5,patient.getHeight());
    }

    @Test
    void getWeight() {
        Assertions.assertEquals(85,patient.getWeight());
    }

    @Test
    void setWeight() {
        patient.setWeight(86.5);
        Assertions.assertEquals(86.5,patient.getWeight());
    }
}