package com.cedacri.pojo;

public class Diagnosis {
    private String diagnosisName;
    private String doctorType;

    public Diagnosis() {
    }

    public Diagnosis(String diagnosisName, String doctorType) {
        this.diagnosisName = diagnosisName;
        this.doctorType = doctorType;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "DiagnosisName='" + diagnosisName + '\'' +
                ", DoctorType='" + doctorType + '\'' +
                '}';
    }
}
