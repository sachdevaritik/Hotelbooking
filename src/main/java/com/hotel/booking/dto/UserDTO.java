package com.hotel.booking.dto;

import com.hotel.booking.entity.User;

public class UserDTO {
    private Integer userID;
    private String userName;
    private String emailId;
    private String phone;
    private String password;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "UserDTO [ userID=" + userID + ", userName=" + userName + ", useremailID=" + emailId
                + ", phoneNo=" + phone + ", password=" + password + "]";
    }

    public UserDTO(Integer userID, String userName, String emailId, String phone, String password) {
        super();
        this.userID = userID;
        this.userName = userName;
        this.emailId = emailId;
        this.phone = phone;
        this.password = password;
    }

    public UserDTO() {
        super();
    }

    public User dtoToUser(UserDTO userDTO ){
        User user = new User();
        user.setEmailId( userDTO.getEmailId() );
        user.setUserName( userDTO.getUserName() );
        user.setPassword( userDTO.getPassword() );
        user.setPhone( userDTO.getPhone() );
        user.setUserID( userDTO.getUserID() );
        return user;
    }
}
