package com.cedacri.pojo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DiagnosisTest {
    Diagnosis diagnosis;
    @BeforeEach
    void setup()
    {
       diagnosis = new Diagnosis("Arthritis","PODIATRISTS");
    }

    @Test
    void getDiagnosisName() {
        Assertions.assertEquals("Arthritis",diagnosis.getDiagnosisName());
    }

    @Test
    void setDiagnosisName() {
        diagnosis.setDiagnosisName("TEST");
        Assertions.assertEquals("TEST",diagnosis.getDiagnosisName());
    }

    @Test
    void getDoctorType() {
        Assertions.assertEquals("PODIATRISTS",diagnosis.getDoctorType());
    }

    @Test
    void setDoctorType() {
        diagnosis.setDoctorType("TEST");
        Assertions.assertEquals("TEST",diagnosis.getDoctorType());
    }
}