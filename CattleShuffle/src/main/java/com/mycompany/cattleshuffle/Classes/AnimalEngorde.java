package com.mycompany.cattleshuffle.Classes;

public class AnimalEngorde extends Animal{
    private double weight;

    public AnimalEngorde(double weight, String tag, String type, int age, String vaccine, String vaccineDate, String species) {
        super(tag, type, age, vaccine, vaccineDate, species);
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString(){
        return super.toString() +
                "Peso: " + this.weight + ".\n";
    }
}
