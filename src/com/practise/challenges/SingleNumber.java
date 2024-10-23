package com.practise.challenges;

/*
Find the element in an array that is not repeated.
*/
public class SingleNumber {
    private static int singleNumber(int[] nums){
        int xorResult = 0;
        for(int num: nums){
            xorResult ^= num;
        }
        return xorResult;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,6,7,8,9,4,1,5,6,9,8,7};
        System.out.println("single number is: " + singleNumber(nums));
    }
}
