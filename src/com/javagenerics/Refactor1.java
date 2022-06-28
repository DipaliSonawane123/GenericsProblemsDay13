/*
Refactor all the 3 to One Generic Method and find the maximum
- Ensure the Generic Type extends Comparable Refactor 1
- Make the test case work
 */
package com.javagenerics;
public class Refactor1 {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;//assume x intially largest
        if (y.compareTo(max) > 0) {
            max = y;//y is the largest
        }
        if (z.compareTo(max) > 0) {
            max = z;//z is the lagest
        } else {
           max =x;
        }
        return max;
    }

        public static void main(String[] args) {
        System.out.println("Maximum number out of three integers is: " + maximum(11, 18, 200));
        System.out.println("Maximum number out of three float is: " + maximum(4.3f, 0.75f, 88f));
        System.out.println("Maximum among three string is: " + maximum("Apple", "Peach", "Banana"));
    }

    }


