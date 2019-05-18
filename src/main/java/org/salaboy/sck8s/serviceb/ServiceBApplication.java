package org.salaboy.sck8s.serviceb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceBApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class,
                args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" --------- STARTED ---------- ");

    }

    @GetMapping
    public String sayHello() {
        return "Hi there from service B";
    }


}
