package com.generico.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("clienteRest")
    @LoadBalanced // Para que el cliente rest se comporte como un cliente balanceado
    public RestTemplate registrarRestTemplate(){
        return new RestTemplate();
    }
}
