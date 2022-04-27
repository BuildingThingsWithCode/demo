package com.example.springtest.student;

import static java.time.Month.AUGUST;
import static java.time.Month.FEBRUARY;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
   
   @Bean
   CommandLineRunner commandLineRunner(StudentRepository repository) {
      return args -> {
         Student mariam = new Student(
               "Mariam",
               "mariam@gmail.com",
               LocalDate.of(2000, FEBRUARY, 12));
         Student alex = new Student("Alex",
               "alex@gmail.com",
               LocalDate.of(2001, AUGUST, 5));
         List<Student> studentList = new ArrayList<>();
         studentList.add(alex);
         studentList.add(mariam);
         repository.saveAll(studentList);
      };
   }

}
