package com.anotaciones.anotaciones.animales;

public abstract class Felino {
    
    private String tipo;
    private String tamaño;
    
    public abstract String saltarAlto();
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }


}