package org.example.stream16.basic;

import java.util.Arrays;
import java.util.stream.Stream;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 배열 형태의 스트림을 생성하고, 모든 요소를 출력하세요.
         * - 정수 배열: [10, 20, 30, 40, 50]
         * - 스트림을 생성하고 forEach()를 사용해 출력하세요.
         *
         * -- 출력 예시 --
         * 10
         * 20
         * 30
         * 40
         * 50
         * */
        Integer[] iArr = new Integer[]{10,20,30,40,50};
        Stream<Integer> stream = Arrays.stream(iArr);
        stream.forEach(System.out::println);
    }
}
