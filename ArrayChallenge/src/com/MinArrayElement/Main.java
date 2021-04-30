package com.MinArrayElement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MinElement min = new MinElement();
        int[] newArray=min.getArray(5);

        System.out.println("Your entered Array is: "+Arrays.toString(newArray));
        System.out.println("Minimum Number in the array is: "+min.findMin(newArray));

    }
}
