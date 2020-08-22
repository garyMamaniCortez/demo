package org.scesi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import org.scesi.demo.clases.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, String> {
    List<Subject> findBySemester(String semester);
}