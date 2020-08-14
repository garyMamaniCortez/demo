package org.scesi.example.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "classrooms")
public interface ClassroomRepository extends JpaRepository<Classroom, String> {
}