package com.github.nisrulz.example.testingandroidlib

import org.junit.Assert
import org.junit.Test

class ExampleObjectInModuleTest {
    @Test
    fun `getExampleString returns ExampleString`() {
        Assert.assertEquals(ExampleObjectInModule.getExampleString(), "ExampleString")
    }

    @Test
    fun `appendExampleInModule extension function appends ExampleInModule`() {
        Assert.assertEquals("Hello".appendExampleInModule(), "HelloExampleInModule")
    }
}
