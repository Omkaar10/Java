package com.MobilePhone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(56);
        intList.add(Integer.valueOf(70));

        for(int i:intList) {
            int value = i;
            System.out.println(value);
        }

        for(int i=0;i<2;i++) {
            int value=intList.get(i).intValue();
            System.out.println(value);
        }
    }

}
