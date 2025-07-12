package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Order(4)
public class ArraysCompareTest {

    @Test
    void test(){
        int[] numbers = {54,7,28,3,1,78};
        int[] expectedArray = {1,3,7,28,54,78};

        Arrays.sort(numbers);

//        assertEquals(numbers, expectedArray);
        assertArrayEquals(numbers, expectedArray);
    }

    @Test
//    @Timeout(1)
    @Timeout(value = 30, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance(){
        int[] numbers = {54,7,28,3,1,78};
        for (int i = 0; i < 100000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
