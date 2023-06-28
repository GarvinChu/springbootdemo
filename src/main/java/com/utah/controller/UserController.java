package com.utah.controller;

import com.utah.dto.UserBean4Create;
import com.utah.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @PostMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createUser(@RequestBody UserBean4Create request) {
        userService.save(request);
    }
}
