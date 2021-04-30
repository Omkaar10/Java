package com.Bank;
import java.util.ArrayList;

public class Branch {

    private ArrayList<Customers> branchCustomers;
    private String branchName;
    private static double accountOpeningAmount=1000.0;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customers>();
    }

    public String getBranchName() {
        return branchName;
    }

    private void addNewCustomer(Customers customer) {
        this.branchCustomers.add(customer);
    }

    public boolean openNewAccount(String customerName) {
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer == null) {
            addNewCustomer(new Customers(accountOpeningAmount,customerName));
            return true;
        }
        else
            return false;
    }

    public void branchCustomerList() {
        System.out.println("There are "+branchCustomers.size()+" customers in branch "+this.branchName);
    }

    public boolean addCustomerAmount(String customerName,double customerAmount) {
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addAmount(customerAmount);
            return true;
        }
        else
            return false;
    }

    public boolean withdrawCustomerAmount(String customerName,double customerAmount) {
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer!=null) {
            existingCustomer.withdrawAmount(customerAmount);
            return true;
        }
        else
            return false;
    }

    public void getBranchCustomerList() {
        for(int i = 0; i < branchCustomers.size(); i++) {
            Customers existingCustomer = this.branchCustomers.get(i);
            if(existingCustomer!=null)
                System.out.println(existingCustomer.getCustomerName());
        }
    }

    private Customers findCustomer(String customerName) {
        for(int i = 0; i < this.branchCustomers.size() ; i++) {
            Customers existingCustomer = this.branchCustomers.get(i);
            if(existingCustomer.getCustomerName().equals(customerName))
                return existingCustomer;
        }
        return null;
    }

    public void getCustomerAccountDetail(String customerName) {
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer!=null) {
            int customerTotalTransactions=existingCustomer.getTotalTransactions();
            double customerAmountRemaining=existingCustomer.getAmountRemaining();
            System.out.println(customerName+" has made "+customerTotalTransactions+" transactions and has bankBalance: "+customerAmountRemaining);
        }
        else
            System.out.println("Customer not found!");
    }

    public void getCustomerAccountStatement(String customerName) {
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer!=null){
            existingCustomer.getAccountStatement();
        }
        else
            System.out.println("Customer not found!");
    }

}
