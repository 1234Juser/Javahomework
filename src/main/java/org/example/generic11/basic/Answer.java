package org.example.generic11.basic;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 제네릭 클래스를 작성하고, 특정 타입으로 인스턴스를 생성하여 데이터를 추가하고 출력하세요.
         *
         * 복습 포인트:
         * - 제네릭스가 무엇인지 이해하고 설명할 수 있다.
         * - 제네릭스 사용의 목적 혹은 장점에 대해 이해하고 설명할 수 있다.
         * - 제네릭스가 적용된 클래스에 타입변수를 지정하여 인스턴스를 생성할 수 있다.
         *
         * 클래스명: Box
         * 필드: 데이터(data, 제네릭 타입)
         * 메소드: 데이터 추가(setData), 데이터 반환(getData)
         *
         * Box<String>과 Box<Integer> 타입의 인스턴스를 생성하고, 데이터를 추가하고 출력
         *
         * 출력 예시:
         * 문자열 데이터: Hello, Generics!
         * 정수 데이터: 123
         * */
        Box<String> box1 = new Box<>("Hello, Generics!");
        Box<Integer> box2 = new Box<>(123);
        System.out.println("문자열 데이터 : " + box1.getData());
        System.out.println("정수 데이터 : " + box2.getData());

        /* Q2. 다이아몬드 연산자를 이용하여 제네릭스를 설정한 클래스를 작성하고, 데이터를 추가하고 출력하세요.
         *
         * 복습 포인트:
         * - 클래스 작성 시 다이아몬드 연산자를 이용하여 제네릭스를 설정한 클래스를 작성할 수 있다.
         *
         * 클래스명: Container
         * 필드: 데이터(data, 제네릭 타입)
         * 메소드: 데이터 추가(add), 데이터 반환(get)
         *
         * Container<Double> 타입의 인스턴스를 생성하고, 데이터를 추가하고 출력
         *
         * 출력 예시:
         * Double 데이터: 45.67
         * */
        Container<Double> container = new Container<>(45.67);
        System.out.println("Double 데이터 : " + container.get());
    }
}
