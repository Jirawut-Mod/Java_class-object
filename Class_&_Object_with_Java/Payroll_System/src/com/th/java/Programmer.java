package com.th.java;

public class Programmer extends Employee{ //extends เป็น keyword เพื่อเข้าถึงข้อมูล Employee
    // กำหนดตัวแปร skill เพิ่ม
    private int skill;

    // สร้าง Constructor เพื่อเพิ่ม Skill
    public Programmer(String name, String lname, String department, int salary, int overTime, int skill) {
        super(name, lname, department, salary, overTime);
        this.skill = skill;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + skill;  // super เพื่อเรียกใช้ method calculateSalary ของ Class หลัก
    }

    public String display() {
        return "ชื่อ:" + name +" "+ lname +
                ", แผนก:" + department +
                ", เงินเดือน:" + salary +
                ", OT:" + overTime + " " +
                "[ค่าทักษะ: " + skill + "]" +
                ", รวม:" +calculateSalary();
    }
}
