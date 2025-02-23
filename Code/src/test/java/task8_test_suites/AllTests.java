package task8_test_suites;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, CalculatorTest2.class})
public class AllTests {
}
