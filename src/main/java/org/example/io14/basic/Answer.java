package org.example.io14.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Answer {
    public static void main(String[] args) {
        /* 어려우면 답 부터 먼저 보고나서 흐름을 파악한 후 flow chart를 그려보고 다시 도전해보세요~! */

        /* Q1. File 클래스를 이용하여 새로운 파일을 생성하고, 해당 파일이 존재하는지 확인하세요.
         *
         * 복습 포인트:
         * - File 클래스의 주요 메소드를 숙지하여 개발에 적용할 수 있다.
         *
         * 조건:
         * - "example.txt" 파일을 생성하고, 해당 파일이 존재하는지 확인하여 존재 여부를 출력
         *
         * 출력 예시:
         * example.txt 파일이 생성되었습니다.
         * example.txt 파일이 존재합니다.
         * */
        File file = new File("src/main/java/org/example/io14/example.txt");
        try{
            boolean exists = file.createNewFile();
            System.out.println("example.txt 파일이 생성되었습니다.");
            System.out.println("example.txt 파일이 존재합니다.");
        }catch (IOException e) {
            e.printStackTrace();
        }

        /* Q2. FileInputStream을 이용하여 파일의 데이터를 읽고 출력하세요.
         *
         * 복습 포인트:
         * - FileInputStream을 이용하여 파일의 데이터를 읽어올 수 있다.
         *
         * 조건:
         * - "example.txt" 파일의 데이터를 읽어와 출력
         *
         * 출력 예시:
         * 파일 내용: Hello, World!
         * */
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("src/main/java/org/example/io14/example.txt");
            int value;
            System.out.print("파일 내용 : ");

            while((value = fis.read()) != -1) {
                System.out.print((char) value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
