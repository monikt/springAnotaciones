package com.anotaciones.anotaciones.dueno;

import org.springframework.stereotype.Component;

@Component
public class Propietario {
    
    private String name;
    private String dirrecion;
    private int edad;

    
    public Propietario() {}

    public Propietario(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirrecion() {
        return this.dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}