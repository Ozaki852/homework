package com.train;

public class Ticket {

    int tickets;
    int roundtrip;

    public Ticket(int tickets, int roundtrip) {
        this.tickets = tickets;
        this.roundtrip = roundtrip;
    }

    public void print() {
        int total = tickets*1000 + roundtrip*800;
        System.out.println("Total tickets: " + tickets + "\n" + "Round-trip: " + roundtrip + "\n" +
                "Total: " + total + "\n");
    }
}
