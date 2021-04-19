package Cedacri.Advanced;

public class Patient {
    private int age;
    private int doctorID;

    private String name;
    private String doctorName;
    private String diagnosis;
    private String gender;

    private double height;
    private double weight;

    public Patient(int age, String name, String doctorName,
                   String diagnosis, String gender, double height, double weight) {
        this.age = age;
        this.name = name;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
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

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
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
}
