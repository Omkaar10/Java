package com.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private static Scanner scanner = new Scanner(System.in);
    private String bankName;
    private ArrayList<Branch> bankBranches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranches = new ArrayList<Branch>();
    }

    private boolean addBranch(String branchName) {
        Branch branchList = findBranch(branchName);
        if(branchList == null) {
            this.bankBranches.add(new Branch(branchName));
            return true;
        }
        else
            return false;
    }

    private boolean removeBranch(String branchName) {
        Branch branchList = findBranch(branchName);
        if(branchList != null) {
            this.bankBranches.remove(branchName);
            return true;
        }
        else
            return false;
    }

    private boolean addCustomer(String branchName,String customerName) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.openNewAccount(customerName);
            return true;
        }
        else
            return false;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i< this.bankBranches.size(); i++) {
            Branch existingBranch = this.bankBranches.get(i);
            if(existingBranch.getBranchName().equals(branchName))
                return existingBranch;
        }
        return null;
    }

    private void getBankBranchesList() {
        for(int i = 0; i < bankBranches.size(); i++) {
            Branch existingBranches = this.bankBranches.get(i);
            System.out.println(existingBranches.getBranchName());
        }
    }

    private void BranchCustomerList(String branchName) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.branchCustomerList();
            branch.getBranchCustomerList();
        }
        else
            System.out.println("No such branch opened yet");
    }

    private void amountDeposit(String bankBranch,double customerAmount,String customerName) {
        Branch branch = findBranch(bankBranch);
        if(branch != null) {
            branch.addCustomerAmount(customerName, customerAmount);
            System.out.println("Amount "+customerAmount+" has been deposited in the account.");
        }
    }

    private void amountWithdraw(String bankBranch,double customerAmount,String customerName) {
        Branch branch = findBranch(bankBranch);
        if(branch != null) {
            branch.withdrawCustomerAmount(customerName,customerAmount);
            System.out.println("Amount "+customerAmount+" has been withdrawn from the account");
        }
        else
            System.out.println("No details found");
    }

    private void customerDetails(String bankBranch,String customerName) {
        Branch branch = findBranch(bankBranch);
        if(branch !=null) {
            branch.getCustomerAccountDetail(customerName);
            branch.getCustomerAccountStatement(customerName);
        }
        else
            System.out.println("No details found");
    }

    public void bankAdministration() {
        boolean quit=false;
        System.out.println("Welcome to Bank Administration");
        while(!quit) {
            int choice = 0;
            System.out.println("Enter banking admin choice: ");
            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice) {
                    case 0:
                        System.out.println("Instructions for bank Administration: ");
                        System.out.println("Press - " );
                        System.out.println("0 - Instructions." );
                        System.out.println("1 - Add new branch." );
                        System.out.println("2 - Remove existing branch." );
                        System.out.println("3 - List of branches." );
                        System.out.println("4 - Branch level customer list." );
                        System.out.println("5 - Quit Bank app." );
                        break;

                    case 1:
                        System.out.println("Add a new branch to the bank: ");
                        String newBranch=scanner.nextLine();
                        addBranch(newBranch);
                        break;

                    case 2:
                        System.out.println("Remove existing branch of the bank: ");
                        String removeBranch=scanner.nextLine();
                        if(removeBranch(removeBranch))
                            System.out.println("Branch removed");
                        break;

                    case 3:
                        System.out.println("List of branches: ");
                        getBankBranchesList();
                        break;

                    case 4:
                        System.out.println("List of customers in bank branch: ");
                        System.out.println("Enter the branch name: ");
                        String branchName = scanner.nextLine();
                        BranchCustomerList(branchName);
                        break;

                    case 5:
                        quit=true;
                        System.out.println("Quitting Bank Administration section");
                }
            }
            else {
                System.out.println("Input Error!");
                scanner.nextLine();
            }
        }
        //scanner.close();
    }

    public void customerAdministration() {
        boolean quit=false;
        System.out.println("Welcome to Customer Administration");
        while(!quit) {
            int choice = 0;
            System.out.println("Enter customer choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Press - ");
                    System.out.println("0 - Instruction List");
                    System.out.println("1 - Open new Account");
                    System.out.println("2 - Deposit Money");
                    System.out.println("3 - Withdraw Money");
                    System.out.println("4 - Account Details");
                    System.out.println("5 - Quit the app");
                    break;

                case 1:
                    System.out.println("Opening new Account");
                    System.out.println("Enter the Branch Name: ");
                    String newBranchName = scanner.nextLine();
                    System.out.println("Enter customer name");
                    String newCustomerName = scanner.nextLine();
                    if(addCustomer(newBranchName,newCustomerName))
                        System.out.println("Congratulations new Account opened.");
                    else
                        System.out.println("Facing technical issues");
                    break;

                case 2:
                    System.out.println("Enter home branch: ");
                    String depositBankBranch = scanner.nextLine();
                    System.out.println("Enter customer name: ");
                    String depositCustomerName = scanner.nextLine();
                    System.out.println("Amount to deposit? ");
                    double depositAmount = scanner.nextDouble();
                    amountDeposit(depositBankBranch,depositAmount,depositCustomerName);
                    break;

                case 3:
                    System.out.println("Enter home branch: ");
                    String withdrawBankBranch = scanner.nextLine();
                    System.out.println("Enter customer name: ");
                    String withdrawCustomerName = scanner.nextLine();
                    System.out.println("Amount to deposit? ");
                    double withdrawAmount = scanner.nextDouble();
                    amountWithdraw(withdrawBankBranch,withdrawAmount,withdrawCustomerName);
                    break;

                case 4:
                    System.out.println("Opening new Account");
                    System.out.println("Enter the Branch Name: ");
                    String accountBranchName = scanner.nextLine();
                    System.out.println("Enter customer name");
                    String accountCustomerName = scanner.nextLine();
                    customerDetails(accountBranchName,accountCustomerName);
                    break;

                case 5:
                    quit=true;
                    System.out.println("Quitting app");
                    break;

                default:
                    System.out.println("Press 0 for instructions.");
                    break;
                }
                scanner.nextLine();
        }
    }
}
