package com.baeldung.generics;

public class NumberContainer<T extends Number> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public void printDoubleValue() {
        System.out.println(number.doubleValue());
    }
}
