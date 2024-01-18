package org.example

import org.example.sevo.events.Event

open class CounterEvent(type: String, sender: Counter, var name: String) : Event(type, sender) {

    companion object {
        val COUNTER_START = "counter-start"
        val COUNTER_FINISH = "counter-finish"
        val COUNTER_CHANGE = "counter-change"
    }



}