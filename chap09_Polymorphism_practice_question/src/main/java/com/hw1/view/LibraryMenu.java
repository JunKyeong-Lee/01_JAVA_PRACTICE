package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("=====회원등록=====");
        System.out.print("이름을 입력하세요. : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요.(0~ ) :");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요.(남, 여) : ");
        char gender = sc.nextLine().charAt(0);

        Member member = new Member(name, age, gender);
        lm.insertMember(member);

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print(" 메뉴를 골라주세요(1, 2, 3, 4, 0) >> ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력했습니다. 다시 메뉴로 진입합니다.");
                    break;
            }
        }
    }

    public void selectAll() {
        System.out.println("=====전체 도서 목록을 출력합니다=====");
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.println("=====도서를 검색합니다.=====");
        sc.nextLine();
        System.out.print("검색할 제목 키워드 : ");
        Book[] searchList = lm.searchBook(sc.nextLine());

        for (Book book : searchList) {
            if (book != null)
                System.out.println(book);
        }

    }

    public void rentBook() {
        selectAll();
        System.out.println("=====책을 대여합니다.=====");

        System.out.print("대여할 도서 번호 선택 : ");
        int result = lm.rentBook(sc.nextInt());
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여가 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다.");
            System.out.println("요리학원 쿠폰이 발급되었습니다.");
            System.out.println("마이페이지를 통해 확인하세요.");
        }
    }
}
