package com.hotel.booking.entity;
import com.hotel.booking.dto.BookingDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer bookingID;

    private  Integer hotelID;
    private  Integer userID;

    private LocalDate checkIn;
    private LocalDate checkOut;

    private String roomtype;
    private String noOfGuest;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public Integer getHotelID() {
        return hotelID;
    }

    public void setHotelID(Integer hotelID) {
        this.hotelID = hotelID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getNoOfGuest() {
        return noOfGuest;
    }

    public void setNoOfGuest(String noOfGuest) {
        this.noOfGuest = noOfGuest;
    }
    @Override
    public String toString(){
        return "Booking [ bookingID=" + bookingID + ", hotelID=" + hotelID + ", userID=" + userID
                + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", roomtype=" + roomtype + ", noOfGuest=" + noOfGuest + "]";
    }

    public Booking() {
        super();
    }

    public Booking(Integer bookingID, Integer hotelID, Integer userID, LocalDate checkIn, LocalDate checkOut, String roomtype, String noOfGuest, String status) {
        super();
        this.bookingID = bookingID;
        this.hotelID = hotelID;
        this.userID = userID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomtype = roomtype;
        this.noOfGuest = noOfGuest;
        this.status= status;
    }

    public BookingDTO bookingToDTO( Booking booking ){
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setBookingID( booking.getBookingID() );
        bookingDTO.setCheckIn( booking.getCheckIn() );
        bookingDTO.setCheckOut( booking.getCheckOut() );
        bookingDTO.setHotelID( booking.getHotelID() );
        bookingDTO.setUserID( booking.getUserID() );
        bookingDTO.setNoOfGuest( booking.getNoOfGuest() );
        bookingDTO.setRoomtype( booking.getRoomtype() );
        bookingDTO.setStatus( booking.getStatus() );
        return bookingDTO;
    }


}
