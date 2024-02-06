package com.hotel.booking.service;

import com.hotel.booking.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> allUser();
    void addUser( UserDTO user);
}
