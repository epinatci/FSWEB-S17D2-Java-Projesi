package com.workintech.dependencyproject.model;

public class SeniorDeveloper extends Developer{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary, Experiance.SENIOR);
    }
}
