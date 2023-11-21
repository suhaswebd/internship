package com.mobile.mobile.controller;

import com.mobile.mobile.entity.User;
import com.mobile.mobile.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {
private UserRepository userrepo;
    @PostMapping("/Adduser")
public ResponseEntity<String>createNewUser(@RequestBody User objuser)
{
    userrepo.save(objuser);
    return new ResponseEntity<>("User saved successfully", HttpStatus.OK);
}
}
