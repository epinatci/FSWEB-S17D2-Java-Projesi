package com.workintech.dependencyproject.model;

public class Developer {

    private int id;
     private String name;
     private double salary;

     private Experiance experiance;


    public Developer(int id, String name, double salary, Experiance experiance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experiance = experiance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Experiance getExperiance() {
        return experiance;
    }

    public void setExperiance(Experiance experiance) {
        this.experiance = experiance;
    }
}
