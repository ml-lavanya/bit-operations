package com.practise;

public class XorOperator {
    public static void main(String[] args) {
        int a=10; // 1010
        int b=20; //10100
        // 1 ^ 0 or 0 ^ 1 is 1.
        // returns 11110 i.e 30
        System.out.println(" a ^ b is: "+ Integer.toBinaryString(a^b) + " i.e " + (a^b));
    }
}
