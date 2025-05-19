package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testGetMessage() {
        assertEquals("Hello World!", HelloWorld.getMessage());
    }
}
