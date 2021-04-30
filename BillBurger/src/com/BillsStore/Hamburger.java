package com.BillsStore;

public class Hamburger extends Burger{

    private double price;
    private String name;
    private String meat;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger() {
        this(new Patty(true),new Bread(1),new Sauce(1),"Classic Hamburger","Ham",15);
        System.out.println("Your order is a "+super.getPatty()+" Hamburger with "+super.getBread()+" bread and "+super.getSauce());
    }

    public Hamburger(Patty patty, Bread bread, Sauce sauce, String name, String meat,double price) {
        super(patty, bread, sauce);
        this.name=name;
        this.meat=meat;
        this.price=price;
        System.out.println("Your order is a "+getPatty()+" Hamburger with "+getBread()+" bread and "+getSauce());
    }


    public void addHamburgerAddition1(String addition1Name,double addition1Price) {
        this.price+=addition1Price;
        System.out.println(addition1Name+" added for extra "+addition1Price);

    }


    public void addHamburgerAddition2(String addition2Name,double addition2Price) {
        this.price+=addition2Price;
        System.out.println(addition2Name+" added for extra "+addition2Price);

    }


    public void addHamburgerAddition3(String addition3Name,double addition3Price) {
        this.price+=addition3Price;
        System.out.println(addition3Name+" added for extra "+addition3Price);

    }


    public void addHamburgerAddition4(String addition4Name,double addition4Price) {
        this.price+=addition4Price;
        System.out.println(addition4Name+" added for extra "+addition4Price);

    }

    public double itemizeHamBurger() {
        double totalPrice=this.price;
        return totalPrice;
    }


}
