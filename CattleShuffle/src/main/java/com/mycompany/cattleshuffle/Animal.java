package com.mycompany.cattleshuffle;

public class Animal {
    
    private String etiqueta;
    private String tipo;
    private int edad;
    private String vacunas;
    private String fechavacunas;
    private String especie;

    public Animal(String etiqueta, String tipo, int edad, String vacunas, String fechavacunas, String especie) {
        this.etiqueta = etiqueta;
        this.tipo = tipo;
        this.edad = edad;
        this.vacunas = vacunas;
        this.fechavacunas = fechavacunas;
        this.especie = especie;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public String getVacunas() {
        return vacunas;
    }

    public String getFechavacunas() {
        return fechavacunas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public void setFechavacunas(String fechavacunas) {
        this.fechavacunas = fechavacunas;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
