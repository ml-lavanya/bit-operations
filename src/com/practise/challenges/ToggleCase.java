package com.practise.challenges;

public class ToggleCase {

    // 65-90 upper case letters
    // 97-102 lower case letters
    static String toggleClass(String name){
        char[] a = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            a[i] ^= 32;
        }
        return new String(a);
    }

    public static void main(String[] args) {
        System.out.println(toggleClass("LuFfY"));
        System.out.println(toggleClass("ZORO"));
        System.out.println(toggleClass("nami"));
        System.out.println(toggleClass("CHOpper"));
    }
}
