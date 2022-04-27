package com.example.springtest.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table
public class Student {
   @Id
   @SequenceGenerator(
         name = "student_sequence",
         sequenceName = "student_sequence",
         allocationSize = 1)
   @GeneratedValue(
         strategy = GenerationType.SEQUENCE,
         generator = "student_sequence"
         )
   private Long id;
   private String name;
   private String email;
   private LocalDate dob;
   @Transient
   @Getter(AccessLevel.NONE)
   private Integer age;
   
   public Student(Long id, String name, String email, LocalDate dob) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.dob = dob;
   }
   
   public Student(String name, String email, LocalDate dob) {
      this.name = name;
      this.email = email;
      this.dob = dob;
   }
   
   public Integer getAge() {
      return Period.between(this.dob, LocalDate.now()).getYears();
   }
   
}
