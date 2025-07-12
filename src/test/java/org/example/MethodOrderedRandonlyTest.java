package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandonlyTest {

    @Test
    void testA() {
        System.out.println("Running A");
    }

    @Test
    void testB() {
        System.out.println("Running B");
    }

    @Test
    void testC() {
        System.out.println("Running C");
    }

    @Test
    void testD() {
        System.out.println("Running D");
    }
}
