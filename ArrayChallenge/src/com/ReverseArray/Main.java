package com.ReverseArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] someArray = {1,2,3,4,5};

        int[] copyArray = new int[someArray.length];

        





        System.arraycopy(someArray,0,copyArray,0,5);
        System.out.println(Arrays.toString(copyArray));



    }


}
