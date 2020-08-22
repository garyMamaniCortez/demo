package org.scesi.demo.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByCorreoAndPassword(String correo,String password);
}