package com.swordenium.practice;

public class InstanceOf {
    public static void main(String[] args) {
        Object obj = "Saad";

        //Old way of instance comparsion
        if (obj instanceof String) {
            String name = (String) obj;
            System.out.println(name);
        }

        //new way

        if (obj instanceof String name) {
            System.out.println(name);
        }
    }
}
