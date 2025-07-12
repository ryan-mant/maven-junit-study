package org.example.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    SimpleMath math;
    @BeforeEach()
    void beforeEachMethod(){
        System.out.println("Before each");
        math = new SimpleMath();
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition} of {totalRepetitions}")
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo,
            TestInfo testInfo
    ) {
        System.out.println("Repetition " + repetitionInfo.getCurrentRepetition());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());
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
