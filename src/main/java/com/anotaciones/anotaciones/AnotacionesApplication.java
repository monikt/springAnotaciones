package com.anotaciones.anotaciones;

import com.anotaciones.anotaciones.animales.Gato;
import com.anotaciones.anotaciones.animales.Leopardo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnotacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnotacionesApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(AnotacionesApplication.class, args);
		/*Felino felino = applicationContext.getBean("gato", Gato.class);*/
		Gato gato  = applicationContext.getBean("gato", Gato.class);
		gato.getObjpropietario().setName("Monica C");
		gato.objJuguete.setNombreJuguete("pelota de ule");
		System.out.println(gato.saltarAlto());
		System.out.println(gato.getObjpropietario().getName());
		System.out.println("***************************inyeccion field***************************");
		System.out.println(gato.objJuguete.getNombreJuguete());
		System.out.println("***************************inyeccion setter***************************");
		Leopardo leopardo = applicationContext.getBean("leopardo",Leopardo.class);
		System.out.println(leopardo.getReservaNatural().comoIngresarAreserva());
                
	



	}

}
