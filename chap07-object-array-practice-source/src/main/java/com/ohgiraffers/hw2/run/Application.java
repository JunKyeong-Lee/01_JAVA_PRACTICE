package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDTO[] studentDTOs = new StudentDTO[10];
        for (int i = 0; i < studentDTOs.length; i++) {
            studentDTOs[i] = new StudentDTO();
        }

        double korAvg = 0;
        double engAvg = 0;
        double mathAvg = 0;

        int count = 0;

        while (true) {
            System.out.println("학생의 정보를 입력하세요.");
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            studentDTOs[count].setGrade(grade);

            System.out.print("반 : ");
            int classroom = sc.nextInt();
            studentDTOs[count].setClassroom(classroom);

            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            studentDTOs[count].setName(name);

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            studentDTOs[count].setKor(kor);
            korAvg += kor;

            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            studentDTOs[count].setEng(eng);
            engAvg += eng;

            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            studentDTOs[count].setMath(math);
            mathAvg += math;

            count++;

            sc.nextLine();
            System.out.print("계속 추가하겠습니까? : (y)");
            String no = sc.nextLine();
            if (!(no.length() == 1 && no.charAt(0) == 'y')) {
                break;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(studentDTOs[i].information());
        }
        System.out.println("국어평균 : " + korAvg / count);
        System.out.println("영어평균 : " + engAvg / count);
        System.out.println("수학평균 : " + mathAvg / count);
    }
}
