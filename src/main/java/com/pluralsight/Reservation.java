package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public boolean isSetWeekend(boolean isWeekend) {
        return weekend;
    }

    public double getReservationTotal() {
        if (getRoomType().equalsIgnoreCase("king") && isWeekend()) {
            return price = 152.90;
        } else if (getRoomType().equalsIgnoreCase("double") && isWeekend()) {
            return price = 136.40;
        } else if (getRoomType().equalsIgnoreCase("king")) {
            return price = 139.00;
        } else if (getRoomType().equalsIgnoreCase("double")) {
            return price = 124.00;
        }
        return price;
    }

}
