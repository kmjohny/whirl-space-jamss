package org.space.jamss.whirl.controller;

import org.space.jamss.whirl.dao.ExhibitDAO;
import org.space.jamss.whirl.dto.Exhibit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value = "/exhibits")
public class ExhibitController {

  private final ExhibitDAO exhibitDAO;

  @Autowired
  public ExhibitController(ExhibitDAO exhibitDAO) {
    this.exhibitDAO = exhibitDAO;
  }

  @RequestMapping(value = "/{exhibitID}", method = RequestMethod.GET)
  public Exhibit getUser(@PathVariable Integer exhibitID) {
    return exhibitDAO.getExhibitByID(exhibitID);
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public Iterable<Exhibit> getExhibits() {
    return exhibitDAO.listExhibits();
  }
}
