package com.ArrayChallenge;

import java.util.Scanner;

public class Array {

    private int[]intArray;

    public int[] getArray(int number) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number: \r");
        intArray=new int[number];

        for(int i=0;i<intArray.length;i++) {
            intArray[i]=scanner.nextInt();
        }

        return intArray;
    }

    public void arrayToPrint(int[] printArray) {

        for(int i=0;i<printArray.length;i++) {
            System.out.println("Elements are: "+printArray[i]);
        }
    }


    public int[] arraySort(int[] array) {

        int[] unsortedArray = new int[array.length];

        for(int i=0;i<array.length;i++) {
            unsortedArray[i]=array[i];
        }

        int temp=0;
        boolean flag=true;

        while(flag) {

            flag=false;
            for(int i=0;i<(unsortedArray.length-1);i++) {
                if(unsortedArray[i]<unsortedArray[i+1]) {
                    temp=unsortedArray[i];
                    unsortedArray[i]=unsortedArray[i+1];
                    unsortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return unsortedArray;
    }

}
