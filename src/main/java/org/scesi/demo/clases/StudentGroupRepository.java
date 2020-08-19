package org.scesi.demo.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sg")
public interface StudentGroupRepository extends JpaRepository<StudentGroup, Long> {
}