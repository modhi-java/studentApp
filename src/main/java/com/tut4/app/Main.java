package com.tut4.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //أنشاء كائن من الكلاس Scanner لاخذ البيانات من المستخدم
        Scanner scanner = new Scanner(System.in);

        System.out.println("ادخل اسم الموظف: ");
        String name = scanner.nextLine();

        System.out.println("ادخل راتب الموظف: ");
        Double salary = scanner.nextDouble();

        System.out.println("ادخل اضافي الموظف: ");
        Double overtime = scanner.nextDouble();

        //أنشاء كائن من الموظف مستخدما البيانات السابقة
        Employee employee = new Employee(name, salary, overtime);
    }
}
