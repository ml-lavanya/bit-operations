package com.practise;

class CountSetBit {
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

