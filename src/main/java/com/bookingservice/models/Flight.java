package com.bookingservice.models;

import java.time.LocalDate;
import java.util.Objects;

public class Flight {
    private static int counter = 0;
    private final int id;
    private String idFlight;
    private String name;
    private LocalDate dateTimeFrom;
    private LocalDate dateTimeTo;
    private String cityFrome;
    private String cityTo;
    private int seatsAmount;
    private double cost;
    private boolean status;

    public Flight(String name, LocalDate dateTimeFrom, LocalDate dateTimeTo, String cityFrome, String cityTo, int seatsAmount, double cost, boolean status) {
        this.id = ++counter;
        this.idFlight = id + "-" + this.hashCode() + "F";
        this.name = name;
        this.dateTimeFrom = dateTimeFrom;
        this.dateTimeTo = dateTimeTo;
        this.cityFrome = cityFrome;
        this.cityTo = cityTo;
        this.seatsAmount = seatsAmount;
        this.cost = cost;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(String idFlight) {
        this.idFlight = idFlight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateTimeFrom() {
        return dateTimeFrom;
    }

    public void setDateTimeFrom(LocalDate dateTimeFrom) {
        this.dateTimeFrom = dateTimeFrom;
    }

    public LocalDate getDateTimeTo() {
        return dateTimeTo;
    }

    public void setDateTimeTo(LocalDate dateTimeTo) {
        this.dateTimeTo = dateTimeTo;
    }

    public String getCityFrome() {
        return cityFrome;
    }

    public void setCityFrome(String cityFrome) {
        this.cityFrome = cityFrome;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id &&
                Objects.equals(idFlight, flight.idFlight) &&
                Objects.equals(name, flight.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idFlight, name, dateTimeFrom, dateTimeTo, cityFrome, cityTo, seatsAmount, cost, status);
    }

    @Override
    public String toString() {
        return "Flight{" +
                id +
                ", " + idFlight +
                ", " + name +
                ", " + dateTimeFrom +
                ", " + dateTimeTo +
                ", " + cityFrome +
                ", " + cityTo +
                ", " + seatsAmount +
                ", " + cost +
                ", " + status +
                '}';
    }
}
