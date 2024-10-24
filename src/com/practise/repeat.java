package com.practise;

import java.math.BigInteger;

public class repeat {
    static String addBinary(String a, String b){
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry;
        BigInteger answer;
        while(num2.compareTo(zero) !=0){
            answer = num1.xor(num2);
            carry = (num1.and(num2)).shiftLeft(1);
            num1 = answer;
            num2 = carry;
        }
        return num1.toString(2);

    }
    public static void main(String[] args) {
        System.out.println("binary sum is" + addBinary("111", "101"));
    }
}
