package com.anotaciones.anotaciones.animales;

import org.springframework.stereotype.Component;

@Component
public class ReservaNatural {
    private String nombreReserva;
    private String ubicacion;

    public String comoIngresarAreserva(){

        return "para ingresar a la reserva debe indicar la clave miau";
    }

}