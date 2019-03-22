package org.janahan.techaing.fcollections

class FListIterator<T>(var flist: Flist<T>) : Iterator<T> {
    override fun hasNext() = (flist !is Nil) && (flist.tail is Cons)


    override fun next(): T {
        if (hasNext()) {
            flist = flist.tail
            return flist.head
        } else {
            throw NoSuchElementException("Attempting to iterate past the end")
        }
    }
}
