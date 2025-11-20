package com.mycompany.cattleshuffle.Classes;
import java.util.*;

public class AnimalBreeder extends Animal{
    private int numBaby;
    private List<String> babyDate;

    public AnimalBreeder(int numCrias, String fechaCrias, String tag, String type, int age, String vaccine, String vaccineDate, String species, double weight) {
        super(tag, age, species, weight);
        this.numBaby = numCrias;
        
        if(this.babyDate == null) {
        this.babyDate = new ArrayList<>();
        }
        this.babyDate.add(fechaCrias);
    }
    
    public int getNumBaby() {
        return this.numBaby;
    }

    public List<String> getBabyDate() {
        return this.babyDate;
    }

    public void setNumBaby(int numBaby) {
        this.numBaby = numBaby;
    }

    public void setBabyDate(List<String> babyDate) {
        this.babyDate = babyDate;
    }


}
