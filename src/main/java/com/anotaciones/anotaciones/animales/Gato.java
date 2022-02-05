package com.anotaciones.anotaciones.animales;

import com.anotaciones.anotaciones.dueno.Propietario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gato")
public class Gato extends Felino {

    private Propietario objpropietario;
    @Autowired
    public Juguete objJuguete;

    @Autowired
    public Gato(Propietario objPropietario) {
        this.objpropietario = objPropietario;
    }

    @Override
    public String saltarAlto() {
        return "El gato no salta tan alto";
    }


    public Propietario getObjpropietario() {
        return this.objpropietario;
    }

    public void setObjpropietario(Propietario objpropietario) {
        this.objpropietario = objpropietario;
    }



}