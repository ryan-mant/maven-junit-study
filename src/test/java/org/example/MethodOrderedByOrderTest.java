package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderTest {

    @Test
    @Order(2)
    void testC() {
        System.out.println("Running C");
    }

    @Test
    @Order(3)
    void testD() {
        System.out.println("Running D");
    }

    @Test
    @Order(1)
    void testA() {
        System.out.println("Running A");
    }

    @Test
    @Order(4)
    void testB() {
        System.out.println("Running B");
    }
}
