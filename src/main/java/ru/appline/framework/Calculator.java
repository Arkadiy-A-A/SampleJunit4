package ru.appline.framework;

public class Calculator {

    public int sum(int a, int b) {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    public int division(int a, int b){
        return a / b;
    }

    public int substruction(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

}