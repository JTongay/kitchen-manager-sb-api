package com.jtongay.kitchenmanager.services;

import com.jtongay.kitchenmanager.models.User;
import com.jtongay.kitchenmanager.repositories.UserRepository;
import com.jtongay.kitchenmanager.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> findAll() {
    return userRepository.findAll();
  }

  public void save(User user) {
    userRepository.save(user);
  }
}
