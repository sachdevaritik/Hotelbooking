package com.hotel.booking.entity;

import com.hotel.booking.dto.HotelDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer hotelID;
    private String hotelCity;

    private String hotelAddress;
    private String hotelName;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    private double rating;
    private String review;

    public Integer getHotelID() {
        return hotelID;
    }

    public void setHotelID(Integer hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


    @Override
    public String toString(){
        return "Hotel [ hotelD=" + hotelID + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
                + ", hotelCity=" + hotelCity + ", rating=" + rating + ", review=" + review + "]";
    }

    public Hotel() {
        super();
    }

    public Hotel(Integer hotelID, String hotelCity, String hotelAddress, String hotelName, double rating, String review) {
        super();
        this.hotelID = hotelID;
        this.hotelCity = hotelCity;
        this.hotelAddress = hotelAddress;
        this.hotelName = hotelName;
        this.rating = rating;
        this.review = review;
    }

    public HotelDTO hotelToDTO(Hotel hotel ){
        HotelDTO hotelDTO = new HotelDTO();
        hotelDTO.setHotelAddress( hotel.getHotelAddress() );
        hotelDTO.setHotelCity( hotel.getHotelCity() );
        hotelDTO.setHotelName( hotel.getHotelName() );
        hotelDTO.setHotelID( hotel.getHotelID() );
        hotelDTO.setReview( hotel.getReview() );
        hotelDTO.setRating( hotel.getRating() );
        return hotelDTO;
    }
}
