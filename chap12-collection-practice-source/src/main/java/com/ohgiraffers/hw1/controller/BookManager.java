package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    //    private ArrayList<BookDTO> bookList = new ArrayList<>();
    private ArrayList<BookDTO> bookList;
//    {
//        bookList.add(new BookDTO(111, 1, "a", "aa"));
//        bookList.add(new BookDTO(222, 2, "b", "bb"));
//        bookList.add(new BookDTO(333, 3, "c", "cc"));
//        bookList.add(new BookDTO(444, 4, "d", "dd"));
//    }

    private Scanner sc;

    public BookManager() {
        bookList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        if (bookList.isEmpty())
            System.out.println("현재 책이 없습니다. 메뉴로 돌아갑니다.");
        else {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getbNo() == index) {
                    bookList.remove(i);
                    break;
                }
            }
            System.out.println("책 삭제가 완료됐습니다.");
        }

    }

    public void searchBook(String btitle) {
        int i;
        for (i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(btitle)) {
                System.out.println(bookList.get(i));
                break;
            }
        }
        if (i >= bookList.size()) {
            System.out.println("조회된 도서가 목록에 없습니다.");
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("도서가 없습니다. 메뉴로 돌아갑니다.");
            return;
        }
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }

    public List<BookDTO> sortedBookList(int type) {
        switch (type) {
            case 1:
                System.out.println("도서번호로 오름차순 정렬합니다.");
                bookList.sort(new AscBookNo());
                break;
            case 2:
                System.out.println("도서번호로 내림차순 정렬합니다.");
                bookList.sort(new DescBookNo());
                break;
            case 3:
                System.out.println("책 제목으로 오름차순 정렬합니다.");
                bookList.sort(new AscBookTitle());
                break;
            case 4:
                System.out.println("책 제목으로 내림차순 정렬합니다.");
                bookList.sort(new DescBookTitle());
                break;
            default:
                System.out.println("잘못된 값입니다. 그대로 반환합니다.");
                break;
        }
        return bookList;
    }


    public void printBookList(List<BookDTO> printList) {
        if (printList.isEmpty()) {
            System.out.println("현재 등록되어 있는 책이 없습니다. 메뉴로 돌아갑니다.");
        }
        for (int i = 0; i < printList.size(); i++) {
            System.out.println(printList.get(i));
        }
    }
}
