package ru.appline.tests.suit.category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.appline.tests.suit.category.example.A;
import ru.appline.tests.suit.category.example.B;
import ru.appline.tests.suit.category.example.SlowTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
public class SlowTestSuite1 {
    // Will run A.b and B.c, but not A.a
}
