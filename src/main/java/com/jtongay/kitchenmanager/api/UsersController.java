package com.jtongay.kitchenmanager.api;

import com.jtongay.kitchenmanager.api.dto.UserDto;
import com.jtongay.kitchenmanager.models.User;
import com.jtongay.kitchenmanager.services.UserServiceImpl;
import com.jtongay.kitchenmanager.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {

  @Autowired
  private UserServiceImpl userServiceImpl;

  @GetMapping
  public List<UserDto> getAll() {
    return userServiceImpl.findAll().stream().map(UserDto::new).collect(Collectors.toList());
  }

  @PostMapping
  @ResponseStatus(HttpStatus.ACCEPTED)
  public @ResponseBody void save() {
    userServiceImpl.save(new User(123L, "howdy", "password", "something@booyah.com", LocalDateTime.now(), LocalDateTime.now()));
  }
}
