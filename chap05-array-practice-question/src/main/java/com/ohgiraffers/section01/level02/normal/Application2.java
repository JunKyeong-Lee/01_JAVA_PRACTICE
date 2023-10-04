package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 (예시: 123456-1234567)(- 포함 14자리 입력): ");
        String str = sc.nextLine();

        if (str.length() != 14) {
            System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
            System.exit(0);
        } else if (str.charAt(6) != '-') {
            System.out.println("형식에 안맞습니다. 프로그램을 종료합니다.");
            System.exit(0);
        } else {
            int digitCount = 0;
            for (int i = 0; i < str.length(); i++) {
                String digit = "0123456789";
                for (int j = 0; j < digit.length(); j++) {
                    if (str.charAt(i) == digit.charAt(j)) {
                        digitCount++;
                        break;
                    }
                }
            }
            if (digitCount != 13) {
                System.out.println("형식에 안맞습니다. 프로그램을 종료합니다.");
                System.exit(0);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (i <= 7) {
                System.out.print(str.charAt(i) + "");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();

    }
}
