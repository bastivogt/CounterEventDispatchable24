package org.example

import org.example.sevo.events.Event

fun main() {
    val counter = Counter()

    counter.addListener(CounterEvent.COUNTER_START) {event: CounterEvent ->
        val c = event.sender as Counter
        println("${event.type} count: ${c.count} name: ${event.name}")
    }

    counter.addListener(CounterEvent.COUNTER_CHANGE) {event: CounterEvent ->
        val c = event.sender as Counter
        println("${event.type} count: ${c.count} name: ${event.name}")
    }

    counter.addListener(CounterEvent.COUNTER_FINISH) {event: CounterEvent ->
        val c = event.sender as Counter
        println("${event.type} count: ${c.count} name: ${event.name}")
    }

    // counter.removeListener(CounterEvent.COUNTER_CHANGE)
    counter.run()


    println("--------------------------------------------------------------")




    val counterTwo = CounterTwo(start = 10, end = 30, step = 2)

    counterTwo.addListener(CounterTwoEvent.COUNTER_TWO_START) {event: CounterTwoEvent ->
        val c = event.sender as CounterTwo
        println("${event.type} count: ${c.count} name: ${event.name}")
    }

    counterTwo.addListener(CounterTwoEvent.COUNTER_TWO_CHANGE) {event: CounterTwoEvent ->
        val c = event.sender as CounterTwo
        println("${event.type} count: ${c.count} name: ${event.name}")
    }

    counterTwo.addListener(CounterTwoEvent.COUNTER_TWO_FINISH) {event: CounterTwoEvent ->
        val c = event.sender as CounterTwo
        println("${event.type} count: ${c.count} name: ${event.name}")
    }

    counterTwo.run()
}