package com.hotel.booking.controller;

import com.hotel.booking.dto.UserDTO;
import com.hotel.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> allUser(){
        List<UserDTO> user = userService.allUser();
        return new ResponseEntity<List<UserDTO>>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO user) {
        userService.addUser( user );
        return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
    }
}
