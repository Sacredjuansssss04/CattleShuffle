package com.mycompany.cattleshuffle.Classes;
import java.util.*;
import java.util.ArrayList;

public class AnimalProducer extends Animal{
    private String producto;
    private int numProducido;
    private List<String> fechaProducido;
    
    public AnimalProducer(String producto, String tag, int age, String species, double weight) {
        super(tag, age, species, weight);
        this.producto = producto;
        this.numProducido = 0;
        
        this.fechaProducido = new ArrayList<>();
    }
    


    public String getProducto() {
        return this.producto;
    }

    public int getNumProducido() {
        return this.numProducido;
    }

    public List<String> getFechaProducido() {
        if (this.fechaProducido == null) {
            this.fechaProducido = new ArrayList<>();
        }
        return this.fechaProducido;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setNumProducido(int numProducido) {
        this.numProducido = numProducido;
    }

    public void setFechaProducido(List<String> fechaProducido) {
        this.fechaProducido = fechaProducido;
    }
    
    public void registrarProduccion(int cantidad, String fecha) {
        this.numProducido += cantidad;        
        this.fechaProducido.add(fecha);       
    }
    
    @Override
    public String toString() {
        return "ID: " + getTag() +
               "\nProducto: " + producto +
               "\nTotal producido: " + numProducido +
               "\nFechas: " + fechaProducido;
    }
    
}
