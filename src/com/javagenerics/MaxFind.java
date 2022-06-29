/*
Extend the max method to take more than three parameters
- use option and use sorting
 */
package com.javagenerics;

import java.util.Arrays;

public class MaxFind <T extends Comparable<T>> { //sorting using comparable interface in collection generic class
    private T[] inputArray;
    MaxFind(T[] inputArray) { //generics method to accept Type from generics class array
        this.inputArray = inputArray;//converting into this method object
    }
    public void maxElement() { //accept more than 3 no using array
        for (int i = 0; i < inputArray.length - 1; i++) { //index value of array
            if (inputArray[i].compareTo(inputArray[i + 1]) > 0) {
                inputArray[i + 1] = inputArray[i];
            }
        }
        System.out.println(inputArray[inputArray.length - 1]);
    }
    public void display() {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
       Arrays.sort(inputArray);
        System.out.println("After Sorting");
        for(int i =0; i< inputArray.length ; i++){
            System.out.println(inputArray[i]);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[] i = {56, 30, 70, 123, 43, 56};
        String[] s = {"Peach", "Banana", "Apple", "Orange"};
        Float[] f = {0.56f, 000000.30f, 7.340f, 0000.01f};
        System.out.println("*******integer******");
        new MaxFind(i).display();
        System.out.println("*******String******");
        new MaxFind(s).display();
        System.out.println("*******Float******");
        new MaxFind(f).display();
        System.out.println("Maximum From Three Value");
        new MaxFind(i).maxElement();
        new MaxFind(s).maxElement();
        new MaxFind(f).maxElement();


    }
}