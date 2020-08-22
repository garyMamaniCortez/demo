package org.scesi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.scesi.demo.clases.Period;

@RepositoryRestResource(path = "period")
public interface PeriodRepository extends JpaRepository<Period, Long> {
}