package ru.appline.tests.calculator;

import org.junit.Ignore;
import org.junit.Test;
import ru.appline.framework.Calculator;
import ru.appline.tests.base.BaseTests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class CalculatorTest extends BaseTests {

    Calculator calculator = new Calculator();

    @Test
    @Ignore("Всегда прописываем комментарий почему игнорим")
    public void testSum() throws InterruptedException {
        System.out.println("@Test -> testSum()");
        assertEquals(6, calculator.sum(3, 3));
        assertThat(calculator.sum(3, 3), is(5));
    }

    @Test
    public void testSubtraction() {
        System.out.println("@Test -> testSubtraction()");
        assertEquals(0, calculator.substruction(3, 3));
    }

    @Test
    public void testDivision() {
        System.out.println("@Test -> testDivision()");
        assertEquals(1, calculator.division(3, 3));
    }

    @Test
    public void testMultiplication() {
        System.out.println("@Test -> testMultiplication()");
        assertEquals(9, calculator.multiplication(3, 3));
    }
}

