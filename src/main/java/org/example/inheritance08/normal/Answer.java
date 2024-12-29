package org.example.inheritance08.normal;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 부모 클래스의 필드와 메소드를 자식 클래스에서 활용할 수 있다.
         *
         * 클래스명: Employee (부모 클래스)
         * 필드: 이름(name, 문자열), 연봉(salary, 정수)
         * 메소드: 정보 출력(printInfo) - 이름과 연봉을 출력
         *
         * 클래스명: Manager (자식 클래스)
         * 필드: 부서(department, 문자열)
         * 메소드: 정보 출력(printInfo) - 이름, 연봉, 부서를 출력 (메소드 오버라이딩)
         *
         * Employee 객체와 Manager 객체를 생성하고, 각각의 정보 출력 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 이름: 김직원, 연봉: 5000
         * 이름: 박매니저, 연봉: 7000, 부서: 인사부
         * */
        Employee employee = new Employee("김직원", 5000);
        Manager manager = new Manager("박매니저", 7000, "인사부");
        employee.printInfo();
        manager.printInfo();

        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 추상 클래스와 추상 메소드의 개념을 이해하고 적용할 수 있다.
         *
         * 클래스명: Shape (추상 클래스)
         * 추상 메소드: 면적 계산(calculateArea)
         *
         * 클래스명: Circle (자식 클래스)
         * 필드: 반지름(radius, 실수)
         * 메소드: 면적 계산(calculateArea) - 원의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * 클래스명: Rectangle (자식 클래스)
         * 필드: 가로(width, 실수), 세로(height, 실수)
         * 메소드: 면적 계산(calculateArea) - 사각형의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * Circle 객체와 Rectangle 객체를 생성하고, 각각의 면적 계산 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 원의 면적: 78.54
         * 사각형의 면적: 200.0
         * */
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(20,10);
        System.out.println("원의 면적 : " + circle.calculateArea());
        System.out.println("사각형의 면적 : " + rectangle.calculateArea());
    }
}
