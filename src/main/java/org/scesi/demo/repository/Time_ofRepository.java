package org.scesi.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "time_ofs")
public interface Time_ofRepository extends JpaRepository<Time_of, int> {
}