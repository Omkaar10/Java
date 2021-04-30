package com.Bank;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean quit=false;
        Bank bank = new Bank("HDFC");
        int choice = 0;

        while(!quit) {

            System.out.println("Enter choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("Press");
                    System.out.println("0 - Instructions");
                    System.out.println("1 - Bank Administration");
                    System.out.println("2 - Customer Administraton");
                    System.out.println("3 - Quit");
                    scanner.nextLine();
                    break;

                case 1:
                    bank.bankAdministration();
                    break;

                case 2:
                    bank.customerAdministration();
                    break;

                case 3:
                    quit=true;
                    System.out.println("Quitting");
                    break;

                default:
                    System.out.println("Press 0 for instructions");
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
