package org.scesi.example.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "students")
public interface StudentRepository extends JpaRepository<Stundent, String,String> {
}