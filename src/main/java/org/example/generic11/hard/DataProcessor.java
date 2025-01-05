package org.example.generic11.hard;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor<T extends Number> {
    private List<T> dataList = new ArrayList<>();

    public void addData(T data) {
        dataList.add(data);
    }

    public List<T> processData() {
        return dataList;
    }
}
