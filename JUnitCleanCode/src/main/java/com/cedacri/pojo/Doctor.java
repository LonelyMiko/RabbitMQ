package com.cedacri.pojo;


import javax.persistence.Id;



public class Doctor {


        @Id
        private int ID;

        private int age;
        private int experience;

        private String name;
        private String doctorType;


        public Doctor() {
        }

        public Doctor(int ID, int age, int experience, String name, String doctorType) {
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

        public String getDoctorType() {
            return doctorType;
        }

        public void setDoctorType(String doctorType) {
            this.doctorType = doctorType;
        }

    @Override
    public String toString() {
        return "Doctor{" +
                "ID=" + ID +
                ", age=" + age +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", doctorType='" + doctorType + '\'' +
                '}';
    }
}
