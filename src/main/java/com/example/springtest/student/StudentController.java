package com.example.springtest.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/api/v1/student")
public class StudentController {

   @GetMapping
    public List<Student> getStudents() {
      List<Student> studentList = new ArrayList<Student>();
      studentList.add(new Student(1L, "Mariam", "mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 15), 22));
      studentList.add(new Student(2L, "Dirk", "dirk@gmail.com", LocalDate.of(1998, Month.JULY, 16), 24));
      return studentList;
      
   }
   
}
