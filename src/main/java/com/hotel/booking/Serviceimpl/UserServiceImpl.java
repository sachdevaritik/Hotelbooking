package com.hotel.booking.Serviceimpl;

import com.hotel.booking.dto.HotelDTO;
import com.hotel.booking.dto.UserDTO;
import com.hotel.booking.entity.Hotel;
import com.hotel.booking.entity.User;
import com.hotel.booking.repository.UserRepository;
import com.hotel.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser( UserDTO user) {
        userRepository.save(user.dtoToUser(user ));
    }

    @Override
    public List<UserDTO> allUser(){
        List<UserDTO> userDTOS = new ArrayList<>();

        List<User> users = userRepository.findAll();
        for(User x:users){
            userDTOS.add(x.userToDTo(x));
        }
        return userDTOS;
    }
}
