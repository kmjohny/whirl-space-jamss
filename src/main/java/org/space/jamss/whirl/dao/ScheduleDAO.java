package org.space.jamss.whirl.dao;

import org.space.jamss.whirl.dto.Schedule;

public interface ScheduleDAO {
  public Iterable<Schedule> listSchedules();

  public Schedule getScheduleByID(Integer scheduleID);

  public Schedule saveSchedule(Schedule schedule);
}

