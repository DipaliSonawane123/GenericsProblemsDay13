/*
Refactor to create Generic Class to take in 3 variables of Generic Type
- Ensure the Generic Type extends Comparable
- Write parameter constructor
- Write testMaximum method to internally call the static testMaximum method passing the 3 instance variables
- Define new test case to use the Generic Class
 */
package com.javagenerics;
public class Refactor2 <T extends Comparable<T>>//generic class
{
    T x;
    T y;
    T z;

    Refactor2(T x, T y, T z) {//parameterized constructor
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum () {// testMaximum method 3 parameter calling internally

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else {
            return z;
        }
    }


    public static void main(String[] args) {
        Refactor2 compareInteger = new Refactor2(2345, 12, 7);
        System.out.println("Maximum number out of three integers is: " + compareInteger.testMaximum());
        Refactor2  comapreFloat = new Refactor2(123.f, 0.345f, 0.678f);
        System.out.println("Maximum number out of three float is: " + comapreFloat.testMaximum());
        Refactor2 compareString = new Refactor2("Apple", "Orange", "potato");
        System.out.println("Maximum among three string is: " + compareString.testMaximum());
    }
}




