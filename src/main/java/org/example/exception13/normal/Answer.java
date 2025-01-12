package org.example.exception13.normal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 사용자 정의 예외 클래스를 작성하고, 특정 조건에서 예외를 발생시키세요.
         *
         * 복습 포인트:
         * - 사용자 정의 예외 클래스를 작성할 수 있다.
         * - 사용자 정의의 예외 클래스와 예외처리 문법을 이용하여 프로그램의 흐름을 제어할 수 있다.
         *
         * 클래스명: NegativeNumberException (사용자 정의 예외 클래스)
         * 조건:
         * - 음수를 입력받으면 NegativeNumberException을 발생시키고, 적절한 메시지를 출력
         *
         * 출력 예시:
         * 음수는 입력할 수 없습니다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int n = sc.nextInt();

        try{
            if(n<0){
                throw new NegativeNumberException("음수는 입력할 수 없습니다.");
            }

        } catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }
        /* Q2. 파일을 읽어오는 프로그램을 작성하고, try-with-resources 구문을 사용하세요.
         *
         * 복습 포인트:
         * - try-with-resource 구문의 사용 목적을 이해하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - 파일을 읽어와 내용을 출력
         * - try-with-resources 구문을 사용하여 파일을 닫는 것을 자동으로 처리
         *
         * 출력 예시:
         * 파일 내용: Hello, World!
         * */
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {

            String str;

            while ((str = br.readLine()) != null) {
                System.out.println("파일 내용: " + str);
            }

        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }

}
