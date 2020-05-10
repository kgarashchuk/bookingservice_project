package com.bookingservice;

import com.bookingservice.models.Booking;
import com.bookingservice.models.Flight;
import com.bookingservice.models.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        User dpinchuk = new User("dpinchuk", "111111", "Dima","Pinchuk",41,"pinchuk.dap@mail.com","380971344443","male",true, "Ukraine");
        System.out.println(dpinchuk.getId());
        System.out.println(dpinchuk);

        User gkostia = new User("gkostia", "111111", "Kostia","Gatashchuk",21,"garashchuk.dap@mail.com","380666501934","male",true, "Ukraine");
        System.out.println(gkostia.getId());
        System.out.println(gkostia);

        //System.out.println(dpinchuk.equals(gkostia));

        Flight flight = new Flight(
                "Kiev - Berlin",
                LocalDate.parse("01-06-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("02-06-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "Kiev",
                "Berlin",
                150,
                1099d,
                true);
        System.out.println( flight.getIdFlight());

        Booking booking = new Booking(gkostia, flight, 2, true);
        System.out.println(booking);

    }

}