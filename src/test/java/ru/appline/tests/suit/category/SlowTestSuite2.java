package ru.appline.tests.suit.category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.appline.tests.suit.category.example.A;
import ru.appline.tests.suit.category.example.B;
import ru.appline.tests.suit.category.example.FastTests;
import ru.appline.tests.suit.category.example.SlowTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
public class SlowTestSuite2 {
    // Will run A.b, but not A.a or B.c
}
