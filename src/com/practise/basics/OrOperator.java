package com.practise.basics;

public class OrOperator {
    public static void main(String[] args) {
        int a = 14; //01110
        int b = 20; //10100
        System.out.printf("a is: %1$s", Integer.toBinaryString(a));
        System.out.printf("%n b is: %1$s", Integer.toBinaryString(b));
        System.out.println("\n ******* OR operation ********");
        // a&b returns 11110 i.e 30
        System.out.printf("a | b: %1$d", a|b);
    }
}
