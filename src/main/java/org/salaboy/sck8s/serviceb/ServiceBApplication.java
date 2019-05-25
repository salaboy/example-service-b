package org.salaboy.sck8s.serviceb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceBApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(ServiceBApplication.class);
    private int count = 0;

    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class,
                args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(" --------- STARTED ---------- ");

    }

    //@TODO: improve return to ASCII ART
    @GetMapping
    public String sayHelloFromB() {
        count++;
        return "Hi there from B: " + count;
    }


}
