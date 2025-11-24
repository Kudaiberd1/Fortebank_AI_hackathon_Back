package com.fortebank.AI_Hackathon.controller;

import com.fortebank.AI_Hackathon.DTO.User.UserDto;
import com.fortebank.AI_Hackathon.entities.User;
import com.fortebank.AI_Hackathon.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/authorization")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public void Register(@RequestBody UserDto accountInfo){
        userService.registerUser(accountInfo);
    }

    @PostMapping("/login")
    public ResponseEntity<User> Login(@RequestBody UserDto account){
        User user = userService.loginUser(account);

        return ResponseEntity.ok(user);
    }
}
