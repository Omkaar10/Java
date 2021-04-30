package com.BillsStore;

public class DeluxeBurger extends Hamburger {

    private double price;
    private String fries;
    private String coke;

    public DeluxeBurger() {
     this.price=19.10;
     this.coke="Diet Coke";
     this.fries="Periperi Fries";
     System.out.println("Your order is a DeluxeBurger with extra "+fries+" and "+coke);
    }

    @Override
    public double itemizeHamBurger() {
        return this.price;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("This option is not available in Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("This option is not available in Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("This option is not available in Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("This option is not available in Deluxe Burger.");
    }
}


