package com.generico.app.tienda.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TiendaServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaServicioProductosApplication.class, args);
	}

}
