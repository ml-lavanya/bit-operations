package com.practise.challenges;

/*
Given a positive integer n, write a function that returns the number of
set bits
in its binary representation (also known as the Hamming weight)
 */
public class HammingWeight {
    /*
    Time complexity: O(1) -- while loop runs for 32 times, irrespective of the value of n.
    Space complexity: O(1) -- as there is no extra space used
    */
    static int hammingWeight(int n){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n&(1<<i)) != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hamming weight of 35: " + hammingWeight(35));
    }
}
