package org.scesi.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "teachers")
public interface TeachersRepository extends JpaRepository<Teacher, String> {
}