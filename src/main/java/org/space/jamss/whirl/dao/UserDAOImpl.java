package org.space.jamss.whirl.dao;

import org.space.jamss.whirl.dto.User;
import org.space.jamss.whirl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl implements UserDAO {
  private final UserRepository userRepository;

  @Autowired
  public UserDAOImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Iterable<User> listUsers() {
    return userRepository.findAll();
  }

  @Override
  public User getUserByID(String userID) {
    return userRepository.findOne(userID);
  }

  @Override
  public User saveUser(User user) {
    return userRepository.save(user);
  }

}
