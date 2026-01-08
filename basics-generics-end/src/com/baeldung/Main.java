package com.baeldung;

import com.baeldung.generics.Container;
import com.baeldung.generics.NumberContainer;
import com.baeldung.generics.ObjectContainer;

public class Main {

    public static void main(String[] args) {

        ObjectContainer stringContainer = new ObjectContainer("Hello");
        String message = (String) stringContainer.getValue();

        ObjectContainer numberContainer = new ObjectContainer(123);
        String numberMessage = (String) numberContainer.getValue();

        Container<String> stringContainerWithTypeParameter = new Container<>("Hello");
        String secondMessage = stringContainerWithTypeParameter.getValue();

        Container<Integer> numberContainerWithTypeParameter = new Container<>(123);
        // String numberMessage = numberContainer.getValue(); //compilation error

        String[] words = { "Hello", "Generics" };
        String lastWord = getLastElement(words);

        Integer[] numbers = { 1, 2, 3 };
        Integer lastNumber = getLastElement(numbers);

        NumberContainer<Integer> intContainer = new NumberContainer<>(10);
        intContainer.printDoubleValue();

        //NumberContainer<String> invalidContainer = new NumberContainer<>("Hello"); //compilation error
    }

    public static <T> T getLastElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }
}
