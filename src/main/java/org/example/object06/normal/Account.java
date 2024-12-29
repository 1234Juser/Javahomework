package org.example.object06.normal;

public class Account {
//    클래스명: Account
//         * 필드: 계좌번호(accountNumber, 문자열), 잔액(balance, 정수)
//            *
//            * 필드는 private으로 설정
//         * 잔액을 입금하는 메소드 deposit(int amount)
//         * 잔액을 조회하는 메소드 getBalance()
//         *
//                 * 인스턴스 생성: 계좌번호는 "123-456", 잔액은 0으로 설정
//         * 5000을 입금 후 잔액을 출력
    private String accountNumber;
    private int balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {

        this.balance += amount;
    }
}
