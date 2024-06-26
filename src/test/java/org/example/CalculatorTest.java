//STUDENT NUMBER= B231202802
//STUDENT NAME = VIKTORIIA TYRCHYK
//COURSE NAME = SOFTWARE VERIFICATION AND VALIDATION
//https://github.com/ViktoriiaTyrchyk/Calculator.HW.Tyrchyk-.git


package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 5", "10, 4, 2.5f", "12.5f, 2.5f, 5", "10, 2.5f, 4","12.5f, 5, 2.5f"})
    void dataDrivenAdd(float a, float b,float expectedValue) {
        Calculator calculator = new Calculator();
        assertEquals(expectedValue, calculator.divide(a, b),
                "The result of Calculator.add method is incorrect.");



    }

 

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}