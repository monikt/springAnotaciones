/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anotaciones.anotaciones.comida;

import com.anotaciones.anotaciones.animales.Felino;
import com.anotaciones.anotaciones.animales.Leopardo;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Monica
 */
public class AlimentarLeopardo implements Alimentar{

    @Override
    public void alimentarAnimales(List<Felino> listaFelinos) {
         Comparator<Felino> nameComparator = (h1, h2) -> h1.getTipo().compareTo(h2.getTipo());
        listaFelinos.stream().sorted(nameComparator)
                .collect(Collectors.toList()).forEach(f1 -> {
            if (f1 instanceof Leopardo) {
                System.out.println("Se alimento al Leopardo");
            }

        });
    }
    
}
