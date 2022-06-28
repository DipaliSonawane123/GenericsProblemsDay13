package com.javagenerics;

public class FindTheMaxInteger {
    public static Integer compareTo(Integer a, Integer b, Integer c) {
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
        FindTheMaxInteger s = new FindTheMaxInteger();
        System.out.println("max Number for 1st test case=" + s.compareTo(5, 3, 2));//Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case=" + s.compareTo(2, 6, 3));//Test case 2:given max number for 2nd position.
        System.out.println("max Number for 3rd test case=" + s.compareTo(1, 2, 3));//Test case 3:given max number for the 3rd position.
    }
}







