package com.example.dataexplorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.dataexplorer"})
public class DataExplorerApplication {

    public static void main (String[] args) {
        SpringApplication.run(DataExplorerApplication.class, args);
    }

}
