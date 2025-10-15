package com.inc.test;

import static org.junit.jupiter.api.Assertions.*;

import com.inc.StringCalc;
import org.junit.jupiter.api.Test;

public class StringCalcTest {

    @Test
    void shouldReturnZeroForEmptyString() {
        assertEquals(0, new StringCalc().add(""));
    }

    @Test
    void shouldReturnNumberForSingleValue() {
        assertEquals(5, new StringCalc().add("5"));
    }

    @Test
    void shouldReturnSumOfTwoNumbers() {
        assertEquals(3, new StringCalc().add("1,2"));
    }

    @Test
    void shouldHandleNewLines() {
        assertEquals(6, new StringCalc().add("1\n2,3"));
    }

    @Test
    void shouldSupportCustomDelimiter() {
        assertEquals(3, new StringCalc().add("//;\n1;2"));
    }

    @Test
    void shouldThrowExceptionForNegativeNumbers() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new StringCalc().add("1,-2,3,-4");
        });
        assertEquals("Negative numbers not allowed: [-2, -4]", e.getMessage());
    }
}
