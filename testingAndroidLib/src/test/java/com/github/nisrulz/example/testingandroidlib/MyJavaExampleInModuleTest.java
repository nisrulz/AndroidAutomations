package com.github.nisrulz.example.testingandroidlib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyJavaExampleInModuleTest {

    private MyJavaExampleInModule myJavaExampleInModule = new MyJavaExampleInModule();

    @Test
    public void testGetClassName() {
        assertEquals("EXAMPLE", myJavaExampleInModule.getUppercaseExampleString());
    }
}
