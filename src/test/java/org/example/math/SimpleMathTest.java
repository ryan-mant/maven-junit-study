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
        assertNotNull(actual, "The testSum() produce an null result");
    }

    @Test
    void testSubtraction(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 5.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 3.2D;

        assertEquals(expected, actual, () -> "%s - %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }

    @Test
    void testMultiplication(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 4.6D;
        double secondNumber = 2.0D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 9.2D;

        assertEquals(expected, actual, () -> "%s * %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(8D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }

    @Test
    void testDivision(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 3D;
        double secondNumber = 3D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 1D;

        assertEquals(expected, actual, () -> "%s / %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(3D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }
    @Test
    void testMean(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = 8D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 6D;

        assertEquals(expected, actual, () -> "%s + %s / 2 did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }
    @Test
    void testSquareRoot(){
        SimpleMath math = new SimpleMath();
        double number = 121D;
        Double actual = math.squareRoot(number);
        double expected = 11D;

        assertEquals(expected, actual, () -> "SquareRoot of %s did not produce %s".formatted(number, expected));
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }



}
