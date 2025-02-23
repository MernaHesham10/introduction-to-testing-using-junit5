package task9_test_driven_development;

import calculator_application.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        // Red: Write a failing test
        assertEquals(5, calculator.add(2, 3));

        // Green: Implement the add method
        // Refactor: Improve the code
    }
}