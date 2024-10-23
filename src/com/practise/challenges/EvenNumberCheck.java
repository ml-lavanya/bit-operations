package com.practise.challenges;

public class EvenNumberCheck {
    public boolean isEvenNumber(int n){
        return (n&1) == 0;
    }
    public static void main(String[] args) {
        EvenNumberCheck obj = new EvenNumberCheck();
        System.out.println(obj.isEvenNumber(20));
    }
}
