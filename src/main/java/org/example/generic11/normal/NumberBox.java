package org.example.generic11.normal;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T>{
    private List<? extends Number> numbers = new ArrayList<>();

    public void addNumber(Number number) {

        List<Number> tempList = new ArrayList<>(numbers);

        tempList.add(number);

        numbers = tempList;
    }

    public List<? extends Number> getNumbers() {
        return numbers;
    }
}
