package com.swordenium.practice;

//Creating a record class
record Professor (String firstName, String lastName, String email) { }

//This eliminates need of creating verbose class

/* Equivalent

public class Professor {
    private String firstName;
    private String lastName;
    private String email;

    Professor() {}

    Professor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getter and setters
}
* */