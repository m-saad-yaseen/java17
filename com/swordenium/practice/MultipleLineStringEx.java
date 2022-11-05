package com.swordenium.practice;

public class MultipleLineStringEx {
    public static void main(String[] args) {
        String multiline = """
                    This is a multiline string which I really like.
                    This should be very performance efficient.
                    I really missed this when in the earlier java versions.""";
        System.out.println(multiline);
    }
}
