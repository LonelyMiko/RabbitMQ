package Cedacri.Advanced;

public class Doctor {
    private int ID;
    private int age;
    private int experience;

    private String name;

    DoctorTypes doctorType;

    public Doctor(int ID, int age, int experience, String name, DoctorTypes doctorType) {
        this.ID = ID;
        this.age = age;
        this.experience = experience;
        this.name = name;
        this.doctorType = doctorType;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DoctorTypes getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(DoctorTypes doctorType) {
        this.doctorType = doctorType;
    }
}
