package com.hotel.booking.repository;
import com.hotel.booking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepository  extends JpaRepository<User, Integer>{
//    List<User> findByEmailId(String emailid);
}
