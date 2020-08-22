package org.scesi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import org.scesi.demo.clases.Subject;
import org.scesi.demo.clases.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findBySubjects(Subject subject);
}