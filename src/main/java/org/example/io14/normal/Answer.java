package org.example.io14.normal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Answer {
    public static void main(String[] args) {

        /* Q1. FileReader를 이용하여 파일의 데이터를 읽고 출력하세요.
         *
         * 복습 포인트:
         * - FileReader를 이용하여 파일의 데이터를 읽어올 수 있다.
         *
         * 조건:
         * - "example.txt" 파일의 데이터를 읽어와 출력
         *
         * 출력 예시:
         * 파일 내용: Hello, World!
         * */
        try(FileReader fr = new FileReader("example.txt")){
            int d;

            System.out.println("파일 내용");
            while ((d = fr.read()) != -1) {
                System.out.print((char) d);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다: " + e.getMessage());
        }



        /* Q2. FileWriter를 이용하여 데이터를 파일로 내보내기 하세요.
         *
         * 복습 포인트:
         * - FileWriter를 이용하여 데이터를 파일로 내보내기 할 수 있다.
         *
         * 조건:
         * - "output.txt" 파일에 "Hello, Java!" 문자열을 출력
         *
         * 출력 예시:
         * output.txt 파일에 데이터가 저장되었습니다.
         * */
        try (FileWriter fw = new FileWriter("output.txt")) {

            fw.write("Hello, Java!");

            System.out.println("output.txt 파일에 데이터가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
        }

    }
}
