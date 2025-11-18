package com.mycompany.cattleshuffle.Classes;
import java.util.*;

public class AnimalProducer extends Animal{
    private String producto;
    private int numProducido;
    private List<String> fechaProdicido;
    
    public AnimalProducer(String producto, int numProducido, List<String> fechaProdicido, String tag, String type, String vaccine, String vaccineDate, int age, String species, double weight) {
        super(tag, type, age, vaccine, vaccineDate, species, weight);
        this.producto = producto;
        this.numProducido = numProducido;
        this.fechaProdicido = fechaProdicido;
    }
    


    public String getProducto() {
        return this.producto;
    }

    public int getNumProducido() {
        return this.numProducido;
    }

    public List<String> getFechaProdicido() {
        return this.fechaProdicido;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setNumProducido(int numProducido) {
        this.numProducido = numProducido;
    }

    public void setFechaProdicido(List<String> fechaProdicido) {
        this.fechaProdicido = fechaProdicido;
    }
    
}
