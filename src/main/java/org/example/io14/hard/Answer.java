package org.example.io14.hard;

import java.io.*;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 보조 스트림을 이용하여 파일의 데이터를 읽고 쓰세요.
         *
         * 복습 포인트:
         * - 보조 스트림의 사용 목적에 대해 이해할 수 있다.
         * - 버퍼를 이용한 성능 향상 보조 스트림을 이해하고 파일에 입출력 할 수 있다.
         * - 형변환 보조 스트림을 이해하고 파일에 입출력 할 수 있다.
         * - 데이터 타입별 처리 기능을 추가한 보조 스트림을 이해하고 파일에 입출력 할 수 있다.
         * - 객체 단위로 입출력하는 보조 스트림을 이해하고 파일에 입출력 할 수 있다.
         *
         * 조건:
         * - "data.dat" 파일에 정수 123, 문자열 "Hello, Stream!"을 저장
         * - DataOutputStream과 BufferedOutputStream을 사용하여 데이터를 파일에 저장
         * - DataInputStream과 BufferedInputStream을 사용하여 파일에서 데이터를 읽어와 출력
         * - 입출력 과정에서 발생할 수 있는 IOException을 적절히 처리
         *
         * 출력 예시:
         * data.dat 파일에 데이터가 저장되었습니다.
         * 정수: 123
         * 문자열: Hello, Stream!
         * */

        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")))) {
            dos.writeInt(123);
            dos.writeUTF("Hello, Stream!");
            System.out.println("data.dat 파일에 데이터가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("data.dat")))) {
            int number = dis.readInt();
            String message = dis.readUTF();
            System.out.println("정수: " + number);
            System.out.println("문자열: " + message);
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
