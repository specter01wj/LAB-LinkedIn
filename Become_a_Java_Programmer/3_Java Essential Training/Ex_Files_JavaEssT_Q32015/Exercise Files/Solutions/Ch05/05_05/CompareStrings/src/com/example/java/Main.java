package com.example.java;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String str3 = "hello";
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String part1 = "Hello ";
        String part2 = "WORLD";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
    }

}
