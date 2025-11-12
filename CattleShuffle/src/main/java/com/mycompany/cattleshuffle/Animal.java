package com.mycompany.cattleshuffle;

public class Animal {
    
    private String etiqueta;
    private String tipo;
    private int edad;
    private String vacunas;
    private String fechavacunas;

    public Animal(String etiqueta, String tipo, int edad, String vacunas, String fechavacunas) {
        this.etiqueta = etiqueta;
        this.tipo = tipo;
        this.edad = edad;
        this.vacunas = vacunas;
        this.fechavacunas = fechavacunas;
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
    
}
