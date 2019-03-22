package org.janahan.techaing.fcollections

import java.lang.IllegalStateException

sealed class Flist<out T> : Iterable<T>{
    abstract val head: T

    abstract val tail: Flist<T>
    override fun iterator() = FListIterator(this)
}

object Nil: Flist<Nothing>() {

    override val head: Nothing
        get() = throw IllegalStateException("Should not get the head of Nil Object")
    override val tail: Flist<Nothing>
        get() = throw IllegalStateException("Should not get the head of Nil Object")
}

data class Cons<out T>(override val head: T, override val tail: Flist<T>): Flist<T>()

fun <T> Flist<T>.length(): Int = if (this is Nil) 0 else 1 + tail.length()