package org.leorodriguez.springsecurityexample2.repository;

import org.leorodriguez.springsecurityexample2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{

    Student findByEmail(String email);
}
