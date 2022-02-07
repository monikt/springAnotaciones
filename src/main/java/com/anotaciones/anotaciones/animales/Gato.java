package com.anotaciones.anotaciones.animales;

import com.anotaciones.anotaciones.comida.Alimentar;
import com.anotaciones.anotaciones.dueno.Propietario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("gato")
@Scope("prototype")
public class Gato extends Felino {

    private Propietario objpropietario;
    @Autowired
    public Juguete objJuguete;
    @Autowired
    @Qualifier("alimentarGato")
    private Alimentar alimentarGato;
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

    public Alimentar getAlimentarGato() {
        return alimentarGato;
    }



}