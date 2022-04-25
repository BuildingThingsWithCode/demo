package com.example.springtest.student;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
   private Long id;
   private String name;
   private String email;
   private LocalDate dob;
   private Integer age;
   
   public Student(String name, String email, LocalDate dob, Integer age) {
      this.name = name;
      this.email = email;
      this.dob = dob;
      this.age = age;
   }
 
}
