package com.cedacri.pojo;

import javax.persistence.Id;

public class Patient {
    @Id
    private int ID;
    private int age;
    private int doctorID;

    private String name;
    private String diagnosis;
    private String gender;

    private double height;
    private double weight;

    public Patient() {
    }

    public Patient(int ID, int age,int doctorID , String name,
                   String diagnosis, String gender, double height, double weight) {
        this.ID = ID;
        this.age = age;
        this.doctorID = doctorID;
        this.name = name;
        this.diagnosis = diagnosis;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID=" + ID +
                ", age=" + age +
                ", doctorID=" + doctorID +
                ", name='" + name + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
