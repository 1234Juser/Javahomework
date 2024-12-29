package org.example.object06.hard;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 다음 조건에 맞는 클래스를 작성하고, 인스턴스를 생성하여 필드를 출력하세요.
         *
         * 복습 포인트:
         * - 추상화를 이해하고 설명할 수 있다.
         * - 객체를 추상화하여 클래스를 작성하고 이를 활용할 수 있다.
         *
         * 클래스명: Book
         * 필드: 제목(title, 문자열), 저자(author, 문자열), 가격(price, 정수)
         *
         * 생성자: 모든 필드를 매개변수로 받아 초기화하는 생성자
         *
         * 인스턴스 생성: 제목은 "자바의 정석", 저자는 "남궁성", 가격은 30000으로 설정
         *
         * 출력 예시:
         * 제목: 자바의 정석
         * 저자: 남궁성
         * 가격: 30000
         * */
        Book book = new Book("자바의 정석", "남궁성", 30000);
        System.out.println("제목 : " + book.title);
        System.out.println("저자 : " + book.author);
        System.out.println("가격 : " + book.price);

        /* Q2. 다음 조건에 맞는 클래스를 작성하고, 인스턴스를 생성하여 필드를 출력하세요.
         *
         * 복습 포인트:
         * - 싱글톤 패턴에 대해 이해할 수 있다.
         * - 싱글톤 패턴의 장단점에 대해 이해할 수 있다.
         * - 이른 초기화와 게으른 초기화를 구분하여 싱글톤 패턴을 구현할 수 있다.
         *
         * 클래스명: Singleton
         * 메소드: getInstance() - 싱글톤 객체를 반환하는 메소드
         *
         * 인스턴스 생성: Singleton 객체를 생성하고 메소드를 호출하여 같은 객체인지 확인
         *
         * 출력 예시:
         * 두 객체는 같은 인스턴스입니다.
         * */
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("두 객체는 같은 인스턴스입니다.");
        } else {
            System.out.println("두 객체는 다른 인스턴스입니다.");
        }
    }
    }

