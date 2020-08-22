package org.scesi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.scesi.demo.clases.C_map;

@Repository
public interface C_mapRepository extends JpaRepository<C_map, String> {
}