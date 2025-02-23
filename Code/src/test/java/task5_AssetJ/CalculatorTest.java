package task5_AssetJ;

import calculator_application.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
    }

    @Test
    void testDivisionByZero() {
        assertThatThrownBy(() -> calculator.divide(4, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Division by zero is not allowed");
    }
}