package com.th.java;

public class TestAddress {
    public static void main(String[] args){
        Employee obj1 = new Employee("สนธิ", "ทองกุล", "พนักงานไอที", 24000, 0, new Address("09/13","สามัคคี", "นนทบุรี"));
        System.out.println(obj1.displayDetails());
    }
}
