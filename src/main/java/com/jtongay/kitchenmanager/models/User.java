package com.jtongay.kitchenmanager.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String username;

  private String password;

  private String email;

  @CreationTimestamp
  private LocalDateTime created_at;

  @UpdateTimestamp
  private LocalDateTime updated_at;

  public User() {}

  public User(Long id, String username, String password, String email, LocalDateTime created_at, LocalDateTime updated_at) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.created_at = created_at;
    this.updated_at = updated_at;
  }
}
