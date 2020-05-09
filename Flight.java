package com.bookingservice.models;

import java.time.LocalDate;

public class Flight {
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

    public Flight(int id, String idFlight, String name, LocalDate dateTimeFrom, LocalDate dateTimeTo, String cityFrome, String cityTo, int seatsAmount, double cost, boolean status) {
        this.id = id;
        this.idFlight = idFlight;
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
}
