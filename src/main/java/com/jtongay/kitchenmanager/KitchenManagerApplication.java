package com.jtongay.kitchenmanager;

import com.jtongay.kitchenmanager.api.UsersController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jtongay.kitchenmanager")
public class KitchenManagerApplication {

  public static void main(String[] args) {
    SpringApplication.run(KitchenManagerApplication.class, args);
  }

}


