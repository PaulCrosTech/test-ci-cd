package com.example.ArtifactName;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStupidTest {

    @Test
    public void test() {
        System.out.println("True is true");
        assertTrue(true);
    }

    @Test
    public void testFailed() {
        System.out.println("True or False");
        assertTrue(false);
    }
}
