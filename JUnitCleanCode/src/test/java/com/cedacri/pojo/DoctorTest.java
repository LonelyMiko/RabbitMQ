package com.cedacri.pojo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DoctorTest {
    Doctor doctor;

    @BeforeEach
    void setup()
    {
        doctor = new Doctor(4,45,15, "Test Doc","PATHOLOGISTS");
    }

    @Test
    void getID() {
        Assertions.assertEquals(4,doctor.getID());
    }

    @Test
    void setID() {
        doctor.setID(5);
        Assertions.assertEquals(5,doctor.getID());
    }

    @Test
    void getAge() {
        Assertions.assertEquals(45,doctor.getAge());
    }

    @Test
    void setAge() {
        doctor.setAge(50);
        Assertions.assertEquals(50,doctor.getAge());
    }

    @Test
    void getExperience() {
        Assertions.assertEquals(15,doctor.getExperience());
    }

    @Test
    void setExperience() {
        doctor.setExperience(7);
        Assertions.assertEquals(7,doctor.getExperience());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Test Doc",doctor.getName());
    }

    @Test
    void setName() {
        doctor.setName("TEST");
        Assertions.assertEquals("TEST",doctor.getName());
    }

    @Test
    void getDoctorType() {
        Assertions.assertEquals("PATHOLOGISTS",doctor.getDoctorType());
    }

    @Test
    void setDoctorType() {
        doctor.setDoctorType("TEST");
        Assertions.assertEquals("TEST",doctor.getDoctorType());
    }
}