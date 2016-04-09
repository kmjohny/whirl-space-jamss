package org.space.jamss.whirl.dao;

import org.space.jamss.whirl.dto.Schedule;
import org.space.jamss.whirl.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleDAOImpl implements ScheduleDAO {
  private final ScheduleRepository scheduleRepository;

  @Autowired
  public ScheduleDAOImpl(ScheduleRepository scheduleRepository) {
    this.scheduleRepository = scheduleRepository;
  }

  @Override
  public Iterable<Schedule> listSchedules() {
    return scheduleRepository.findAll();
  }

  @Override
  public Schedule getScheduleByID(Integer scheduleID) {
    return scheduleRepository.findOne(scheduleID);
  }

  @Override
  public Schedule saveSchedule(Schedule schedule) {
    return scheduleRepository.save(schedule);
  }
}
