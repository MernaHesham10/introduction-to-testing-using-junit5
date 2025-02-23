package task7_dynamic_tests;

import calculator_application.Calculator;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @TestFactory
    Stream<DynamicTest> testAddition() {
        return Stream.of(
                dynamicTest("2 + 3 = 5", () -> assertEquals(5, calculator.add(2, 3))),
                dynamicTest("0 + 0 = 0", () -> assertEquals(0, calculator.add(0, 0))),
                dynamicTest("-1 + 1 = 0", () -> assertEquals(0, calculator.add(-1, 1)))
        );
    }
}