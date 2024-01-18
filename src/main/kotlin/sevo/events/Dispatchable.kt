package org.example.sevo.events

interface Dispatchable<T> {

    fun hasListener(type: String): Boolean
    fun addListener(type: String, listener: (T) -> Unit): Boolean
    fun removeListener(type: String): Boolean
    fun dispatchEvent(event: T): Boolean

}