package com.hotel.booking.Serviceimpl;

import com.hotel.booking.dto.HotelDTO;
import com.hotel.booking.entity.Hotel;
import com.hotel.booking.repository.HotelRepository;
import com.hotel.booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public void addHotel( HotelDTO hotel ){
        hotelRepository.save( hotel.dtoToHotel( hotel ) );
    }

    @Override
    public List<HotelDTO> allHotel(){
        List<HotelDTO> hotelDTOList = new ArrayList<>();

        List<Hotel> hotels = hotelRepository.findAll();

        for(Hotel x:hotels){
            hotelDTOList.add(x.hotelToDTO(x));
        }
        return hotelDTOList;
    }


}
