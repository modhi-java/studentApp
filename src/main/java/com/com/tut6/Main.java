package com.com.tut6;

public class Main {
    public static void main(String[] args) {


        Category category1 = new Category();
        category1.setNamet("حلويات");

        Category category2 = new Category();
        category2.setNamet("أجبان");

        Category category3 = new Category();
        category3.setNamet("أعشاب");

        Category category = new Category();
        category.setNamet("سناكس");


        Seller seller = new Seller();
        seller.setNamet("مؤسسة المدار");

        Seller seller1 = new Seller();
        seller1.setNamet("الشركة السعودية للتغذية");


        Item n1 = new Item(1, "بطاطس السعودية", 8.0, category, seller);

        //الطريقة في الاعلى عند استخدامنا للكونستركتر وفي الاسفل بدون كونستركتور
        //Item n1 = new Item();
//        n1.setCode(1);
//        n1.setName("بطاطس السعودية");
//        n1.setPrice(8.0);
//        n1.setCategory(category);
//        n1.setSeller(seller);

        System.out.println("رقم الصنف / " + n1.getCode());
        System.out.println("اسم الصنف / " + n1.getName());
        System.out.println("السعر / " + n1.getPrice());
        System.out.println("التصنيف / " + n1.getCategory().getNamet());
        System.out.println("التاجر / " + n1.getSeller().getNamet());
        System.out.println("/////////////////////////////////////////// ");

        Item n2 = new Item(2, "حلاوة طحينية", 77.0, category1, seller1);
//        n2.setCode(2);
//        n2.setName("حلاوة طحينية");
//        n2.setPrice(77.0);
//        n2.setCategory(category1);
//        n2.setSeller(seller1);


        System.out.println("رقم الصنف / " + n2.getCode());
        System.out.println("اسم الصنف / " + n2.getName());
        System.out.println("السعر / " + n2.getPrice());
        System.out.println("التصنيف / " + n2.getCategory().getNamet());
        System.out.println("التاجر / " + n2.getSeller().getNamet());
        System.out.println("/////////////////////////////////////////// ");


        Item n3 = new Item();
        n3.setCode(3);
        n3.setName("مربى حلواني");
        n3.setPrice(7.0);
        n3.setCategory(category1);
        n3.setSeller(seller);


        System.out.println("رقم الصنف / " + n3.getCode());
        System.out.println("اسم الصنف / " + n3.getName());
        System.out.println("السعر / " + n3.getPrice());
        System.out.println("التصنيف / " + n3.getCategory().getNamet());
        System.out.println("التاجر / " + n3.getSeller().getNamet());
        System.out.println("/////////////////////////////////////////// ");


        Item n4 = new Item();
        n4.setCode(4);
        n4.setName("جبنة شيدر");
        n4.setPrice(5.0);
        n4.setCategory(category2);
        n4.setSeller(seller);


        System.out.println("رقم الصنف / " + n4.getCode());
        System.out.println("اسم الصنف / " + n4.getName());
        System.out.println("السعر / " + n4.getPrice());
        System.out.println("التصنيف / " + n4.getCategory().getNamet());
        System.out.println("التاجر / " + n4.getSeller().getNamet());
        System.out.println("/////////////////////////////////////////// ");


        Item n5 = new Item();
        n5.setCode(5);
        n5.setName("شطة حمراء");
        n5.setPrice(13.5);
        n5.setCategory(category3);
        n5.setSeller(seller1);


        System.out.println("رقم الصنف / " + n5.getCode());
        System.out.println("اسم الصنف / " + n5.getName());
        System.out.println("السعر / " + n5.getPrice());
        System.out.println("التصنيف / " + n5.getCategory().getNamet());
        System.out.println("التاجر / " + n5.getSeller().getNamet());
        System.out.println("/////////////////////////////////////////// ");


    }


}
