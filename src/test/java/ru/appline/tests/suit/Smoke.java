package ru.appline.tests.suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.appline.tests.simple.SimpleTestCase;
import ru.appline.tests.simple.param.ParameterizedCalcTest;
import ru.appline.tests.simple.rule.RuleTestCase;

/**
 * Запуск пачки тестов через Suite
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SimpleTestCase.class,
        ParameterizedCalcTest.class,
        RuleTestCase.class
})
public class Smoke {

}
