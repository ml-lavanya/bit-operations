package com.practise.challenges;

/*
Given a positive integer n, write a function that returns the number of
set bits
in its binary representation (also known as the Hamming weight)
*/
class HammingWeight2 {
    /*
    Time complexity: O(number of 1s) -- while loop runs for the hamming weight times. Ex: if n= 35, it runs 3 times.
    Space complexity: O(1) -- as there is no extra space used
    */
    private static int helper(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 127;
        System.out.println("SetBit Count is : " + helper(number));
        System.out.println(Integer.toBinaryString(number));
    }
}

