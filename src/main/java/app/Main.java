package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("---------------- بداية عملية الجمع----------------");
        System.out.println("ادخل الرقم الأ,ل:");
        double num1 = input.nextDouble();

        System.out.println("ادخل الرقم الثاني:");
        double num2 = input.nextDouble();

        System.out.println("نتيجة جمع الرقمين تساوي " + (num1 + num2));
        System.out.println("----------------نهاية عملية الجمع----------------");

        System.out.println("---------------- بداية عملية الطرح----------------");
        System.out.println("ادخل الرقم الأ,ل:");
        num1 = input.nextDouble();

        System.out.println("ادخل الرقم الثاني:");
        num2 = input.nextDouble();


        System.out.println("نتيجة طرح الرقمين تساوي " + (num1 - num2));
        System.out.println("----------------نهاية عملية الطرح----------------");

    }
}
