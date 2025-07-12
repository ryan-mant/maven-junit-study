package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

@Order(5)
public class FoobarTest {
    @Test
    void test(){
//        fail("not yet implemented");
        System.out.println("Foobar test");
    }

}
