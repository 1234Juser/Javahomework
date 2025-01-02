package org.example.collection12.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class Answer {
    public static void main(String[] args) {
        /* Q1. ArrayList를 생성하고, 요소를 추가하고, 오름차순으로 정렬하세요.
         *
         * 복습 포인트:
         * - ArrayList의 사용 목적에 대해 이해할 수 있다.
         * - ArrayList의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         * - Collections.sort() 메소드를 이용하여 오름차순 정렬을 할 수 있다.
         *
         * 조건:
         * - ArrayList에 5, 3, 8, 1, 2를 추가
         * - 오름차순으로 정렬하여 출력
         *
         * 출력 예시:
         * 정렬된 리스트: [1, 2, 3, 5, 8]
         * */
        List<String> list = new ArrayList<>();
        list.add("5");
        list.add("3");
        list.add("8");
        list.add("1");
        list.add("2");
        Collections.sort(list);
        System.out.println("정렬된 리스트 : " +list);
        /* Q2. LinkedList를 생성하고, 요소를 추가하고, 첫 번째와 마지막 요소를 출력하세요.
         *
         * 복습 포인트:
         * - LinkedList의 구조를 이해하고 인스턴스를 생성할 수 있다.
         * - LinkedList의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - LinkedList에 "A", "B", "C", "D", "E"를 추가
         * - 첫 번째 요소와 마지막 요소를 출력
         *
         * 출력 예시:
         * 첫 번째 요소: A
         * 마지막 요소: E
         * */
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        System.out.println("첫 번째 요소: " + list1.getFirst());
        System.out.println("마지막 요소: " + list1.getLast());
    }
}
