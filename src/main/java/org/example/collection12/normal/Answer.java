package org.example.collection12.normal;

import java.util.HashSet;
import java.util.TreeSet;

public class Answer {
    public static void main(String[] args) {
        /* Q1. HashSet을 생성하고, 요소를 추가하고, 중복된 요소가 저장되지 않음을 확인하세요.
         *
         * 복습 포인트:
         * - HashSet의 특징을 이해하고 주요 메소드 사용 방법을 숙지하여 개발에 적용할 수 있다.
         *
         * 조건:
         * - HashSet에 "Apple", "Banana", "Orange", "Apple"을 추가
         * - "Apple"이 하나만 저장되었는지 확인
         *
         * 출력 예시:
         * HashSet의 크기: 3
         * */
        HashSet<String> set = new HashSet();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        System.out.println("HashSet의 크기 : " + set.size());

        /* Q2. TreeSet을 생성하고, 요소를 추가하고, 오름차순으로 정렬된 결과를 확인하세요.
         *
         * 복습 포인트:
         * - TreeSet의 특징을 이해하고 주요 메소드 사용 방법을 숙지하여 개발에 적용할 수 있다.
         *
         * 조건:
         * - TreeSet에 5, 3, 8, 1, 2를 추가
         * - 오름차순으로 정렬된 결과를 출력
         *
         * 출력 예시:
         * TreeSet의 요소: [1, 2, 3, 5, 8]
         * */
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet의 요소 :" +treeSet);
    }
}
