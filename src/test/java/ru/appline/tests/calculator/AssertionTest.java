package ru.appline.tests.calculator;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import ru.appline.framework.Calculator;
import ru.appline.tests.base.BaseTests;

import static org.hamcrest.CoreMatchers.*;

public class AssertionTest extends BaseTests {

    Calculator calculator = new Calculator();

    @Test()
    public void testAssertion() {
        // Обычный assertEquals
        Assert.assertEquals("Всегда прописываем сообщение", 6, calculator.multiplication(2, 3));
//        Assert.assertTrue("Всегда прописываем сообщение", "I love Java!".contains("Java"));
//        Assert.assertTrue("Всегда прописываем сообщение", "I love Java!".endsWith("Java!"));
//        Assert.assertTrue("Всегда прописываем сообщение", "I love Java!".startsWith("Java!"));

        // Хамкрест выражения с помощью
        // Устарел Assert.assertThat нужно использовать класс MatcherAssert
//        Assert.assertThat("Всегда прописываем сообщение", "I love Java!",
//                allOf(containsString("Java"), endsWith("Java"), startsWith("I la")));

        // Хамкрест выражения с помощью MatcherAssert.assertThat
        MatcherAssert.assertThat("Всегда прописываем сообщение", "I love Java!",
                allOf(containsString("Java"), endsWith("Java"), startsWith("I la")));

        // Обычный fail
        Assert.fail("");
    }


}

