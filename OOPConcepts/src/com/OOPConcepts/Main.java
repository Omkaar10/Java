package com.OOPConcepts;

public class Main {
    public static void main(String[] args)
    {
       CCcarpet carpet = new CCcarpet(10);
       CCfloor floor = new CCfloor(-1,4);
       CCcalculator calculator = new CCcalculator(floor,carpet);
       System.out.println("Total Cost: "+calculator.getTotalCost());

    }
}
