package ru.appline.tests;

import org.junit.function.ThrowingRunnable;

import java.util.ArrayList;

public class ExpectedThrowing implements ThrowingRunnable {

    ArrayList<Object> list = new ArrayList<>();

    @Override
    public void run() throws Throwable {
        list.get(0);
    }

}
