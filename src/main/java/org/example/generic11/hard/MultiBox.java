package org.example.generic11.hard;

public class MultiBox<T , S> {
    private T firstData;
    private S secondData;

    public void setFirstData(T firstData) {
        this.firstData = firstData;
    }

    public void setSecondData(S secondData) {
        this.secondData = secondData;
    }
    public void printData() {
        System.out.println("첫번째 데이터 : " + firstData + ", 두번째 데이터 : " +secondData);

    }
}


