package com.ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    Scanner scanner = new Scanner(System.in);

    public int[] inputArray(int number) {

        int[] myarray = new int[number];
        System.out.println("Enter the numbers: \r");

        for(int i=0;i<myarray.length;i++) {

            myarray[i] = scanner.nextInt();
        }
        return myarray;
    }


    public int[] reversingArray(int[] inputArray) {


        int[] reverseArray = new int[inputArray.length];
        int temp=reverseArray.length-1;

        for(int i=0;i<inputArray.length;i++) {

            reverseArray[temp]=inputArray[i];
            temp--;
        }

        return reverseArray;
    }
}
