package org.scesi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule> {
}