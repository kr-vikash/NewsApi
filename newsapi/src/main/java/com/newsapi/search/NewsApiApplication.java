package com.newsapi.search;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableAutoConfiguration
@SpringBootApplication
public class NewsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsApiApplication.class, args);

    }
}
