package com.generico.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableFeignClients
@SpringBootApplication
public class TiendaServicioItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaServicioItemApplication.class, args);
    }

}
