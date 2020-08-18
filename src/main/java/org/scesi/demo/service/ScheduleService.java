package org.scesi.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private PeriodRepository periodRepository;

    @Autowired
    private SchedulePeriodRepository schedulePeriodRepository;

    public Schedule addSchedule(ScheduleDAO scheduleDAO) {
        /*Schedule schedule = new Schedule();
        schedule.setTeacher(scheduleDAO.getTeacher());
        Schedule newSchedule = scheduleRepository.save(schedule);
        ArrayList<PeriodDAO> periods = scheduleDAO.getPeriods();
        for (int i = 0; i < periods.size(); i++) {
            Period period = periodRepository.getOne(periods.get(i).getId());
            SchedulePeriod schedulePeriod = new SchedulePeriod();
            schedulePeriod.setSchedule(newSchedule);
            schedulePeriod.setPeriod(period);
            schedulePeriod.setClassroom(periods.get(i).getClassroom());
            schedulePeriodRepository.save(schedulePeriod);
        }
        return newSchedule;*/
    }
}