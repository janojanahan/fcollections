package org.janahan.techaing.fcollections

import org.junit.Assert.*
import org.junit.Test

class FlistTest {

    @Test
    fun `Should build list`()  {
        val list = Cons(1, Cons (2, Nil))
        assertEquals(2, list.length())
    }

}