package org.example

import org.example.sevo.events.EventDispatcher

class CounterTwo(start: Int = 0, end: Int = 10, step: Int = 1) : EventDispatcher<CounterTwoEvent>() {

    private var start: Int = 0
    private var end: Int = 0
    private var step: Int = 0
    var count: Int = 0
        private set



    init {
        this.start = start
        this.end = end
        this.step = step
    }



    fun run() {
        this.count = 0
        this.dispatchEvent(CounterTwoEvent(CounterTwoEvent.COUNTER_TWO_START, this, "Joel"))
        for (i in this.start..this.end step this.step) {
            this.count = i
            this.dispatchEvent(CounterTwoEvent(CounterTwoEvent.COUNTER_TWO_CHANGE, this, "Noah"))
        }
        this.dispatchEvent(CounterTwoEvent(CounterTwoEvent.COUNTER_TWO_FINISH, this, "Sevo"))
    }

}