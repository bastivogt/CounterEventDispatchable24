package org.example


import org.example.sevo.events.Dispatchable
import org.example.sevo.events.EventDispatcher


open class Counter(start: Int = 0, end: Int = 10, step: Int = 1) : Dispatchable<CounterEvent> {

    private var start: Int = 0
    private var end: Int = 0
    private var step: Int = 0
    var count: Int = 0
        private set

    private var eventDispatcher = EventDispatcher<CounterEvent>()


    init {
        this.start = start
        this.end = end
        this.step = step
    }



    fun run() {
        this.count = 0
        this.dispatchEvent(CounterEvent(CounterEvent.COUNTER_START, this, "Sevo"))
        for (i in this.start..this.end step this.step) {
            this.count = i
            this.dispatchEvent(CounterEvent(CounterEvent.COUNTER_CHANGE, this, "Ute"))
        }
        this.dispatchEvent(CounterEvent(CounterEvent.COUNTER_FINISH, this, "Günther"))
    }

    override fun addListener(type: String, listener: (CounterEvent) -> Unit): Boolean {
        return eventDispatcher.addListener(type, listener)
    }

    override fun hasListener(type: String): Boolean {
        return eventDispatcher.hasListener(type)
    }

    override fun removeListener(type: String): Boolean {
        return eventDispatcher.removeListener(type)
    }

    override fun dispatchEvent(event: CounterEvent): Boolean {
        return eventDispatcher.dispatchEvent(event)
    }


}