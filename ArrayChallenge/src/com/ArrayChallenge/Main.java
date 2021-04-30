package com.ArrayChallenge;

public class Main {
    public static void main(String[] args) {
        Array getint=new Array();
        int[] unsortedArray=getint.getArray(5);
        System.out.println("Unsorted array: ");
        getint.arrayToPrint(unsortedArray);

        int[] sortedArray=getint.arraySort(unsortedArray);

        System.out.println("\nSorted Array: \r");
        getint.arrayToPrint(sortedArray);



    }
}


