package com.spring.resting;

import junit.framework.TestCase;

public class GreetingTest extends TestCase {

    public void testGreetings() {
        Greeting greet = new Greeting(10, "Test");
        assertEquals(greet.getId(), 10);
        assertEquals(greet.getContent(), "Test");
    }
}
