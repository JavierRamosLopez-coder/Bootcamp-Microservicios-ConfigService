package com.everis.bootcamp.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
/**
 * Clase ConfigserviceApplication
 * @author jramlope
 *
 */
public class ConfigserviceApplication {

	/**
	 * Método main, encargado de lanzar la aplicación
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigserviceApplication.class, args);
	}

}
