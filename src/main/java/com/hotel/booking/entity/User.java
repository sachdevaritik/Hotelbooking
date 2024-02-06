package com.hotel.booking.entity;

import com.hotel.booking.dto.UserDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "user_info")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USER_ID")
    private Integer userID;
    private String userName;
    @NotBlank(message = "{email.blank}")
    @Email(message = "{email.format}")
    private String emailId;
    private String phone;
    @NotBlank(message = "{password.blank}")
    @Size(min=5, max=10, message= "{password.format}")
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
        return "User [ userID=" + userID + ", userName=" + userName + ", useremailID=" + emailId
                + ", phoneNo=" + phone + ", password=" + password + "]";
    }

    public User(Integer userID, String userName, String emailId, String phone, String password) {
        super();
        this.userID = userID;
        this.userName = userName;
        this.emailId = emailId;
        this.phone = phone;
        this.password = password;
    }

    public User() {
        super();
    }

    public UserDTO userToDTo(User user ){
        UserDTO userDTO = new UserDTO();
        userDTO.setEmailId( user.getEmailId() );
        userDTO.setUserName( user.getUserName() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setPhone( user.getPhone() );
        userDTO.setUserID( user.getUserID() );
        return userDTO;
    }
}
