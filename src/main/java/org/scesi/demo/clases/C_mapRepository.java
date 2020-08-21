package org.scesi.demo.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface C_mapRepository extends JpaRepository<C_map, String> {
}