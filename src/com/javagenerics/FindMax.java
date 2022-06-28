/*
Extend the max method to also print the max to std out using Generic Method
 - Write printMax Generic Method which is UC 5 internally called from testMaximum
 */
package com.javagenerics;

public class FindMax<T extends Comparable<T>> {
        private T[] inputArray;

    FindMax(T[] inputArray){
            this.inputArray = inputArray;
        }

        public void  testMaximum() {
            for(int i=0; i<inputArray.length-1; i++) {
                if(inputArray[i].compareTo(inputArray[i+1]) > 0) {
                    inputArray[i+1] = inputArray[i];
                }
            }

        }
    private void toPrint() {
        System.out.println(inputArray[inputArray.length - 1]);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[] i = {56,30,70};
        String[] s = {"Peach","Banana","Apple"};
        Float[] f = {0.56f,0.30f,0.7f};
        new FindMax(i).testMaximum();
        new FindMax(s).testMaximum();
        new FindMax(f).testMaximum();
        new FindMax(i).toPrint();
        new FindMax(s).toPrint();
        new FindMax(f).toPrint();

    }
}


