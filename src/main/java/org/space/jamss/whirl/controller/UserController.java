package org.space.jamss.whirl.controller;

import org.space.jamss.whirl.dao.UserDAO;
import org.space.jamss.whirl.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value = "/users")
public class UserController {

  private final UserDAO userDAO;

  @Autowired
  public UserController(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @RequestMapping(value = "/{userID}", method = RequestMethod.GET)
  public User getUser(@PathVariable String userID) {
    return userDAO.getUserByID(userID);
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public Iterable<User> getUsers() {
    return userDAO.listUsers();
  }
}
