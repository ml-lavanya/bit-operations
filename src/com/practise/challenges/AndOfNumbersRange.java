package com.practise.challenges;
/*
Given two integers left and right that represent the range [left, right],
return the bitwise AND of all numbers in this range, inclusive.
*/
public class AndOfNumbersRange {
     static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right){
            left = left >> 1;
            right = right >> 1;
            shift++;
        }
        return left << shift;
    }

    public static void main(String[] args) {
        System.out.println("and of numbers from 5 to 7: " + rangeBitwiseAnd(5,7));
    }
}
