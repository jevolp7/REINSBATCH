package com.sli.reinsu.batch.listeners;


import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class ListenersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListenersApplication.class, args);
    }

}
