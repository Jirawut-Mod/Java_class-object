package com.th.java;

public class ProjectManager extends Employee { //extends เป็น keyword เพื่อเข้าถึงข้อมูล Employee
    // กำหนดตัวแปร prosition เพิ้ม
    private  int position;

    // สร้าง Constructor เพื่อเพิ่ม prosition
    public ProjectManager(String name, String lname, String department, int salary, int overTime, int position) {
        super(name, lname, department, salary, overTime);
        this.position = position;
    }

    @Override    // Method นี้ทำการ Override มาจาก Class หลัก
    // การ Override คือการเขียนทับคำสั่งต่างๆที่อยู่ใน Methon ใน Class หลัก (Supper Class)
    public int calculateSalary() {
        return salary + overTime +position;
    }

//    public String display() {
//        return super.display() + " [ค่าตำแหน่ง:" + position + "]";
//    }

    public String display() {
        return "ชื่อ:" + name +" "+ lname +
                ", แผนก:" + department +
                ", เงินเดือน:" + salary +
                ", OT:" + overTime + " " +
                "[ค่าตำแหน่ง: " + position + "]" +
                ", รวม:" +calculateSalary();
    }
}
