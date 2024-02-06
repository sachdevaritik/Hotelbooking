package com.hotel.booking.controller;

import com.hotel.booking.dto.HotelDTO;
import com.hotel.booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping( "/all")
    public ResponseEntity<List<HotelDTO>> allHotel(){
        List<HotelDTO> hotel = hotelService.allHotel();
        return new ResponseEntity<List<HotelDTO>>(hotel, HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<HotelDTO> addHotel( @RequestBody HotelDTO hotel ){
        hotelService.addHotel( hotel );
        return new ResponseEntity<HotelDTO>(hotel, HttpStatus.OK);
    }
}
