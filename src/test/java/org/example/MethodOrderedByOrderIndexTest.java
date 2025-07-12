package org.example;

import org.junit.jupiter.api.*;

//@Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {

    StringBuilder actualValue = new StringBuilder();


    @AfterEach
    void afterEachMethod(){
        System.out.println("The actual value is: " + actualValue);
    }

    @Test
    @Order(1)
    void testC() {
        System.out.println("Running C");
        actualValue.append("1");
    }

    @Test
    @Order(2)
    void testD() {
        System.out.println("Running D");
        actualValue.append("2");
    }

    @Test
    @Order(3)
    void testA() {
        System.out.println("Running A");
        actualValue.append("3");
    }

    @Test
    @Order(4)
    void testB() {
        System.out.println("Running B");
        actualValue.append("4");
    }
}
