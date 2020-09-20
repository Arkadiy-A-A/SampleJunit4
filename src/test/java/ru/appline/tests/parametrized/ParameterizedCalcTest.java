package ru.appline.tests.parametrized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.appline.framework.Calculator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedCalcTest {

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {1, 2, 2},
                {2, 2, 4},
                {3, 2, 6},
                {0, 0, 0}
        });
    }

    @Parameterized.Parameter(0) // first data value (0) is default
    public int a; // NOT private NOT protected

    @Parameterized.Parameter(1)
    public int b; // NOT private NOT protected

    @Parameterized.Parameter(2)
    public int c; // NOT private NOT protected

    @Test
    public void testSum() {
        System.out.println("Праметры:\na = " + a + "\nb = " + b + "\nc = " + c+"\n");
        assertEquals(c, new Calculator().multiplication(a, b));
    }


}
