package org.example.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS4 {

    SimpleMath math;

    @BeforeEach()
     void beforeEachMethod(){
        System.out.println("Before each");
        math = new SimpleMath();
    }

    @DisplayName("Test division [firstNumber, secondNumber, expected]")
    @ParameterizedTest
//    @MethodSource("testDivisionInputParameters")
//    @CsvSource({
//            "3, 3, 1",
//            "4, 2, 2",
//            "54.8, 6.2, 8.83"
//    })
    @CsvFileSource(
            resources = "/testDivision.csv"
    )
    void testDivision_When_DividingEqualNumbers_ShouldReturnOne(double firstNumber, double secondNumber, double expected){

        System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected);

        Double actual = math.division(firstNumber, secondNumber);
        assertEquals(expected, actual, 2D, () -> "%s / %s did not produce %s".formatted(firstNumber, secondNumber, expected));
        assertNotNull(actual, "The testSum() produce an null result");
    }

//    public static Stream<Arguments> testDivisionInputParameters(){
//        return Stream.of(
//                Arguments.of(3D, 3D, 1D),
//                Arguments.of(4D, 2D, 2D),
//                Arguments.of(54.8D, 6.2D, 8.83D)
//        );
//    }
}
