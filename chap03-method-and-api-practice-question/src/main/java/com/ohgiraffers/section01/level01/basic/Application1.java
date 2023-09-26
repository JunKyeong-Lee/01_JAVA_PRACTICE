package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        /* Calculater 클래스의 메소드를 호출해서 실행 */
        Calculator calc = new Calculator();
        int a = 10, b = 20;

        calc.checkMethod();
        System.out.println(calc.sumTwoNumber(a, b));
        System.out.println(calc.multiTowerNumber(a, b));
        System.out.println(a + "과 " + b + "의 곱은 " + calc.multiTowerNumber2(a, b) + "입니다.");
    }
}
