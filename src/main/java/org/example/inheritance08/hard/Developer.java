package org.example.inheritance08.hard;

public class Developer implements Worker{
    @Override
    public void work() {
        System.out.println("개발자가 코딩을 시작합니다.");
    }
}
