package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescBookNo implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o2.getbNo() - o1.getbNo();
    }
}
