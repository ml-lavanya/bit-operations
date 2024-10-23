package com.practise.challenges;

/*
find the position of the first set-bit (1) from the right.
n= 16; first set bit is 5.
*/
public class FirstSetBit {
    private static int getFirstSetBit(int n){
        if(n == 0) return n;
        int k = 1;
        for (k = 1; k <= 32; k++) {
            // 0 & 1 == 0 means, at position k of n, value is 0
            // n = 16; k=1; 10000 & 1 = 0
            // n = 16; k=2; 10000 & 10 = 0
            // n = 16; k=3; 10000 & 100 = 0
            // n = 16; k=4; 10000 & 1000 = 0
            // n = 16; k=5; 10000 & 10000 = 10000 i.e not equal to 0
            if(!((n & (1 << (k-1))) == 0)){
                return k;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.printf("First set bit of %1$d is %2$d", n, getFirstSetBit(n));
    }
}
