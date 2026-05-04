package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 200.00, false, false, true);

        if ((room1.isAvailable(true))) {
            System.out.println("Room 1 is available.");
        } else {
            System.out.println("Room 1 is not available.");
        }

        Reservation reservation = new Reservation("King", 200.00, 2, true);

        System.out.println(reservation.getReservationTotal());
    }
}
