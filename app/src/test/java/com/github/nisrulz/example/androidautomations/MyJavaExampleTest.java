package com.github.nisrulz.example.androidautomations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyJavaExampleTest {

    private MyJavaExample myJavaExample = new MyJavaExample();

    @Test
    public void testGetClassName() {
        assertEquals("MyJavaExample", myJavaExample.getClassNameAsString());
    }
}
