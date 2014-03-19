package com.l433.javademo;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testServletFoo() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        
        //NOTHING to test yet, so do a dummy assert
        assertEquals("com.l433.javademo.HelloWorld", helloWorld.getClass().getName());
        assertThat(helloWorld.getClass().getName(), equalTo("com.l433.javademo.HelloWorld"));
    }
}
