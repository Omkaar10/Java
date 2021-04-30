package com.BillsStore;

public class Patty {

    private boolean pattyType;

    public Patty(boolean pattyType) {
        this.pattyType = pattyType;
    }

    public String basePatty() {
        if (pattyType==true)
            return "Non-Veg";
        else
            return "Veg";
    }
}
