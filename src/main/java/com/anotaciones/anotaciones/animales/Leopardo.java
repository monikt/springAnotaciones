package com.anotaciones.anotaciones.animales;

import org.springframework.stereotype.Component;
/** En esta clase se especificara un bean con un id predeterminado */

@Component
public class Leopardo extends Felino {

    @Override
    public String saltarAlto() {
        return "El leopardo salta alto";
    }
    
}