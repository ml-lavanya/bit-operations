package com.practise;

public class AndOperator {
    public static void main(String[] args) {
        int a = 14; //01110
        int b = 20; //10100
        System.out.printf("a is: %1$32s", Integer.toBinaryString(a));
        System.out.printf("b is: %1$32s", Integer.toBinaryString(b));
        System.out.println("******* AND operation ********");
        // a&b returns 00100 i.e 4
        System.out.printf("a & b: %1$d", a&b);
    }
}
