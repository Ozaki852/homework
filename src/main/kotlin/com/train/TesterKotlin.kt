package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var tickets = scanner.nextInt()
    print("How many round-trip tickets? ")
    var roundtrip = scanner.nextInt()
    val tk = Ticket(tickets, roundtrip)
    tk.print()
}

class Ticket(var tickets: Int, var roundtrip: Int) {
    fun print() {
        println("Total tickets: $tickets\n" + "Round-trip: $roundtrip\n" +
                "Total: " + (tickets*1000 + roundtrip*800) )
    }
}