package task4_exception_testing;

import calculator_application.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(4, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}