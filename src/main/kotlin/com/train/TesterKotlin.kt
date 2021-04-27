package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        print("Please enter number of tickets: ")
        var tickets = scanner.nextInt()
        if (tickets > 0) {
            print("How many round-trip tickets? ")
            var roundtrip = scanner.nextInt()
            val tk = Tickets(tickets, roundtrip)
            tk.print()
        } else if (tickets == 0) {
            continue
        } else if (tickets == -1) {
            break
        }
    }
}


class Tickets(var tickets: Int, var roundtrip: Int) {
    fun print() {
        println("Total tickets: $tickets\n" + "Round-trip: $roundtrip\n" +
                "Total: ${total()}\n")
    }
    fun total() = tickets*1000 + roundtrip*800
}