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
        double total;
        double kingPrice = 139.00;
        double doublePrice = 124.00;
        double weekendPrice = 0.10;

        if (getRoomType().equalsIgnoreCase("king") && isWeekend()) {
            total = ((weekendPrice * getNumberOfNights()) * kingPrice) + kingPrice * getNumberOfNights() + price;
            return total;
        } else if (getRoomType().equalsIgnoreCase("double") && isWeekend()) {
            total = ((weekendPrice * getNumberOfNights()) * doublePrice) + doublePrice * getNumberOfNights() + price;
           return total;
        } else if (getRoomType().equalsIgnoreCase("king")) {
            total = (kingPrice * getNumberOfNights()) + price;
            return total;
        } else if (getRoomType().equalsIgnoreCase("double")) {
            total = (doublePrice * getNumberOfNights()) + price;
            return total;
        }
        return 0;
    }

}
