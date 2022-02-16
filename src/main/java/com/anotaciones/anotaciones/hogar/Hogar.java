package com.anotaciones.anotaciones.hogar;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Hogar {
    private String nombre;
    private String ubicacion;

    @PostConstruct
public void init () {
        this.nombre = "" ;
        this.ubicacion = "";
    }


    @PreDestroy
    public void end () {
        this.nombre = "" ;
        this.ubicacion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
