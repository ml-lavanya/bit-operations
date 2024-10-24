package com.practise.challenges;

import java.math.BigInteger;

/*
Add two binary numbers.
Ex: 11 and 10 sum should be 101.
*/
public class AddBinary {
    public static String addBinary(String a, String b) {
        BigInteger aBig = new BigInteger(a, 2);
        BigInteger bBig = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger answer, carry;
        while (bBig.compareTo(zero) != 0){
            answer = aBig.xor(bBig);
            carry = ((aBig.and(bBig)).shiftLeft(1));
            aBig = answer;
            bBig = carry;
        }
        return (aBig).toString(2);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "10"));
    }
}