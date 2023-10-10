package com.ohgiraffers.hw3.model.vo;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
    private int pId;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
        ProductController.count++;
    }

    public ProductDTO(int pId, String pName, int price, double tax) {
        this();
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public String information() {
        return "제품 번호 : " + getpId() +
                ", 제품명 : " + getpName() +
                ", 제품 가격 : " + getPrice() +
                ", 제품 세금 : " + getTax();
    }
}
