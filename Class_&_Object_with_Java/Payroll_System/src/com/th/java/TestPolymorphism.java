/*หลักการ Polymorphism (โพลีมอร์ฟิสซึม) เป็นหลักการในการโปรแกรมเชิงวัตถุ (Object-Oriented Programming)
ที่อนุญาตให้วัตถุแบบหนึ่งสามารถมีลักษณะและพฤติกรรมที่แตกต่างกันได้ในรูปแบบของวิธีเดียวกัน โดยมีส่วนสำคัญดังนี้:

1.Polymorphism หมายถึงความสามารถของวัตถุในการใช้และตอบสนองต่อแต่ละประเภทของการเรียกใช้วิธี (method)
ในเวลารันโปรแกรม กล่าวคือ เราสามารถเรียกใช้วิธีเดียวกันของวัตถุหลาย ๆ วัตถุได้โดยไม่ต้องสนใจถึงประเภทของวัตถุ

2.Polymorphism ให้โปรแกรมสามารถใช้วัตถุที่เป็นลูกศร (subclasses) ของคลาสหลัก (superclass) ได้
โดยใช้การสืบทอด (inheritance) โดยที่วัตถุลูกศรสามารถมีการดำเนินการที่แตกต่างได้และสามารถเรียกใช้วิธีของคลาสหลักได้

3.Polymorphism ช่วยให้เราเขียนโค้ดที่ยืดหยุ่นและทำให้โค้ดมีความสามารถในการขยายตัวได้ โดยไม่ต้องแก้ไขโค้ดต้นฉบับ

เราสามารถอธิบายหลักการ Polymorphism ด้วยตัวอย่างง่าย ๆ ได้ดังนี้:

เรามีคลาสหลักชื่อ "เพลง" (Song) และคลาสลูกศรชื่อ "เพลงร็อก" (RockSong) และ "เพลงป็อป" (PopSong)
ทั้งสองคลาสลูกศรสืบทอดจากคลาสหลัก "เพลง" และมีเมธอดชื่อ "play" ในทั้งสามคลาส แต่เมื่อเราใช้ Polymorphism
เราสามารถใช้เมธอด "play" ของวัตถุเพลง (Song) เพื่อเล่นเพลงร็อก (RockSong) หรือเพลงป็อป (PopSong) ได้โดยไม่ต้องระบุชนิดของเพลง

สรุปคือ Polymorphism ช่วยให้เราสามารถใช้วิธีเดียวกันของวัตถุหลาย ๆ วัตถุได้ โดยไม่ต้องกำหนดประเภทของวัตถุ นอกจากนี้
Polymorphism ยังเป็นส่วนหนึ่งของความสามารถในการใช้งานและการจัดการรหัสในรูปแบบของโปรแกรมเชิงวัตถุ*/

package com.th.java;

import java.util.ArrayList;

public class TestPolymorphism {
    public static void main(String[] args){

        // วิธีที่ 1
//        Programmer obj1 = new Programmer("สุขใจ", "หมายจันทร์", "โปรแกรมเมอร์", 37000, 1200, 2000);
//        Programmer obj2 = new Programmer("หมาย", "วิจักร", "โปรแกรมเมอร์", 37500, 1100, 2200);
//
//        ProjectManager obj3 = new ProjectManager("วิเสก","นามแจ", "ผู้จัดการโปรเจกต์", 53000, 0, 5000);
//        ProjectManager obj4 = new ProjectManager("พิทักษ์","แจดำ", "ผู้จัดการโปรเจกต์", 51000, 0, 4500);
//
//        // เก็บข้อมูล
//        ArrayList<Programmer> pList = new ArrayList<>();
//        pList.add(obj1);
//        pList.add(obj2);
//
//        ArrayList<ProjectManager> pmList = new ArrayList<>();
//        pmList.add(obj3);
//        pmList.add(obj4);
//
//        // แสดงข้อมูล
//        for (Programmer p : pList) {
//            System.out.println(p.display());
//        }
//
//        for (ProjectManager pm : pmList) {
//            System.out.println(pm.display());
//        }


        //วิธีที่ 2
        // ประกาศเป็น Employee หรือ Supper Class
        Employee obj1 = new Programmer("สุขใจ", "หมายจันทร์", "โปรแกรมเมอร์", 37000, 1200, 2000);
        Employee obj2 = new Programmer("หมาย", "วิจักร", "โปรแกรมเมอร์", 37500, 1100, 2200);

        Employee obj3 = new ProjectManager("วิเสก","นามแจ", "ผู้จัดการโปรเจกต์", 53000, 0, 5000);
        Employee obj4 = new ProjectManager("พิทักษ์","แจดำ", "ผู้จัดการโปรเจกต์", 51000, 0, 4500);

        // สร้าง ArrayList เพื่อเก็บ Object
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(obj1);
        empList.add(obj2);
        empList.add(obj3);
        empList.add(obj4);

        for (Employee emp : empList) {
            System.out.println(emp.display());
        }
    }
}
