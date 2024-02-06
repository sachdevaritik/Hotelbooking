package com.hotel.booking;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println( "To access all functionality please refer controller");
	}
}
