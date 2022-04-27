package com.example.springtest.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository is naming convention for anything to accesses our DB
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
