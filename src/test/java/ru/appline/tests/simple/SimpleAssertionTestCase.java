package ru.appline.tests.simple;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import ru.appline.framework.Calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.startsWith;

public class SimpleAssertionTestCase {

    Calculator calculator = new Calculator();

    @Test
    public void testMultiplication() {
        System.out.println("@Test -> testMultiplication()");
        Assert.assertEquals("Сообщение об ошибке", 9, calculator.multiplication(3, 3));
        Assert.assertTrue("Сообщение об ошибке", 9 == calculator.multiplication(3, 3));
        Assert.assertFalse("Сообщение об ошибке", 9 != calculator.multiplication(3, 3));
        Assert.assertNotEquals("Сообщение об ошибке", 9, calculator.multiplication(3, 3));
        Assert.assertNotNull("Сообщение об ошибке", calculator);
        Assert.assertNull("Сообщение об ошибке", calculator.multiplication(3, 3));
        Assert.assertSame(9, calculator.multiplication(3, 3));
        Assert.assertNotSame(9, calculator.multiplication(3, 3));

        MatcherAssert.assertThat("Всегда прописываем сообщение",
                "I love Java!",
                allOf(containsString("Java"), endsWith("Java"), startsWith("I la")));

        MatcherAssert.assertThat("hello world", anyOf(
                is("hello world"),
                containsString("hello")
        ));
    }



}
