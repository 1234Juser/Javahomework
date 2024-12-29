package org.example.chap09.hard;

public class Car extends Vehicle {
    String fuelType;

    public Car(int maxSpeed, String fuelType) {
        super(maxSpeed);
        this.fuelType = fuelType;
    }

    @Override
    public void move() {
        System.out.println("자동차가 도로를 달립니다.");
    }
}
