package org.example.objectarray07.basic;

public class Product {
    /* Q2. 다음 조건에 맞는 클래스를 작성하고, 객체 배열을 생성하여 총점을 출력하세요.
     *
     * 복습 포인트:
     * - 객체 배열의 개념을 이해하고 설명할 수 있다.
     * - 객체 배열을 활용하여 여러 객체를 관리할 수 있다.
     *
     * 클래스명: Product
     * 필드: 이름(name, 문자열), 가격(price, 정수)
     *
     * 객체 배열 생성: 크기가 3인 Product 배열을 생성하고,
     * 각각의 객체는 "상품1", 1000, "상품2", 2000, "상품3", 3000의 값을 가짐
     *
     * 총 가격을 계산하여 출력
     *
     * 출력 예시:
     * 총 가격: 6000
     * */
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
