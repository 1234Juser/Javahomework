package org.example.objectarray07.hard;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        /* Q. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록하고, 전체 회원 조회 시 여러 명의 회원 정보를 반환하세요.
         *
         * 복습 포인트:
         * - 객체 배열의 개념을 이해하고 설명할 수 있다.
         * - 객체 배열을 활용하여 여러 객체를 관리할 수 있다.
         * - 여러 클래스를 협력하여 객체 지향 프로그래밍을 구현할 수 있다.
         *
         * 클래스명: Member
         * 필드: 번호(num, 정수), 아이디(id, 문자열), 비밀번호(pwd, 문자열), 이름(name, 문자열), 나이(age, 정수), 성별(gender, 문자)
         *
         * 클래스명: MemberRepository
         * 메소드:
         * - store(Member[] members): 여러 회원 정보를 저장하는 static 메소드
         * - findAllMembers(): 저장된 모든 회원 정보를 반환하는 static 메소드
         *
         * 클래스명: MemberService
         * 메소드:
         * - signUpMembers(): 여러 명의 회원 정보를 입력받아 등록하는 메소드
         * - showAllMembers(): 등록된 모든 회원 정보를 출력하는 메소드
         * - filterMembers(): 특정 조건에 맞는 회원 정보를 필터링하여 출력하는 메소드
         * - showStatistics(): 전체 회원의 평균 나이와 성별 통계를 출력하는 메소드
         *
         * 각 클래스와 메소드를 구현하여 회원 관리 시스템을 완성하세요.
         *
         * 출력 예시:
         * 1. 회원 등록
         * 2. 회원 전체 조회
         * 3. 조건에 따른 회원 조회
         * 4. 평균 나이 및 성별 통계
         * 9. 프로그램 종료
         * */   // 사용자로부터의 입력을 받을 수 있는 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 회원 정보 조회 및 등록이라는 주된 업무를 처리해주는 매니저 인스턴스(회원 관리자) 생성
        MemberService memberManager = new MemberService();

        // while문을 사용해 반복되는 프로그램 작성
        while(true) {
            System.out.println("============== 회원 관리 프로그램 ==============");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 조건에 따른 회원 조회");
            System.out.println("4. 평균 나이 및 성별 통계");
            System.out.println("9. 프로그램 종료");

            System.out.print("원하시는 메뉴의 번호를 선택해주세요 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1: memberManager.signUpMembers(); break;
                case 2: memberManager.showAllMembers(); break;
                case 3: memberManager.filterMembers();break;
                case 4: memberManager.showStatics();break;
                case 9: System.out.println("프로그램을 종료합니다..."); return;
                default: System.out.println("잘못된 번호를 입력하셨습니다."); break;
            }
        }
    }
}