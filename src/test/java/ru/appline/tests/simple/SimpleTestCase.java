package ru.appline.tests.simple;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.RunWith;
import org.junit.runner.manipulation.Alphanumeric;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import ru.appline.framework.Calculator;
import ru.appline.tests.base.BaseTests;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimpleTestCase extends BaseTests {

    Calculator calculator = new Calculator();

    @Test
    @Ignore("Всегда прописываем комментарий почему игнорим")
    public void testSum() {
        System.out.println("@Test -> testSum()");
        assertEquals(5, calculator.sum(3, 3));
        assertThat(calculator.sum(3, 3), equalTo(5));

        assertThat("hello world", anyOf(
                is("hello world"),
                containsString("hello")
        ));


        String a1 = "new Object()";
        String a2 = a1;
        String a3 = new String("new Object()");
        assertSame(a1, a2); // ok
        assertSame(a1, a3); // AssertionError: expected:<test2.A@7f13d6e> but was:<test2.A@51cdd8a>
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
        assertEquals("Сообщение об ошибке", 9, calculator.multiplication(3, 3));
        assertTrue("Сообщение об ошибке", 9 == calculator.multiplication(3, 3));
        assertFalse("Сообщение об ошибке", 9 != calculator.multiplication(3, 3));
        assertNotEquals("Сообщение об ошибке", 9, calculator.multiplication(3, 3));
        assertNotNull("Сообщение об ошибке", calculator);
        assertNull("Сообщение об ошибке", calculator.multiplication(3, 3));
        assertSame(9, calculator.multiplication(3, 3));
        assertNotSame(9, calculator.multiplication(3, 3));
    }
}

