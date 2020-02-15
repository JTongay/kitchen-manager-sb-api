package com.jtongay.kitchenmanager.services;

import com.jtongay.kitchenmanager.models.User;
import com.jtongay.kitchenmanager.repositories.UserRepository;
import com.jtongay.kitchenmanager.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> findAll() {
    List<User> users = new LinkedList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

  @Transactional
  public void save(User user) {
    userRepository.save(user);
  }
}
