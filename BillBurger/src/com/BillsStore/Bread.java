package com.BillsStore;

public class Bread {

    private int breadType=1;

    public Bread(int breadType) {
        if (breadType<5)
            this.breadType =breadType;
        else
            this.breadType=1;
    }

    public String baseBread() {
        switch(breadType) {
            case 1:
                return "Wheat";
            case 2:
                return "Multi-grain";
            case 3:
                return "Oats";
            case 4:
                return "Rye";
        }
        return null;
    }


}
