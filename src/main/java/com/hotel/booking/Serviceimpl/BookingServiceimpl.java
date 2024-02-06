package com.hotel.booking.Serviceimpl;

import com.hotel.booking.dto.BookingDTO;
import com.hotel.booking.entity.Booking;
import com.hotel.booking.exception.UserNotFoundException;
import com.hotel.booking.repository.BookingRepository;
import com.hotel.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingServiceimpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
    private static Integer uid;

    @Override
    public List<BookingDTO> allBooking( ){

        List<Booking> bookings = bookingRepository.findAll();
        List<BookingDTO> b = new ArrayList<>();
        for(Booking x:bookings){
            b.add(x.bookingToDTO(x));
        }
        return b;
    }

    @Override
    public BookingDTO hotelBooking(Integer id,BookingDTO book){
        if(book.getUserID()!=null){
            Booking booking = new Booking();
            booking = book.dtoToBooking(book);
            booking.setHotelID(id);
            booking.setUserID(book.getUserID());

            bookingRepository.save(booking);
            return booking.bookingToDTO(booking);
        } else{
            throw new UserNotFoundException("User Id cannnot be null");
        }

    }

    @Override
    public void cancelHotelBooking( Integer id, Integer bId){
        if(id!=null){
            List<Booking> booking  = bookingRepository.findByUserID(id);
            for(Booking x:booking){
                if(x.getBookingID().equals(bId)){
                    x.setStatus("Cancelled");
                }
                bookingRepository.save(x);
            }
        } else{
            throw new UserNotFoundException("No entry found for user");
        }
    }
}
