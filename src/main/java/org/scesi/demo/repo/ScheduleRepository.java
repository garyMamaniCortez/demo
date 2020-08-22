package org.scesi.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.scesi.demo.clases.Schedule;
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    Schedule findByGrupo_Idg(Long idg);
}