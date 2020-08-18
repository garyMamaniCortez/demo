package org.scesi.demo.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "subjectss")
public interface SubjectsRepository extends JpaRepository<Subjects, SubjectsPK> {
}