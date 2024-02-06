package com.hotel.booking.controller;

import com.hotel.booking.dto.BookingDTO;
import com.hotel.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("all")
    public ResponseEntity<List<BookingDTO>> allBooking(){
        List<BookingDTO> bookingDTOS = bookingService.allBooking();
        return new ResponseEntity<List<BookingDTO>>(bookingDTOS, HttpStatus.OK);
    }

    @PostMapping("/{id}/allbooking")
    public ResponseEntity<BookingDTO> hotelBooking(@PathVariable Integer id, @RequestBody BookingDTO booking){
        BookingDTO bookingDTO = bookingService.hotelBooking(id, booking);
        return new ResponseEntity<BookingDTO>(bookingDTO, HttpStatus.OK);
    }

    @PostMapping("/{uid}/cancelbooking/{bId}")
    public HttpStatus cancelHotelBooking(@PathVariable Integer uid, @PathVariable Integer bId){
        bookingService.cancelHotelBooking(uid, bId);
        return HttpStatus.OK;
    }

}
