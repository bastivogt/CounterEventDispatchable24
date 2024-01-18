package org.example.sevo.events

open class EventDispatcher<T: Event> : Dispatchable<T> {

    protected val listeners: MutableMap<String, (T) -> Unit> = mutableMapOf()


    override fun hasListener(type: String): Boolean{
        return listeners.containsKey(type)
    }


    override fun addListener(type: String, listener: (T) -> Unit): Boolean {
        if(!this.hasListener(type)) {
            this.listeners.put(type, listener)
            return true
        }
        return false
    }

    override fun removeListener(type: String): Boolean {
        if(this.hasListener(type)) {
            this.listeners.remove(type)
        }
        return false
    }

    override fun dispatchEvent(event: T): Boolean {
        if(this.hasListener(event.type)) {
            this.listeners.get(event.type)?.invoke(event)
            return true
        }
        return false
    }

}