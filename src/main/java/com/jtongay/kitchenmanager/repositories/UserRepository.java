package com.jtongay.kitchenmanager.repositories;

import com.jtongay.kitchenmanager.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository {
  List<User> findAll();

  void save(User user);

  Optional<User> findById(String id);

  Optional<User> findByUsername(String username);
}
