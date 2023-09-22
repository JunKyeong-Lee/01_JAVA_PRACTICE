package com.ohgiraffers.operatorPractice;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
         * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
         *
         * 19
         *
         * ------ 출력 결과 --------
         * 청소년
         * */
        int age1 = 19;
        int age2 = 13;
        int age3 = 14;
        int age4 = 20;

        System.out.println(age1 <= 13 ? "어린이" : age1 <= 19 ? "청소년" : "성인"); // 청소년
//        System.out.println(age2 <= 13 ? "어린이" : age2 <= 19 ? "청소년" : "성인"); // 어린이
//        System.out.println(age3 <= 13 ? "어린이" : age3 <= 19 ? "청소년" : "성인"); // 청소년
//        System.out.println(age4 <= 13 ? "어린이" : age4 <= 19 ? "청소년" : "성인"); // 성인
    }
}
