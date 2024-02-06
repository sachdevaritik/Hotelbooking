package com.hotel.booking.dto;

import com.hotel.booking.entity.Hotel;

public class HotelDTO {

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
        return "HotelDTO [ hotelD=" + hotelID + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
                + ", hotelCity=" + hotelCity + ", rating=" + rating + ", review=" + review + "]";
    }

    public HotelDTO() {
        super();
    }

    public HotelDTO(Integer hotelID, String hotelCity, String hotelAddress, String hotelName, double rating, String review) {
        super();
        this.hotelID = hotelID;
        this.hotelCity = hotelCity;
        this.hotelAddress = hotelAddress;
        this.hotelName = hotelName;
        this.rating = rating;
        this.review = review;
    }

    public Hotel dtoToHotel(HotelDTO hotelDTO ){
        Hotel hotel = new Hotel();
        hotel.setHotelAddress( hotelDTO.getHotelAddress() );
        hotel.setHotelCity( hotelDTO.getHotelCity() );
        hotel.setHotelName( hotelDTO.getHotelName() );
        hotel.setHotelID( hotelDTO.getHotelID() );
        hotel.setReview( hotelDTO.getReview() );
        hotel.setRating( hotelDTO.getRating() );
        return hotel;
    }
}
