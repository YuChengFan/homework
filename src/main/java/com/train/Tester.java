package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int totalTickets = scanner.nextInt();
        System.out.println(totalTickets);
        System.out.print("How many round-trip tickets: ");
        int roundTripTickets = scanner.nextInt();
        System.out.println(roundTripTickets);
        TicketKt ticket = new TicketKt(totalTickets, roundTripTickets);
        ticket.summary();
    }
}
