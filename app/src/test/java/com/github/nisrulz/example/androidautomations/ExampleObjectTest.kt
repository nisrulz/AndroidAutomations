package com.github.nisrulz.example.androidautomations

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleObjectTest {
    @Test
    fun `getExampleString() returns Example`() {
        assertEquals(ExampleObject.getExampleString(), "Example")
    }

    @Test
    fun `appendExample() extension function appends Example`() {
        assertEquals("Hello".appendExample(), "HelloExample")
    }
}