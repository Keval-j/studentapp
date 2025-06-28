package com.example.studentapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentapp.Repository.StudentRepository;
import com.example.studentapp.entity.Student;

import org.springframework.transaction.annotation.Transactional;
@Service

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional // 👈 Add this line
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    // @Transactional
    // public static Student getStudentById(int id) {
    //     return studentRepository.getStudentById(id);
    // }
    // @Transactional
    // public void createStudent(Student student) {
    //     studentRepository.insertstudent(student.getName(), student.getEmail());
    // }
    // @Transactional
    // public void updateUser(Student student) {
    //     studentRepository.updateStudent(student.getId(), student.getName(), student.getEmail());
    // }
    // @Transactional
    // public void deleteStudent(int id) {
    //     studentRepository.deleteStudent(id);
    // }
}
