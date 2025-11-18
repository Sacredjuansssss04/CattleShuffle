package com.mycompany.cattleshuffle.Classes;

public abstract class Animal {
    
    private String tag;
    private String type;
    private int age;
    private String vaccine;
    private String vaccineDate;
    private String species;
    private String name;
    private double weight;

    public Animal(String tag, String type, int age, String vaccine, String vaccineDate, String species, double weight) {
        this.tag = tag;
        this.type = type;
        this.age = age;
        this.vaccine = vaccine;
        this.vaccineDate = vaccineDate;
        this.species = species;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getTag() {
        return this.tag;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    public String getVaccine() {
        return this.vaccine;
    }

    public String getVaccineDate() {
        return this.vaccineDate;
    }

    public String getSpecies() {
        return this.species;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public void setVaccineDate(String vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString(){
        return "Especie: " + this.species + ".\n" +
                "Tipo: " + this.type + ".\n" +
                "Etiqueta: " + this.tag + ".\n" +
                "Edad: " + this.age + ".\n" +
                "Vacuna: " + this.vaccine + ".\n" +
                "Fecha de Vacunación: " + this.vaccineDate + ".\n";
    }
}
