package org.example.generic11.normal;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 제네릭 메소드를 작성하여 리스트의 모든 요소를 출력하세요.
         *
         * 복습 포인트:
         * - 제네릭스가 적용된 메소드를 작성할 수 있다.
         *
         * 메소드명: printList
         * 매개변수: 리스트(list, 제네릭 타입의 리스트)
         *
         * List<String>과 List<Integer> 타입의 리스트를 생성하고, 데이터를 추가한 후 제네릭 메소드를 호출하여 출력
         *
         * 출력 예시:
         * 문자열 리스트: [Hello, Generics, Java]
         * 정수 리스트: [1, 2, 3]
         * */

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Generics");
        list1.add("Java");
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        printList(list1);
        printList(list2);







        /* Q2. 와일드카드를 사용하여 제네릭 클래스의 인자의 타입 범위를 제한하세요.
         *
         * 복습 포인트:
         * - 와일드카드를 이용하여 인자의 타입 범위를 제한할 수 있다.
         *
         * 클래스명: NumberBox
         * 필드: 숫자 리스트(numbers, List<? extends Number>)
         * 메소드: 숫자 추가(addNumber), 숫자 반환(getNumbers)
         *
         * NumberBox 타입의 인스턴스를 생성하고, 데이터를 추가한 후 숫자 리스트를 출력
         *
         * 출력 예시:
         * 숫자 리스트: [10, 20, 30.5, 40.7]
         * */
        NumberBox numberBox = new NumberBox<>();
        numberBox.addNumber(10);
        numberBox.addNumber(20);
        numberBox.addNumber(30.5);
        numberBox.addNumber(40.7);

        System.out.println("숫자 리스트: " + numberBox.getNumbers());



    }

    public static <T> void printList(List<T> a){
        System.out.println(a);

    }
}
