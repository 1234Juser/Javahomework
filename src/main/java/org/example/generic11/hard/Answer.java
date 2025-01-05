package org.example.generic11.hard;

import javax.swing.plaf.multi.MultiMenuItemUI;

public class Answer {
    public static void main(String[] args) {
        /* Q1. 제네릭스를 사용하여 여러 타입의 데이터를 저장할 수 있는 클래스를 작성하고, 데이터를 추가하고 출력하세요.
         *
         * 복습 포인트:
         * - 제네릭스를 사용하여 여러 타입의 데이터를 저장할 수 있는 클래스를 작성할 수 있다.
         *
         * 클래스명: MultiBox
         * 필드: 첫 번째 데이터(firstData, 제네릭 타입), 두 번째 데이터(secondData, 제네릭 타입)
         * 메소드: 첫 번째 데이터 추가(setFirstData), 두 번째 데이터 추가(setSecondData), 데이터 출력(printData)
         *
         * MultiBox<String, Integer>와 MultiBox<Double, String> 타입의 인스턴스를 생성하고, 데이터를 추가하고 출력
         *
         * 출력 예시:
         * 첫 번째 데이터: Hello, 두 번째 데이터: 100
         * 첫 번째 데이터: 45.67, 두 번째 데이터: World
         * */
        MultiBox<String, Integer> multiBox1 = new MultiBox<>();
        multiBox1.setFirstData("Hello");
        multiBox1.setSecondData(100);
        multiBox1.printData();

        MultiBox<Double, String> multiBox2 = new MultiBox<>();
        multiBox2.setFirstData(45.67);
        multiBox2.setSecondData("World");
        multiBox2.printData();

        /* Q2. 제네릭 클래스를 작성하고, 와일드카드를 사용하여 특정 타입 범위의 데이터를 처리하세요.
         *
         * 복습 포인트:
         * - 와일드카드를 사용하여 인자의 타입 범위를 제한할 수 있다.
         *
         * 클래스명: DataProcessor
         * 필드: 데이터 리스트(dataList, List<? extends Number>)
         * 메소드: 데이터 추가(addData), 데이터 처리(processData)
         *
         * DataProcessor 타입의 인스턴스를 생성하고, 데이터를 추가한 후 데이터 처리 결과를 출력
         *
         * 출력 예시:
         * 데이터 처리 결과: [10, 20.5, 30, 40.7]
         * */
        DataProcessor<Number> dataProcessor = new DataProcessor<>();

        dataProcessor.addData(10);
        dataProcessor.addData(20.5);
        dataProcessor.addData(30);
        dataProcessor.addData(40.7);

        System.out.println("데이터 처리 결과: " + dataProcessor.processData());

    }
    }

