package com.swordenium.practice;

public class RecordClass {
    public static void main(String[] args) {
        //Invoking a record class
        Professor professor = new Professor("Saad", "Yaseen", "m.saad.yaseen@gmail.com");
        System.out.println(professor.firstName());
        System.out.println(professor.lastName());
        System.out.println(professor.email());
    }
}
