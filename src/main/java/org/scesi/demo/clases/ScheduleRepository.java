package org.scesi.demo.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "schedules")
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}