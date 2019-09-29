package com.train

class TicketKt (var tickets : Int, var roundTripTickets : Int){
    init {
        if (roundTripTickets <= tickets) roundTripTickets else tickets
    }
    var singleTripPrice : Int = 1000
    var roundTripPrice : Int = 0
    fun summary(){
        roundTripPrice = (singleTripPrice * 2 * 0.9).toInt()
        System.out.println("Total tickets: $tickets\n" +
                "Round-trip:$roundTripTickets\n" +
                "Total:${roundTripTickets * roundTripPrice + (tickets - roundTripTickets) * singleTripPrice}")
    }
}