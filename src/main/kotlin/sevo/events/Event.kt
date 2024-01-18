package org.example.sevo.events

open class Event(type: String, sender: Any) {
    var type: String
        protected set

    var sender: Any
        protected set

    init {
        this.type = type
        this.sender = sender
    }
}