package com.th.java;

public class TestProjectManager {
    public static void main(String[] args){
        ProjectManager obj1 = new ProjectManager("สารกิจ", "ราชเหม", "ผู้จัดการโปรเจกต์", 50000, 0, 12000);
        System.out.println(obj1.display());
    }

}
