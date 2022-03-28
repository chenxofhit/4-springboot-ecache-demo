package com.hnust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringBootEcacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEcacheDemoApplication.class, args);
    }

}
