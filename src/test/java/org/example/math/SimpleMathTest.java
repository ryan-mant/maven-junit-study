package org.example.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.2D, 2D);
        double expected = 8.2D;
        
        assertEquals(expected, actual, "The testSum() did not produce expected result");
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertEquals(expected, actual, "The testSum() produce an null result");
    }

}
