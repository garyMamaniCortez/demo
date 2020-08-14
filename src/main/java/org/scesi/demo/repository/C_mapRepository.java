package org.scesi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "C_maps")
public interface C_mapRepository extends JpaRepository<C_map, Long> {
}