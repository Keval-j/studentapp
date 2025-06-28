package com.example.studentapp.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.studentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Procedure(name = "Student.getAllStudents")
    List<Student> getAllStudents();

    

}
