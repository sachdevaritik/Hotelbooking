package com.hotel.booking.repository;
import com.hotel.booking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByUserID(Integer Id);
}
