package com.th.java;

public class Address {

    // กำหนดตัวแปรเพิ่ม
    protected String housNo;
    protected String street;
    protected String city;

    // Constructor 3 parameters
    public Address(String housNo, String street, String city) {
        this.housNo = housNo;
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "housNo='" + housNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
