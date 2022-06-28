package com.javagenerics;

public class FindMaxString {
    public static String compareTO(String x, String y, String z) {

        int a = x.compareTo(y);
        int b = x.compareTo(z);
        int c = y.compareTo(z);

        if (a > b && a > c) {
            return x;
        } else if (b > c) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        FindMaxString m = new FindMaxString();
        System.out.println("max Number for 1st test case=" + m.compareTO("Apple", "Banana", "Peach"));//Test case 1 :given max number for 1st position.
       //a=-1,b=-15,c=-14
        System.out.println("max Number for 2nd test case=" + m.compareTO("Peach", "Banana", "Apple"));//Test case 2:given max number for 2nd position
        //a=14,b=15,c=1
        System.out.println("max Number for 3rd test case=" + m.compareTO("Banana", "Peach", "Apple"));//Test case 3:given max number for the 3rd position.
        //a=14,b=1,c=15
    }
}
