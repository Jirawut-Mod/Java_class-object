package com.th.java;

import javax.swing.*;

public class Employee {     // Class Employee

    // ประกาศตัวแปร
    protected String name;
    protected String lname;
    protected String department;
    protected int salary;
    protected int overTime;
    protected  Address address;

    public Employee(String name,String lname, String department, int salary, int overTime, Address address) {
        this.name = name;
        this.lname = lname;
        this.department = department;
        this.salary = salary;
        this.overTime = overTime;
        this.address = address;
    }
    public String displayDetails() {
        return display() +
                ", ที่อยู่: " + address.toString();
    }

    // Constructor: Empty Constructor / Default Constructor
    public Employee() {

    }

    // Constructor 4 parameters
    public Employee(String name,String lname, String department, int salary) {
        this(name, lname, department, salary, 0);
    }

    // Constructor 5 parameters
    public Employee(String name, String lname, String department, int salary, int overTime) {
        this.name = name;
        this.lname = lname;
        this.department = department;
        this.setSalary(salary) ;
        this.overTime = overTime;
    }

    // 1.เมธอด คำนวณเงินเดือนสุทธิ
    public int calculateSalary(){
        return salary + overTime;
    }

    // 2.เมธอด แสดงรายละเอียด
    public String display() {
        return "ชื่อ:" + name +" "+ lname +
                ", แผนก:" + department +
                ", เงินเดือน:" + salary +
                ", OT:" + overTime +
                ", รวม:" +calculateSalary();
    }

    // getName ใช้สคืนค่ากลับไปที่ name
    public String getName() {
        return name;
    }

    /* การเรียกใช้ Getter & Setter
    กด Alt + Insert
    เลือก Getter & Setter
    จากนั้นเลือกไฟล์
    * */

    // setName ใช้ในการกำหนดค่าให้กับ name
    public void setName(String name) {
        this.name = name;
    }

    // getLname ใช้คืนค่ากลับไปที่ lname
    public String getLname() {
        return lname;
    }

    // setLname ใช้ในการกำหนดค่าให้กับ lname
    public void setLname(String lname) {
        this.lname = lname;
    }

    // getDepartment ใช้คืนค่ากลับไปที่ department
    public String getDepartment() {
        return department;
    }

    // setDepartment ใช้ในการกำหนดค่าให้กับ department
    public void setDepartment(String department) {
        this.department = department;
    }

    // getSalary ใช้คืนค่ากลับไปที่ salary
    public int getSalary() {
        return salary;
    }

    // setSalary ใช้ในการกำหนดค่าให้กับ salary
    /* อธิบายเงื่อนไข
    * เมื่อฟังก์ชันถูกเรียกใช้งาน ก่อนที่จะกำหนดค่าเงินเดือนให้กับอ็อบเจ็กต์ ฟังก์ชันจะทำการตรวจสอบว่าค่าเงินเดือนที่รับเข้ามา (salary)
    * มีค่าน้อยกว่าหรือเท่ากับศูนย์หรือไม่ ถ้าเงื่อนไขเป็นจริง (ค่าเงินเดือนน้อยกว่าหรือเท่ากับศูนย์) จะทำการสร้างตัวแปร msg ที่มีค่าเป็นข้อความ
    * "เงินเดือนต้องไม่น้อยกว่า 0 บาท" และแสดงข้อความแจ้งเตือนดังกล่าวในหน้าต่างของ JOptionPane ด้วยฟังก์ชัน showMessageDialog
    * ซึ่งแสดงข้อความ msg ที่เป็นข้อความแจ้งเตือน และมีหัวข้อ "แจ้งเตือน" และประเภทของข้อความเป็น 0 (เพื่อแสดงไอคอนเตือนแบบเรียบง่าย)
    * หากเงื่อนไขไม่เป็นจริง (ค่าเงินเดือนมากกว่าศูนย์) ฟังก์ชันจะกำหนดค่าเงินเดือนที่รับเข้ามา (salary) ให้กับตัวแปร this.salary
    * ซึ่งเป็นตัวแปรเก็บค่าเงินเดือนของอ็อบเจ็กต์ปัจจุบันนอกจากนี้ หากมีการเรียกใช้ฟังก์ชัน System.exit(0) ฟังก์ชันจะทำการสิ้นสุดการทำงานของโปรแกรมทันที
    * ซึ่งจะทำให้โปรแกรมปิดการทำงานลงทันทีที่ค่าเงินเดือนไม่ถูกต้อง (น้อยกว่าหรือเท่ากับศูนย์) โดยจะแสดงข้อความแจ้งเตือนเพียงครั้งเดียวก่อนปิดโปรแกรม*/
    public void setSalary(int salary) {
        if (salary <= 0) {
            String msg = "เงินเดือนต้องไม่น้อยกว่า 0 บาท";
            JOptionPane.showMessageDialog(null, msg, "แจ้งเตือน", 0);
            System.exit(0);
        } else {
            this.salary = salary;
        }
    }

    // getOverTime ใช้คืนค่ากลับไปที่ overTime
    public int getOverTime() {
        return overTime;
    }

    // setOverTime ใช้ในการกำหนดค่าให้กับ overTime
    public void setOverTime(int overTime) {
            this.overTime = overTime;
        }
}


