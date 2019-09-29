package com.train

import java.util.*

class TesterKotlin {
    fun main(args: Array<String>){
        val scanner = Scanner(System.`in`)
        var total = getTotalTicketAmount(scanner)
        while (total != -1) {
            print("How many round-trip tickets: ")
            val roundTrip = scanner.nextInt()
            println(roundTrip)
            val ticket = TicketKt(total, roundTrip)
            ticket.summary()
            total = getTotalTicketAmount(scanner)
        }
    }

    fun getTotalTicketAmount(scanner : Scanner) : Int{
        print("Please enter number of tickets: ")
        val inputTicketAmount = scanner.nextInt()
        println(inputTicketAmount)
        return inputTicketAmount
    }
}