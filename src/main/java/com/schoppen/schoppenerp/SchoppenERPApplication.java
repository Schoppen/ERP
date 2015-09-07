package com.schoppen.schoppenerp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Clase de arranque de la aplicación. 
 * 	Run as Spring Boot Application
 * 
 * @author Adolfo
 *
 */

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class SchoppenERPApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoppenERPApplication.class, args);
    }
}
