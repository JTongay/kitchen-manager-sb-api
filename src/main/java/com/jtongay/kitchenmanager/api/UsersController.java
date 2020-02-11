package com.jtongay.kitchenmanager.api;

import com.jtongay.kitchenmanager.models.User;
import com.jtongay.kitchenmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
//import java.time.LocalDateTime;
import java.util.List;

@Controller
public class UsersController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {"application/json"})
  @ResponseStatus(HttpStatus.OK)
  public @ResponseBody List<User> getAll() {
    return userService.findAll();
  }

  @RequestMapping(value = "/users", method =  RequestMethod.POST)
  @ResponseStatus(HttpStatus.ACCEPTED)
  public @ResponseBody void save() {
    userService.save(new User(123L, "howdy", "password", "something@booyah.com", LocalDateTime.now(), LocalDateTime.now()));
  }
}
