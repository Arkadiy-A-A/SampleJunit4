package ru.appline.tests.suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.appline.tests.calculator.CalculatorTest;
import ru.appline.tests.parametrized.ParameterizedCalcTest;
import ru.appline.tests.calculator.RuleTest;

/**
 * Запуск пачки тестов через Suite
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        ParameterizedCalcTest.class,
        RuleTest.class
})
public class RunAllTests {

}
