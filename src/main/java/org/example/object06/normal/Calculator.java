package org.example.object06.normal;

public class Calculator {
    /* Q2. 다음 조건에 맞는 메소드를 오버로딩하여 작성하세요.
     *
     * 복습 포인트:
     * - 오버로딩이 무엇인지 설명할 수 있다.
     * - 오버로딩의 성립 요건에 대해 설명할 수 있다.
     *
     * 클래스명: Calculator
     * 메소드: add
     * - 정수 두 개를 더하는 메소드 add(int a, int b)
     * - 정수 세 개를 더하는 메소드 add(int a, int b, int c)
     *
     * 메소드 호출: 두 개의 정수(3, 5)를 더한 결과와 세 개의 정수(1, 2, 3)를 더한 결과를 출력
     *
     * 출력 예시:
     * 3 + 5 = 8
     * 1 + 2 + 3 = 6
     * */
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
