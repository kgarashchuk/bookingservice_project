package com.bookingservice.models;

public class Booking {
    private final int id;
    private String idBooking;
    private int seats;
    private boolean status;

    public Booking(int id, String idBooking, int seats, boolean status) {
        this.id = id;
        this.idBooking = idBooking;
        this.seats = seats;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
