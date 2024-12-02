package org.leorodriguez.springsecurityexample2.service;

import org.leorodriguez.springsecurityexample2.dto.StudentDTO;
import org.leorodriguez.springsecurityexample2.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}

