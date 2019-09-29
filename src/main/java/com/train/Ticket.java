package com.train;

public class Ticket {
    int tickets;
    int roundTripTickets;
    int singleTirpPrice = 1000;
    int roundTripPrice;
    public Ticket(int tickets, int roundTripTickets){
        this.tickets = tickets;
        //來回票數量要小於全部車票
        this.roundTripTickets = (roundTripTickets <= tickets) ? roundTripTickets : tickets;
    }
    public void summary(){
        roundTripPrice = (int)(singleTirpPrice * 2 * 0.9);
        System.out.println("Total tickets: " + tickets + "\n" +
                        "Round-trip: " + roundTripTickets + "\n" +
                        "Total: " +  (roundTripTickets * roundTripPrice + (tickets - roundTripTickets) * singleTirpPrice));
    }
}
