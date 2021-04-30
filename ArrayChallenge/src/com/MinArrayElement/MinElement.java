package com.MinArrayElement;

import java.util.Scanner;

public class MinElement {

    public int[] getArray(int number){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: \r");

        int[] myArray = new int[number];
        for(int i=0;i<myArray.length;i++) {
            myArray[i]= scanner.nextInt();
        }

        return myArray;
    }


    public int findMin(int[] array) {

        int temp=99999999;
        boolean flag=true;
        while(flag) {
            flag=false;
            for (int i=0;i< array.length;i++) {
                if(array[i]<temp) {
                    temp=array[i];
                    flag=true;
                }
            }
        }

        return temp;

    }

}
