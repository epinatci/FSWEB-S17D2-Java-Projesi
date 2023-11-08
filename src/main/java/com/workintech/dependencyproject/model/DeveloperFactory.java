package com.workintech.dependencyproject.model;

import com.workintech.dependencyproject.tax.Taxable;

public class DeveloperFactory {

    public static Developer createDeveloper(Developer developer, Taxable taxable){
        Developer savedDeveloper = null;
        if(developer.getExperiance().name().equalsIgnoreCase("junior")){
            savedDeveloper = new JuniorDeveloper(developer.getId(), developer.getName(),
                    developer.getSalary() - (developer.getSalary()*taxable.getSimpleTaxRate()));
        } else if(developer.getExperiance().name().equalsIgnoreCase("mid")){
            savedDeveloper = new MidDeveloper(developer.getId(), developer.getName(),
                    developer.getSalary() - (developer.getSalary()*taxable.getMiddleTaxRate()));
        } else if(developer.getExperiance().name().equalsIgnoreCase("senior")){
            savedDeveloper = new SeniorDeveloper(developer.getId(), developer.getName(),
                    developer.getSalary() - (developer.getSalary()*taxable.getUpperTaxRate()));
        }
        return savedDeveloper;
    }

}