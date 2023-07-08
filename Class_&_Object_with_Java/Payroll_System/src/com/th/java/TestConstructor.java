package com.th.java;

public class TestConstructor {
    public static void main(String[] args) {

        // พนักงานคนที่ 1 ใช้ Constructor 5 parameters class Employee
        Employee obj1 = new Employee("สมศักดิ์", "พิมพันธ์", "พนักงานทั่วไป", 25000, 2500);
        System.out.println(obj1.display());

        // พนักงานคนที่ 2 ใช้ Constructor 4 parameters class Employee
        Employee obj2 = new Employee("เอกรินทร์", "จาวาณี", "วิศวกรโรงงาน", 35000, 0);
        System.out.println(obj2.display());

    }
}
