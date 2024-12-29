package org.example.literal01.hard;

public class answer {
    public static void main(String[] args) {

        /* 예시 문제를 작성해주세요 */

        /* answer 클래스명 기재
         *  문제 기재
         * 상수와 오버플로우 언더플로우(byte)를 사용한다음 각각 상수값이랑 더하시오
         * 상수값은 30
         * */
        final int a = 30;
        byte b = 127;
        b++;
        byte c = -128;
        c--;
        System.out.println("상수와 오버플로우 합 : " + (a+b));
        System.out.println("상수와 언더플로우 합 : " + (a+c));

    }

}
