package com.anotaciones.anotaciones.comida;

import java.util.List;

import com.anotaciones.anotaciones.animales.Felino;
import com.anotaciones.anotaciones.animales.Gato;
import com.anotaciones.anotaciones.animales.Leopardo;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AlimentarGato implements Alimentar {

    @Override
    public void alimentarAnimales(List<Felino> listaFelinos) {

        Comparator<Felino> nameComparator = (h1, h2) -> h1.getTipo().compareTo(h2.getTipo());
        listaFelinos.stream().sorted(nameComparator)
                .collect(Collectors.toList()).forEach(f1 -> {
            if (f1 instanceof Gato) {
                System.out.println("Se alimento al gato");
            }
            if (f1 instanceof Leopardo) {
                System.out.println("Se alimento al Leopardo");
            }

        });

    }

}
