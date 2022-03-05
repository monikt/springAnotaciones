package com.anotaciones.anotaciones;

import com.anotaciones.anotaciones.animales.Felino;
import com.anotaciones.anotaciones.animales.Gato;
import com.anotaciones.anotaciones.animales.Leopardo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.anotaciones.anotaciones.config.FileSystemConfing;

@SpringBootApplication
public class AnotacionesApplication {
    static Logger applicationContextLogger = Logger.getLogger(AnotacionesApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(AnotacionesApplication.class, args);
		//ApplicationContext applicationContext = SpringApplication.run(AnotacionesApplication.class, args);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnimalConfiguration.class);
        /*Felino felino = applicationContext.getBean("gato", Gato.class);*/
		Gato gato  = applicationContext.getBean("gato", Gato.class);
		gato.getObjpropietario().setName("Monica C");
		gato.objJuguete.setNombreJuguete("pelota de ule");
                gato.setTipo("pequeño");
                gato.setNombre("Sullivan");
                
                Gato gato2  = applicationContext.getBean("gato", Gato.class);
		gato2.getObjpropietario().setName("Sami");
		gato2.objJuguete.setNombreJuguete("pajarito");
                gato2.setTipo("pequeño");
                gato2.setNombre("Boris");
		System.out.println(gato.saltarAlto());
		System.out.println(gato.getObjpropietario().getName());
		System.out.println("***************************inyeccion field***************************");
		System.out.println(gato.objJuguete.getNombreJuguete());
		System.out.println("***************************inyeccion setter***************************");
		Leopardo leopardo = applicationContext.getBean("leopardo",Leopardo.class);
                leopardo.setTipo("grande");
                leopardo.setNombre("luka");
		System.out.println(leopardo.getReservaNatural().comoIngresarAreserva());
                System.out.println("***************************inyeccion Field with @qualifer***************************");
                List<Felino> listaFelinos = new ArrayList<>();
                listaFelinos.add(gato);
                listaFelinos.add(leopardo);
                listaFelinos.add(gato2);
                gato.getAlimentarGato().alimentarAnimales(listaFelinos);
                System.out.println("***************************inyeccion using scope prototype***************************");
                boolean result = (gato == gato2);
                System.out.println("var result: "+result);
                System.out.println("object : "+gato);
                System.out.println("var result: "+gato2);

        applicationContextLogger.fine("***************************inyeccion using configuration filee***************************");
        FileSystemConfing  file  = applicationContext.getBean(FileSystemConfing.class);
        applicationContextLogger.fine("max malue"+ file.getMaxStorage());


	}

}
