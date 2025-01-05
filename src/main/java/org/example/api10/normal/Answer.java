package org.example.api10.normal;

import java.sql.Wrapper;

public class Answer {
    public static void main(String[] args) {
        /* Q1. StringBuilder를 사용하여 문자열을 합치고, 특정 문자열을 삽입하세요.
         *
         * 복습 포인트:
         * - StringBuilder 클래스를 이용하여 문자열 합치기를 할 수 있다.
         * - String과 StringBuilder의 차이점을 이해하고 설명할 수 있다.
         *
         * 조건:
         * - "Hello"와 "World" 문자열을 합치고, "Java" 문자열을 중간에 삽입하여 출력
         *
         * 출력 예시:
         * HelloJavaWorld
         * */
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World");
        stringBuilder.insert(5,"Java");
        System.out.println(stringBuilder);

        /* Q2. Wrapper 클래스를 사용하여 문자열을 숫자로 변환하고, 숫자를 문자열로 변환하세요.
         *
         * 복습 포인트:
         * - Wrapper 클래스와 기본자료형 값 비교의 차이점을 이해하고 개발에 적용할 수 있다.
         * - Wrapper 클래스를 이용하여 문자열 데이터를 parsing하고 개발에 적용할 수 있다.
         * - Wrapper 클래스 자료형 값을 문자열로 변경하는 방식을 이해하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - 문자열 "1234"를 정수로 변환하고, 5678을 문자열로 변환하여 출력
         *
         * 출력 예시:
         * 문자열 "1234"를 정수로 변환: 1234
         * 정수 5678을 문자열로 변환: "5678"
         * */
        int a = Integer.parseInt("1234");
        String b = String.valueOf(5678);
        System.out.println("문자열 1234를 정수로 변환 : " + a );
        System.out.println("정수 5678을 문자열로 변환 : " + b);
    }

}
