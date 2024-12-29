package org.example.control04.basic;

import java.util.Scanner;

public class Answer {
    Scanner sc = new Scanner(System.in);

    public void basic1() {

        /* Q1. 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */

        System.out.print("정수를 입력하세요 : ");
        int i = sc.nextInt();
        if (i > 0) {
            System.out.println("양수다");
        } else {
            System.out.println("양수가 아니다");
        }
    }

    public void basic2() {
        /* Q2. 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요.
         * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 홀수다.
         * */

        int i = sc.nextInt();
        System.out.print("정수를 하나 입력하세요 : ");
        if (i % 2 == 0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다");
        }
    }


    /* Q3. 1부터 10까지 합계를 구하고 결과를 출력하세요. (반복문 사용)
     *
     * -- 출력 예시 --
     * 1부터 10까지의 합 : 55
     * */
    public void basic3(){
        int sum =0;
        int i = 0;
        for(i = 0; i<=10; i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }
    /* Q4. 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요.
     *
     * -- 입력 예시 --
     * 정수를 입력하세요 : 5
     *
     * -- 출력 예시 --
     * 1부터 5까지의 합 : 15
     * */
    public void basic4(){
        System.out.print("정수를 입력하세요 : ");
        int i = sc.nextInt();
        int b=1;
        int sum=0;
        for(b=1; b<=i; b++){
            sum+=b;
        }
        System.out.println("1부터 " +i+ "까지의 합 : ");
    }
    /* Q5. 1부터 입력받은 정수까지의 짝수의 합을 구하세요.
     *
     * -- 입력 예시 --
     * 정수를 입력하세요 : 10
     *
     * -- 출력 예시 --
     * 1부터 10까지 짝수의 합 : 30
     * */
    public void basic5(){
        int i = sc.nextInt();
        System.out.printf("정수를 입력하세요 : ");
        int b = 1;
        int sum = 0;
        for(b=1; b<=i; b++){
            if(b%2==0){
                sum +=b;
            }
        }
        System.out.println("1부터 " + i+ "까지 짝수의 합 : "+ sum);
    }
}