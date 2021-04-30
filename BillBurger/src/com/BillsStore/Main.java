package com.BillsStore;

public class Main {

    public static void main(String[] args) {

        Burger hb = new Hamburger(new Patty(true),new Bread(2),new Sauce(2),"Classic","Chicken",15.99);

        System.out.println(hb.getClass().getName());

        //hb.addHamburgerAddition1("Lettuce",2.5);
        //hb.addHamburgerAddition2("Cheese",2.99);
        //hb.addHamburgerAddition3("Pickles",1.00);
        //hb.addHamburgerAddition4("Fries",5.5);
        //System.out.println("Your order cost is: "+hb.itemizeHamBurger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Lettuce",2);
        System.out.println("Your order cost is: "+db.itemizeHamBurger());

        HealthyBurger healthyburger = new HealthyBurger(new Sauce(3),"Chicken",20);
        healthyburger.addHealthyAddition1("Lentils",5);
        healthyburger.addHealthyAddition2("Fetta Cheese",5.5);
        healthyburger.addHealthyAddition3("Tomatoes",2.25);
        System.out.println(healthyburger.itemizeHealthyBurger());
    }
}
