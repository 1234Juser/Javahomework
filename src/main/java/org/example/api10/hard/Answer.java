package org.example.api10.hard;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Answer {
    public static void main(String[] args) {
        /* Q1. Calendar 클래스를 사용하여 특정 날짜를 설정하고, 년, 월, 일, 요일을 출력하세요.
         *
         * 복습 포인트:
         * - Calendar와 GregorianCalendar 클래스를 이용하여 원하는 날짜 인스턴스를 생성할 수 있다.
         * - Calendar의 년, 월, 일, 시, 분, 초, 요일 정보를 따로 추출하여 개발에 활용할 수 있다.
         *
         * 조건:
         * - 2023년 7월 1일을 설정하고, 해당 날짜의 년, 월, 일, 요일을 출력
         *
         * 출력 예시:
         * 년: 2023
         * 월: 7
         * 일: 1
         * 요일: 토요일
         * */

        Calendar gregorianCalendar = new GregorianCalendar();

        int year = 2023;
        int month = 7;
        int day = 1;
        String dayOfWeek = "토요일";


        System.out.println("년: " + year);
        System.out.println("월: " + month);
        System.out.println("일: " + day);
        System.out.println("요일: " + dayOfWeek);

        /* Q2. Object 클래스의 equals() 메소드를 오버라이딩하여 두 객체를 비교하세요.
         *
         * 복습 포인트:
         * - equals() 메소드 오버라이딩 목적을 이해하고 개발에 적용할 수 있다.
         * - 동일객체와 동등객체의 차이점을 설명할 수 있다.
         *
         * 클래스명: Person
         * 필드: 이름(name, 문자열), 나이(age, 정수)
         *
         * Person 클래스의 equals() 메소드를 오버라이딩하여 이름과 나이가 같으면 동일한 객체로 간주
         *
         * Person 객체 두 개를 생성하고, equals() 메소드를 사용하여 두 객체가 동일한지 비교하여 결과를 출력
         *
         * 출력 예시:
         * 두 객체는 동일합니다.
         * */
        Person person1 = new Person("사람", 1);
        Person person2 = new Person("사람", 1);
        if (person1.equals(person2)) {
            System.out.println("두 객체는 동일합니다.");
        }

    }
}
