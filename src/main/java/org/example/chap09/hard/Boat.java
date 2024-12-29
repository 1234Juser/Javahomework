package org.example.chap09.hard;

public class Boat extends Vehicle {
    String hullType;

    public Boat(int maxSpeed, String hullType) {
        super(maxSpeed);
        this.hullType = hullType;
    }

    @Override
    public void move() {
        System.out.println("보트가 물위를 떠다닙니다.");
    }
}
