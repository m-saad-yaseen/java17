package com.swordenium.practice;

public class StripClassExample {
    public static void main(String[] args) {
        String nameString = "  Ciao Saad!   ";
        System.out.println( nameString.trim() );
        System.out.println( nameString.strip() );
        System.out.println( nameString.stripLeading() );
        System.out.println( nameString.stripTrailing() );
    }
}
