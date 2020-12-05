package com.example.spring;
public class Hello {
    private String nume;

    public void printHello() {
        System.out.println("Bun venit " + nume + "!");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}

