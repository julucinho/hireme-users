package com.capitolio.hiremeusers.configs;

import io.github.julucinho.httpclient.HttpRequestStarter;
import io.github.julucinho.httpclient.impl.HttpRequestStarterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfig {

    @Bean
    public HttpRequestStarter httpRequestStarter(){
        return new HttpRequestStarterImpl();
    }

}
