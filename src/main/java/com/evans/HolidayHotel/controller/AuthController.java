package com.evans.HolidayHotel.controller;

import com.evans.HolidayHotel.dto.LoginRequest;
import com.evans.HolidayHotel.dto.Response;
import com.evans.HolidayHotel.entity.User;
import com.evans.HolidayHotel.service.interfac.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody User user){
        System.out.println("Register is working");
        Response response = userService.register(user);
        System.out.println("Registered Successfully!");
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginRequest loginRequest) {
        Response response = userService.login(loginRequest);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
}
