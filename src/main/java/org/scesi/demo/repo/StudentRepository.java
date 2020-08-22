package org.scesi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import org.scesi.demo.clases.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByCorreoAndPassword(String correo,String password);
}