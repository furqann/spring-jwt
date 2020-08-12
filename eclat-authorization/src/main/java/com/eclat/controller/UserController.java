package com.eclat.controller;

import com.eclat.api.UserManagementApi;
import com.eclat.api.model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserManagementApi {

  @Override
  public ResponseEntity<UserModel> findUserById() {
    return ResponseEntity
        .ok(new UserModel().name("Test User").email("test@eclat.com").username("test_user"));
  }

}
