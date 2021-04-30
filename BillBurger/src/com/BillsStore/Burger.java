package com.BillsStore;

public class Burger {

    private Patty patty;
    private Bread bread;
    private Sauce sauce;


    public Burger(Patty patty, Bread bread, Sauce sauce) {
        this.patty = patty;
        this.bread = bread;
        this.sauce = sauce;
    }

    public String getPatty() {
        return patty.basePatty();
    }

    public String getBread() {
        return bread.baseBread();
    }

    public String getSauce() {
        return sauce.sauce();
    }
}
