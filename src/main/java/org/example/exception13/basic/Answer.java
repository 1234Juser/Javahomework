package org.example.exception13.basic;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 두 수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요.
         *
         * 복습 포인트:
         * - 오류와 예외를 구분해서 설명할 수 있다.
         * - 예외처리의 목적에 대해 이해하고 설명할 수 있다.
         * - 예외처리 방법에 대해 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - 두 수를 입력받아 나눗셈을 수행
         * - 0으로 나누는 경우 ArithmeticException을 처리하여 적절한 메시지를 출력
         *
         * 출력 예시:
         * 나누기 결과: 5
         * 0으로 나눌 수 없습니다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 ");
        int a = sc.nextInt();
        System.out.print("두번째 수 ");
        int b = sc.nextInt();
        try{
            int result = a/b;
            System.out.println("나누기 결과 : " + result);
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        /* Q2. 배열의 인덱스를 입력받아 해당 인덱스의 요소를 출력하는 프로그램을 작성하세요.
         *
         * 복습 포인트:
         * - 예외처리의 목적에 대해 이해하고 설명할 수 있다.
         * - 예외처리 방법에 대해 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - 배열의 인덱스를 입력받아 요소를 출력
         * - 인덱스가 배열의 범위를 벗어나는 경우 ArrayIndexOutOfBoundsException을 처리하여 적절한 메시지를 출력
         *
         * 출력 예시:
         * 배열의 요소: 10
         * 인덱스가 배열의 범위를 벗어났습니다.
         * */
        int[] c = new int[10];

        System.out.print("배열의 요소 인덱스 입력 ");
        int d = sc.nextInt();

        try{
            System.out.println("배열의 요소 : " + c[d]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스가 배열의 범위를 벗어났습니다.");
        }

    }
}
