package com.com.tut6;

public class Item {

    private int code;
    private String name;
    private Double price;
    private Category category;
    private Seller seller;


    public Item() {
    }


    public Item(int code, String name, Double price, Category category, Seller seller) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        this.seller = seller;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }


}
