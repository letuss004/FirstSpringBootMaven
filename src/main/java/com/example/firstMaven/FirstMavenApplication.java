package com.example.firstMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstMavenApplication.class, args);
    }

    @RequestMapping
    public String welcome() {
        return "Welcome, this is just a beginning\n" +
                "Goto: localhost:8080/api/student";
    }

}
