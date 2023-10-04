package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int[] lottoNumber = new int[7];

        label:
        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = (int) (Math.random() * (45 - 1) + 1);

            for (int j = 0; j < i; j++) {
                if (lottoNumber[i] == lottoNumber[j]) {
                    i--;
                    continue label;
                }
            }
        }

        sort(lottoNumber);

        for (var x : lottoNumber) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        int temp;
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
