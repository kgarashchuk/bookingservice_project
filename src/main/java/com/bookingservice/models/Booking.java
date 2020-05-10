package com.bookingservice.models;

public class Booking {
    private static int counter = 0;
    private final int id;
    private final String idBooking;
    private final User user;
    private Flight flight;
    private int seats;
    private double cost;
    private boolean status;

    public Booking(User user, Flight flight, int seats, boolean status) {
        this.id = ++counter;
        this.idBooking = id + "-" + this.hashCode() + "B";
        this.user = user;
        this.flight = flight;
        this.seats = seats;
        this.cost = flight.getCost() * seats;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public User getUser() {
        return user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                idBooking +
                ", " + user.getLogin() +
                ", " + flight.getIdFlight() +
                ", " + seats +
                ", " + cost +
                ", " + status +
                '}';
    }
}
