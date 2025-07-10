package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ArraysCompareTest {

    @Test
    void test(){
        int[] numbers = {54,7,28,3,1,78};
        int[] expectedArray = {1,3,7,28,54,78};

        Arrays.sort(numbers);

//        assertEquals(numbers, expectedArray);
        assertArrayEquals(numbers, expectedArray);
    }
}
