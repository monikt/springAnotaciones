package com.anotaciones.anotaciones.animales;

import org.springframework.stereotype.Component;

@Component
public class Juguete {
    
    private String nombreJuguete;
    

    /**
     * @return String return the nombreJuguete
     */
    public String getNombreJuguete() {
        return nombreJuguete;
    }

    /**
     * @param nombreJuguete the nombreJuguete to set
     */
    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }

}