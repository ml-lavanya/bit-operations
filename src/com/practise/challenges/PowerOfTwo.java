package com.practise.challenges;

/*
Check if a given integer is power of 2.
*/
public class PowerOfTwo {
    static boolean isPowerOf2(int num){
        int k = 1;
        for (k=1; k <= 32 ; k++) {
            if(!((num & (1 << (k-1))) == 0) && ((num & (1 << (k-1))) == num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(17));
    }
}
