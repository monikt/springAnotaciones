package com.anotaciones.anotaciones;

import com.anotaciones.anotaciones.animales.Felino;
import com.anotaciones.anotaciones.animales.Guepardo;
import com.anotaciones.anotaciones.animales.ReservaNatural;
import com.anotaciones.anotaciones.config.FileSystemConfing;
import com.anotaciones.anotaciones.config.MyLoggerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.anotaciones.anotaciones")
@PropertySource("application.properties")
public class AnimalConfiguration {
    @Bean
    public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
                                         @Value("${printed.logger.level}") String printedLoggerLevel) {

        MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
        return myLoggerConfig;
    }
    @Bean
    public ReservaNatural getReserva(){
        return new ReservaNatural();
    }

    /**
     * Este es un ejemplo de inyección de codigo por medio de constructor
     * @return
     */
    @Bean
    public Felino getGuepardo(){
      return new Guepardo(getReserva());
    }
    @Bean
    public FileSystemConfing getFileSystemConfing (){
        return new FileSystemConfing();
    }

}
