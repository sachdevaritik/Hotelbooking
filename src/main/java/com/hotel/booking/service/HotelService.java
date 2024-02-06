package com.hotel.booking.service;

import com.hotel.booking.dto.HotelDTO;

import java.util.List;

public interface HotelService {

    List<HotelDTO> allHotel();
    void addHotel( HotelDTO hotel );
}
