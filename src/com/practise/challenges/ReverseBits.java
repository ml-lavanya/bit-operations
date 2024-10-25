package com.practise.challenges;
/*
Reverse bits of a given 32 bits unsigned integer.
*/
public class ReverseBits {
    static int reverseBits(int num){
        int power = 31;
        int result = 0;
        while(num != 0){
            result += (num&1)<<power;
            num = num >>> 1;
            power --;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("reverse bits of 11100001: "+reverseBits(12345678));
    }
}
