package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "Mariam.jalal@gmail.com",
                    LocalDate.of(2000, 01, 01)
            );
            Student Alex = new Student(
                    "Alex",
                    "Alex.jalal@gmail.com",
                    LocalDate.of(2001, 01, 01)
            );
            repository.saveAll(
                    List.of(mariam,Alex)
            );
        };
    }
}
