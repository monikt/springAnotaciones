package com.anotaciones.anotaciones.animales;

public class Guepardo extends Felino{

    private ReservaNatural reservaNatural;

    public Guepardo(ReservaNatural reservaNatural) {
        this.reservaNatural = reservaNatural;
    }

    @Override
    public String saltarAlto() {
        return "El guepardo salta no tan bajo";
    }
}
