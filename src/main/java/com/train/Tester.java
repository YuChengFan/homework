package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int totalTickets = getTotalTicketAmount(scanner);
        while (totalTickets != -1) {
            System.out.print("How many round-trip tickets: ");
            int roundTripTickets = scanner.nextInt();
            System.out.println(roundTripTickets);
            TicketKt ticket = new TicketKt(totalTickets, roundTripTickets);
            ticket.summary();
            totalTickets = getTotalTicketAmount(scanner);
        }
    }

    private static int getTotalTicketAmount(Scanner scanner){
        System.out.print("Please enter number of tickets:");
        int inputTicketAmount = scanner.nextInt();
        System.out.println(inputTicketAmount);
        return inputTicketAmount;
    }
}
