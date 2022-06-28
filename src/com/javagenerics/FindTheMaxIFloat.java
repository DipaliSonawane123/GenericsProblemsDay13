package com.javagenerics;

public class FindTheMaxIFloat {
    public static Float compareTo(Float a, Float b, Float c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to find maximum no from three integer");
        FindTheMaxIFloat s = new FindTheMaxIFloat();
        System.out.println("max Number for 1st test case=" + s.compareTo(5.3F, 0.3F, 2.06F));//Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case=" + s.compareTo(-2.22F, -6.1F, -0.3F));//Test case 2:given max number for 2nd position.
        System.out.println("max Number for 3rd test case=" + s.compareTo(1.5F, 2.45F, 3F));//Test case 3:given max number for the 3rd position.
    }
}
