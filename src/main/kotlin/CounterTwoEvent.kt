package org.example

import org.example.sevo.events.Event

open class CounterTwoEvent(type: String, sender: Any, var name: String) : Event(type, sender) {

    companion object {
        val COUNTER_TWO_START = "counter-start"
        val COUNTER_TWO_FINISH = "counter-finish"
        val COUNTER_TWO_CHANGE = "counter-change"
    }



}