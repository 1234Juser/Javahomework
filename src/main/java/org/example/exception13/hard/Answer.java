package org.example.exception13.hard;

import java.io.IOException;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 예외처리를 위임하는 메소드 오버라이딩을 작성하세요.
         *
         * 복습 포인트:
         * - 예외처리를 위임한 메소드 오버라이딩 성립 요건을 이해하고 개발에 적용할 수 있다.
         *
         * 클래스명: Parent (부모 클래스)
         * 메소드: void doSomething() throws IOException
         *
         * 클래스명: Child (자식 클래스)
         * 메소드: void doSomething() throws IOException (메소드 오버라이딩)
         *
         * 조건:
         * - Child 클래스에서 부모 클래스의 doSomething 메소드를 오버라이딩하고, IOException을 던짐
         * - 메인 메소드에서 Child 객체를 생성하고 doSomething 메소드를 호출하여 예외를 처리
         *
         * 출력 예시:
         * 예외가 발생했습니다: 예외 메시지
         * */
        Child child = new Child();
        try{
            child.doSomething();
        }catch(IOException e){
            System.out.println("예외가 발생했습니다." +e.getMessage());
        }

    }
}
