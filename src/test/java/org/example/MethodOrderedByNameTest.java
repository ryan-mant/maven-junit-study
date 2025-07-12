package org.example;

import org.junit.jupiter.api.Test;



public class MethodOrderedByNameTest {

    @Test
    void testC() {
        System.out.println("Running C");
    }

    @Test
    void testD() {
        System.out.println("Running D");
    }

    @Test
    void testA() {
        System.out.println("Running A");
    }

    @Test
    void testB() {
        System.out.println("Running B");
    }
}
