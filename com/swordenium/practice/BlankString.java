package com.swordenium.practice;

public class BlankString {
    public static void main(String[] args) {
        System.out.println("".isBlank()); //true
        System.out.println(" ".isEmpty()); //false
        System.out.println(" ".isBlank()); //true
    }
}
