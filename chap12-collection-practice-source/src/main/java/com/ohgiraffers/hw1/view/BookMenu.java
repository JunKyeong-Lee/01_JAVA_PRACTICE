package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc;
    private BookManager bm;

    public BookMenu() {
        sc = new Scanner(System.in);
        bm = new BookManager();
    }

    public void mainMenu() {
        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("새 도서를 추가합니다.");
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("도서 정보를 정렬 후 출력합니다.");
                    bm.printBookList(selectSortedBook());
                    break;
                case 3:
                    System.out.println("---------------------------");
                    System.out.println("도서를 삭제합니다.");
                    bm.deleteBook(inputBookNo());
                    break;
                case 4:
                    System.out.println("---------------------------");
                    System.out.println("도서를 검색합니다.");
                    bm.searchBook(inputBookTitle());
                    break;
                case 5:
                    System.out.println("---------------------------");
                    System.out.println("도서 전체를 출력합니다.");
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("---------------------------");
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("---------------------------");
                    System.out.println("잘못 입력했습니다. 처음으로 돌아갑니다.");
                    break;
            }
        }
    }

    public BookDTO inputBook() {
        int bNo = inputBookNo();
        System.out.print("도서 제목 : ");
        sc.nextLine();
        String title = sc.nextLine();
        int category;
        while (true) {
            System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
            category = sc.nextInt();
            if (category < 1 || category > 4) {
                System.out.println("다시 입력해주세요!");
            } else {
                break;
            }
        }
        System.out.print("도서 저자 : ");
        sc.nextLine();
        String author = sc.nextLine();
        return new BookDTO(bNo, category, title, author);

    }

    public int inputBookNo() {
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        return bNo;
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        sc.nextLine();
        String title = sc.nextLine();
        return title;
    }

    public List<BookDTO> selectSortedBook() {
        System.out.println("1. 도서번호(ISBN)으로 오름차순정렬");
        System.out.println("2. 도서번호(ISBN)으로 내림차순정렬");
        System.out.println("3. 책 제목으로 오름차순 정렬");
        System.out.println("4. 책 제목으로 내림차순 정렬");
        System.out.print("메뉴 번호 선택 : ");
        int menu = sc.nextInt();
        return bm.sortedBookList(menu);
    }
}
