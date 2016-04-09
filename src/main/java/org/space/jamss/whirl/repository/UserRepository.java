package org.space.jamss.whirl.repository;

import org.space.jamss.whirl.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {}
