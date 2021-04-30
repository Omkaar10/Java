package com.BillsStore;

public class HealthyBurger extends Burger{

    private String name;
    private String meat;
    private double price;
    private String healthyAddition1name;
    private String healthyAddition2name;
    private String healthyAddition3name;
    private double healthyAddition1price;
    private double healthyAddition2price;
    private double healthyAddition3price;

    public HealthyBurger(Sauce sauce,String meat, double price) {
        this(new Patty(true),new Bread(2),sauce,"Healthy Burger",meat,price);
        System.out.println("Your order is a "+getPatty()+" Healthy "+meat +" Burger with "+getBread()+" bread and "+getSauce());
    }

    private HealthyBurger(Patty patty, Bread bread, Sauce sauce,String name,String meat,double price) {
        super(patty, bread, sauce);
        this.name=name;
        this.meat=meat;
        this.price=price;
    }

    public void addHealthyAddition1(String healthyAddition1name,double healthyAddition1price) {
        this.price+=healthyAddition1price;
        System.out.println(healthyAddition1name+" added for extra "+healthyAddition1price);

    }

    public void addHealthyAddition2(String healthyAddition2name,double healthyAddition2price) {
        this.price+=healthyAddition2price;
        System.out.println(healthyAddition2name+" added for extra "+healthyAddition2price);

    }

    public void addHealthyAddition3(String healthyAddition3name,double healthyAddition3price) {
        this.price+=healthyAddition3price;
        System.out.println(healthyAddition3name+" added for extra "+healthyAddition3price);

    }

    public double itemizeHealthyBurger() {
        double totalPrice=this.price;
        return totalPrice;
    }



}
