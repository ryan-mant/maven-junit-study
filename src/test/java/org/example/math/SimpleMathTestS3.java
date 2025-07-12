package org.example.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS3 {

    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println("Running...");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("It's over!");
    }

    @BeforeEach()
     void beforeEachMethod(){
        System.out.println("Before each");
        math = new SimpleMath();
    }

    @AfterEach()
    void afterEachMethod(){
        System.out.println("After each");
        math = new SimpleMath();
    }


    @Test
    @DisplayName("Test Sum")
    void testSum_When_FirstNumberIsAddedBySecondNumber_ShouldReturnCorrectSum() {

        ///  AAA / Arrange,Act, Assert

        // GIVEN / Arrange
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;

        //WHEN / Act
        Double actual = math.sum(firstNumber, secondNumber);

        //THEN / Assert
        assertEquals(expected, actual, () -> "%s + %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }

    @Test
    @DisplayName("test Subtraction")
    void testSubtraction_When_FirstNumberIsMinusSecondNumber_ShouldReturnCorrectSubtraction(){

        double firstNumber = 5.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 3.2D;

        assertEquals(expected, actual, () -> "%s - %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(10.2D, actual, "The subtraction of two numbers produce a incorrect result");
        assertNotNull(actual, "The subtraction of two numbers produce an null result");
    }

    @Test
    @DisplayName("Test Multiplication")
    void givenTwoNumbers_whenMultiplying_thenReturnsCorrectMultiplication(){
        double firstNumber = 4.6D;
        double secondNumber = 2.0D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 9.2D;

        assertEquals(expected, actual, () -> "%s * %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(8D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }

    @Test
    @DisplayName("Test Division")
    void testDivision_When_DividingEqualNumbers_ShouldReturnOne(){
        double firstNumber = 3D;
        double secondNumber = 3D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 1D;

        assertEquals(expected, actual, () -> "%s / %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(3D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }
    @Test
    @DisplayName("Test Mean")
    void testMean_When_CalculatingAverageOfTwoNumbers_ShouldReturnCorrectMean(){
        double firstNumber = 4D;
        double secondNumber = 8D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 6D;

        assertEquals(expected, actual, () -> "%s + %s / 2 did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }
    @Test
    @DisplayName("Test SquareRoot")
    void testSquareRoot_When_CalculatingSquareRootOfPerfectSquare_ShouldReturnCorrectRoot(){
        double number = 121D;
        Double actual = math.squareRoot(number);
        double expected = 11D;

        assertEquals(expected, actual, () -> "SquareRoot of %s did not produce %s".formatted(number, expected));
        assertNotEquals(10.2D, actual, "The testSum() produce a incorrect result");
        assertNotNull(actual, "The testSum() produce an null result");
    }

    @Test
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {

        //given
        double firstNumber = 6.2D;
        double secondNumber = 0D;

        var expectedMessage = "Impossible to divide by zero!";

        //when & then
        ArithmeticException actual = assertThrows(
                ArithmeticException.class, () -> {
                    //when & then
                    math.division(firstNumber, secondNumber);
                }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(),
                () -> "Unexpected exception message!");
    }

}
