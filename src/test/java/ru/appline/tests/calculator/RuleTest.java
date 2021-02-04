package ru.appline.tests.calculator;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import ru.appline.framework.Calculator;
import ru.appline.tests.base.BaseTests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class RuleTest extends BaseTests {

    /**
     * Правило которые можно настроить для проверки ошибки в тесте
     * ExpectedException.none() - означает что мы не ожидаем ошибок
     */
    @Rule
    public ExpectedException thrownRule = ExpectedException.none();

    /**
     * Правило которое ограничивает тест по времени выполнения
     */
    @Rule
    public TestRule testRule = new Timeout(1000, TimeUnit.MILLISECONDS);


    /**
     * Первый способ отлавливать ошибки с помощью Rule правила
     * Настраиваем объект thrownRule на ошибку IndexOutOfBoundsException
     * И задаем ожидаемую ошибку "Index: 0, Size: 0"
     */
    @Test
    public void shouldTestExceptionMessage() {
        List<Object> list = new ArrayList<Object>();
        thrownRule.expect(IndexOutOfBoundsException.class);
        thrownRule.expectMessage("Index: 0, Size: 0");
        list.get(0); // execution will never get past this line
    }

    /**
     * Второй способ отлавливать ошибки (лучший способ)
     * Без Rule правила
     */
    @Test
    public void shouldTestExceptionMessage2() {
        List<String> list = new ArrayList<>();
        ThrowingRunnable th = () -> list.get(0);
        IndexOutOfBoundsException indexOutOfBoundsException = Assert.assertThrows(IndexOutOfBoundsException.class, th);
        Assert.assertTrue(indexOutOfBoundsException.getMessage().contains("Index: 0, Size: 0"));
    }


    /**
     * Третий способ
     * Имеет недостаток, нет возможности проверки сообщения самой ошибки
     */
    @Test(expected = ArithmeticException.class)
    public void testDivisionZero() {
        new Calculator().division(3, 0);
    }


    @Test
    public void testSumRuleTimeOut() {
        assertEquals(6, new Calculator().sum(3, 3));
    }

    /**
     * Ограничение по времени лучший способ для Junit4
     */
    @Test(timeout = 5000)
    public void testSumTestTimeOut() {
        assertEquals(6, new Calculator().sum(3, 3));
    }


}
