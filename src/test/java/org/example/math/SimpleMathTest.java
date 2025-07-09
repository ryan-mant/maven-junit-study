package org.example.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;
        
        assertEquals(expected, actual, () -> "%s + %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertEquals(expected, actual, "The testSum() produce an null result");
    }

}
