package com.hotel.booking.service;
import com.hotel.booking.dto.BookingDTO;
import java.util.List;

public interface BookingService {

    List<BookingDTO> allBooking();
    BookingDTO hotelBooking(Integer id, BookingDTO book);

    void cancelHotelBooking(Integer id, Integer bId);
}
