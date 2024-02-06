package com.hotel.booking.dto;

import com.hotel.booking.entity.Booking;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;

import java.time.LocalDate;

public class BookingDTO {

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
        return "BookingDTO [ bookingID=" + bookingID + ", hotelID=" + hotelID + ", userID=" + userID
                + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", roomtype=" + roomtype + ", noOfGuest=" + noOfGuest + ", Status="+status+ "]";
    }

    public BookingDTO() {
        super();
    }

    public BookingDTO(Integer bookingID, Integer hotelID, Integer userID, LocalDate checkIn, LocalDate checkOut, String roomtype, String noOfGuest, String status) {
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

    public Booking dtoToBooking( BookingDTO bookingDTO ){
        Booking booking = new Booking();
        booking.setBookingID( bookingDTO.getBookingID() );
        booking.setCheckIn( bookingDTO.getCheckIn() );
        booking.setCheckOut( bookingDTO.getCheckOut() );
        booking.setHotelID( bookingDTO.getHotelID() );
        booking.setUserID( bookingDTO.getUserID() );
        booking.setNoOfGuest( bookingDTO.getNoOfGuest() );
        booking.setRoomtype( bookingDTO.getRoomtype() );
        booking.setStatus( bookingDTO.getStatus() );
        return booking;
    }
}
