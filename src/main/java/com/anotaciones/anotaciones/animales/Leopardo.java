package com.anotaciones.anotaciones.animales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/** En esta clase se especificara un bean con un id predeterminado */

@Component
public class Leopardo extends Felino {

    private ReservaNatural reservaNatural;
    @Override
    public String saltarAlto() {
        return "El leopardo salta alto";
    }
    @Autowired
    public void setReservaNatural(ReservaNatural reservaNatural) {
       
         this.reservaNatural = reservaNatural;
    }

    public ReservaNatural getReservaNatural(){
        return this.reservaNatural;
    }

    
}