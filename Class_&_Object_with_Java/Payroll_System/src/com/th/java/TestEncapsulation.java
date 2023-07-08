package com.th.java;

public class TestEncapsulation {
    public static void main(String[] args){

        // พนักงานคนที่ 1 ใช้ Constructor 5 parameters class Employee
        Employee obj1 = new Employee();
        obj1.setName("สมศักดิ์");
        obj1.setLname("พิมพันธ์");
        obj1.setDepartment("พนักงานทั่วไป");
        obj1.setSalary(25000);
        obj1.setOverTime(2500);
        System.out.println(obj1.display());

        // พนักงานคนที่ 2 ใช้ Constructor 4 parameters class Employee
        Employee obj2 = new Employee();
        obj2.setName("เอกรินทร์");
        obj2.setLname("จาวาณี");
        obj2.setDepartment("วิศวกรโรงงาน");
        obj2.setSalary(35000);
        obj2.setOverTime(0);
        System.out.println(obj2.display());
    }
}
