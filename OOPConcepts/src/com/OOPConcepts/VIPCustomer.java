package com.OOPConcepts;

public class VIPCustomer {

    private String name;
    private long creditLimit;
    private String emailAddress;

    public VIPCustomer()
    {
        this("John Doe",50000,"abc@gmail.com");
    }

    public VIPCustomer(String name, long creditLimit)
    {
        this(name,creditLimit,"abc@gmail.com");
    }

    public VIPCustomer(String name, long creditLimit, String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }



    public void testMethod(String name)
    {
        System.out.println(this.name);
        this.name=name;
        System.out.println(this.name);
    }

}
