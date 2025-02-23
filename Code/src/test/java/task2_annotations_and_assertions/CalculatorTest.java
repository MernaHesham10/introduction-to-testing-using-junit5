package task2_annotations_and_assertions;
import calculator_application.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Calculator instance created.");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Calculator instance destroyed.");
    }

    @Test
    @DisplayName("Test addition of 2 and 3")
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(4, 2));
    }

    @Test
    @DisplayName("Test division by zero")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
    }
}