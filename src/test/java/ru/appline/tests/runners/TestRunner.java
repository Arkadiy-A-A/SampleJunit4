package ru.appline.tests.runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import ru.appline.tests.simple.SimpleTestCase;
import ru.appline.tests.simple.param.ParameterizedCalcTest;
import ru.appline.tests.simple.rule.RuleTestCase;

public class TestRunner {

    /**
     * Один из способов запуска тестов через классы JUnit
     * Но такой способ требует настроки не актуально почти всегда
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                SimpleTestCase.class,
                ParameterizedCalcTest.class,
                RuleTestCase.class
        );

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
