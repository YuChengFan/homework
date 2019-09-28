package com.train

import java.util.*

class TesterKotlin {
    fun main(args: Array<String>){
        val scanner = Scanner(System.`in`)
        print("Please enter number of tickets: ")
        val total = scanner.nextInt()
        println(total)
        print("How many round-trip tickets: ")
        val roundTrip = scanner.nextInt()
        println(roundTrip)
        val ticket = TicketKt(total, roundTrip)
        ticket.summary()
    }
}