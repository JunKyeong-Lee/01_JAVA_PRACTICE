package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro = null;
    public static int count;

    Scanner sc = new Scanner(System.in);

    {
        pro = new ProductDTO[10];
    }

    public void mainMenu() {
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
        } while (true);
    }

    public void productInput() {
        System.out.println("=============================");
        System.out.println("제품 정보 추가를 시작합니다.");

        System.out.print("제품 번호 : ");
        int pId = sc.nextInt();

        sc.nextLine();
        System.out.print("제품명 : ");
        String pName = sc.nextLine();

        System.out.print("제품 가격 : ");
        int price = sc.nextInt();

        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[this.count] = new ProductDTO(pId, pName, price, tax);
    }

    public void productPrint() {
        System.out.println("=============================");
        for (int i = 0; i < this.count; i++) {
            System.out.println(pro[i].information());
        }
        if (this.count == 0) {
            System.out.println("도서가 등록되어 있지 않습니다.");
        } else {
            System.out.println("총 " + this.count + "개의 도서가 있습니다.");
        }
    }

    /*제품 삭제, 수정, 검색 추가 예정*/
}
