package com.jtongay.kitchenmanager.services.interfaces;

import com.jtongay.kitchenmanager.models.User;

import java.util.List;

public interface UserService {
  Iterable<User> findAll();

  void save(User user);
}
