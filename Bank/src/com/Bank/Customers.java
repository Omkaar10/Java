package com.Bank;

import java.util.ArrayList;

public class Customers {
    private ArrayList<Double> customerTransactions;
    private String customerName;

    public Customers(double initialAmount, String customerName) {
        this.customerName = customerName;
        this.customerTransactions= new ArrayList<Double>();
        addAmount(initialAmount);
    }

    public void addAmount(double amount) {
        this.customerTransactions.add(amount);
    }

    public void withdrawAmount(double amount) {
        this.customerTransactions.add(-(amount));
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getTotalTransactions() {
        return this.customerTransactions.size();
    }

    public void getAccountStatement() {
        for(int i =0; i < customerTransactions.size(); i++) {
            double amountChecking=this.customerTransactions.get(i);
            if(amountChecking >= 0)
                System.out.println("Credit -> "+amountChecking);
            else
                System.out.println("Debit -> "+amountChecking);
        }
    }

    public double getAmountRemaining() {
        double amountRemaining=0;
        for (int i = 0; i < customerTransactions.size(); i++) {
            amountRemaining+=this.customerTransactions.get(i);
        }
        return amountRemaining;
    }
}
