package org.space.jamss.whirl.dao;

import org.space.jamss.whirl.dto.User;

public interface UserDAO {
  public Iterable<User> listUsers();

  public User getUserByID(String userID);

  public User saveUser(User user);
}

