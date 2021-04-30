package com.OOPConcepts;

public class BankAccount {

    private long accountNumber;
    private long accountBalance;
    private String customerName;
    private String emailAddress;
    private long phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long amountDeposit(int amount) {
        this.accountBalance += amount;
        return this.accountBalance;
    }


    public long amountWithdrawal(int amount)
    {
        if (amount>this.accountBalance)
        {
            return -1;
        }
        else
        {
            this.accountBalance-=amount;
            return this.accountBalance;
        }
    }








}
