package task6_mockito;

import calculator_application.Calculator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testMocking() {
        Calculator calculator = Mockito.mock(Calculator.class);
        when(calculator.add(2, 3)).thenReturn(5);

        assertEquals(5, calculator.add(2, 3));
        verify(calculator).add(2, 3);
    }
}