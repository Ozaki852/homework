package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter number of tickets: ");
            int tickets = scanner.nextInt();
            if (tickets > 0) {
                System.out.println("How many round-trip tickets? ");
                int roundtrip = scanner.nextInt();
                Ticket tk = new Ticket(tickets, roundtrip);
                tk.print();
            } else if (tickets == 0) {
                continue;
            } else if (tickets ==-1) {
                break;
            }
        }
    }
}
