package org.example.inheritance08.hard;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 활용한 메소드 호출을 구현하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 다형성을 이해하고 적용할 수 있다.
         *
         * 클래스명: Vehicle (부모 클래스)
         * 메소드: 이동(move) - "차량이 이동합니다." 출력
         *
         * 클래스명: Car (자식 클래스)
         * 메소드: 이동(move) - "자동차가 도로를 달립니다." 출력 (메소드 오버라이딩)
         *
         * 클래스명: Boat (자식 클래스)
         * 메소드: 이동(move) - "보트가 물 위를 떠다닙니다." 출력 (메소드 오버라이딩)
         *
         * Vehicle 타입의 배열을 생성하고, Car와 Boat 객체를 배열에 추가한 후, 배열을 순회하며 이동 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 자동차가 도로를 달립니다.
         * 보트가 물 위를 떠다닙니다.
         * */
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Car();
        vehicles[1] = new Boat();
        for(Vehicle v : vehicles){
            v.move();
        }
        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 인터페이스를 활용한 메소드 호출을 구현하세요.
         *
         * 복습 포인트:
         * - 인터페이스의 개념을 이해하고 설명할 수 있다.
         * - 인터페이스를 활용하여 다형성을 구현할 수 있다.
         *
         * 인터페이스명: Worker
         * 메소드: 작업하다(work) - "작업을 시작합니다." 출력
         *
         * 클래스명: Developer (구현 클래스)
         * 메소드: 작업하다(work) - "개발자가 코딩을 시작합니다." 출력 (인터페이스 메소드 구현)
         *
         * 클래스명: Designer (구현 클래스)
         * 메소드: 작업하다(work) - "디자이너가 디자인을 시작합니다." 출력 (인터페이스 메소드 구현)
         *
         * Worker 타입의 배열을 생성하고, Developer와 Designer 객체를 배열에 추가한 후, 배열을 순회하며 작업하다 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 개발자가 코딩을 시작합니다.
         * 디자이너가 디자인을 시작합니다.
         * */
        Worker[] workers = new Worker[10];
        workers[0] = new Developer();
        workers[1] = new Designer();
        for(Worker w : workers){
            w.work();


        }
    }
}
