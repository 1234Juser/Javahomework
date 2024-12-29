package org.example.inheritance08.basic;

public class Person {
    /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
     *
     * 복습 포인트:
     * - 상속의 개념을 이해하고 설명할 수 있다.
     * - 부모 클래스와 자식 클래스의 관계를 이해할 수 있다.
     *
     * 클래스명: Person (부모 클래스)
     * 필드: 이름(name, 문자열), 나이(age, 정수)
     * 메소드: 자기소개(selfIntroduction) - 이름과 나이를 출력
     *
     * 클래스명: Student (자식 클래스)
     * 필드: 학번(studentId, 정수)
     * 메소드: 공부하기(study) - "공부 중" 메시지 출력
     *
     * Person 객체와 Student 객체를 생성하고, 각각의 메소드를 호출하여 결과를 출력
     *
     * 출력 예시:
     * 이름: 홍길동, 나이: 20
     * 공부 중
     * */
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void selfIntroduction(){
        System.out.println("이름 : " + name + " , 나이 : " + age);
    }
}
