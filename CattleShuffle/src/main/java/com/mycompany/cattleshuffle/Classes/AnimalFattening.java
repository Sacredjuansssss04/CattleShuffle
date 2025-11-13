package com.mycompany.cattleshuffle.Classes;

public class AnimalFattening extends Animal{
    private double initialWeight;
    private double finalWeight;
    private String arrivalDate;

    public AnimalFattening(double initialWeight, double finalWeight, String arrivalDate, String tag, String type, int age, String vaccine, String vaccineDate, String species) {
        super(tag, type, age, vaccine, vaccineDate, species);
        this.initialWeight = initialWeight;
        this.finalWeight = finalWeight;
        this.arrivalDate = arrivalDate;
    }

    public double getInitialWeight() {
        return this.initialWeight;
    }

    public double getFinalWeight() {
        return this.finalWeight;
    }

    public String getArrivalDate() {
        return this.arrivalDate;
    }

    public void setInitialWeight(double initialWeight) {
        this.initialWeight = initialWeight;
    }

    public void setFinalWeight(double finalWeight) {
        this.finalWeight = finalWeight;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Peso: " + this.initialWeight + ".\n";
    }
}
