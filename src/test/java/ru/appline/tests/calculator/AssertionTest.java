package ru.appline.tests.calculator;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import ru.appline.tests.base.BaseTests;

import static org.hamcrest.CoreMatchers.is;

public class AssertionTest extends BaseTests {

    @Test()
    public void testAssertion() {
        // Обычный assertEquals
        Assert.assertEquals("Всегда прописываем сообщение", 6, 5);

        // Хамкрест выражения с помощью
        // Устарел Assert.assertThat нужно использовать класс MatcherAssert
        Assert.assertThat("Всегда прописываем сообщение", 6, is(5));

        // Хамкрест выражения с помощью MatcherAssert.assertThat
        MatcherAssert.assertThat("Всегда прописываем сообщение", 6, is(5));

        // Обычный fail
        Assert.fail("");
    }


}

