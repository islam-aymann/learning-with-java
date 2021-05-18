package com.islam;

public class Main {
    public static void main(String[] args) {
        String str  = "an apple pie";
        var charFinder = new CharFinder();
        char fnrc = charFinder.findFirstNonRepeatingChar(str);
        System.out.println(fnrc);

    }
}
