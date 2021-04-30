package com.BillsStore;

public class Sauce {

    private int sauceType=1;

    public Sauce(int sauceType) {
        if(sauceType<5)
            this.sauceType = sauceType;
        else
            this.sauceType=1;
    }

    public String sauce() {

        switch(sauceType) {
            case 1:
                return "Tomato Sauce";
            case 2:
                return "Mustard Sauce";
            case 3:
                return "Chilli Sauce";
            case 4:
                return "Barbeque Sauce";
        }
        return null;
    }


}
