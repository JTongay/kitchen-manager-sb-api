package com.jtongay.kitchenmanager.api.dto;

import com.jtongay.kitchenmanager.models.User;

public class UserDto {
  private final String username;
  private final String email;
  private final Long id;

  public UserDto(User user) {
    this.username = user.getUsername();
    this.email = user.getEmail();
    this.id = user.getId();
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public Long getId() {
    return id;
  }
}
