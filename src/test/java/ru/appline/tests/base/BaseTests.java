package ru.appline.tests.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseTests {

    @BeforeClass()
    public static void beforAll() {
        System.out.println("@BeforeClass -> beforAll()\n");
    }

    @Before()
    public void beforEach() {
        System.out.println("\n@Before -> beforEach()");
    }

    @After()
    public void afterEach() {
        System.out.println("@After -> afterEach()");
    }

    @AfterClass()
    public static void afterAll() {
        System.out.println("\n@AfterClass -> afterAll()");
    }

}
