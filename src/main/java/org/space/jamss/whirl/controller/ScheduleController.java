package org.space.jamss.whirl.controller;

import org.space.jamss.whirl.dao.ScheduleDAO;
import org.space.jamss.whirl.dto.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value = "/schedules")
public class ScheduleController {

  private final ScheduleDAO scheduleDAO;

  @Autowired
  public ScheduleController(ScheduleDAO scheduleDAO) {
    this.scheduleDAO = scheduleDAO;
  }

  @RequestMapping(value = "/{scheduleID}", method = RequestMethod.GET)
  public Schedule getUser(@PathVariable Integer scheduleID) {
    return scheduleDAO.getScheduleByID(scheduleID);
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public Iterable<Schedule> getSchedules() {
    return scheduleDAO.listSchedules();
  }
}
