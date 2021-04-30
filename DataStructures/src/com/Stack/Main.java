package com.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit= false;
        Stack stack = new Stack();
        while(!quit) {
            int choice = 0;
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("Press - ");
                    System.out.println("0 - Instructions");
                    System.out.println("1 - Push element in stack.");
                    System.out.println("2 - Pop element from stack.");
                    System.out.println("3 - Current top element in stack");
                    System.out.println("4 - Display stack.");
                    System.out.println("5 - Quit.");
                    break;
                case 1:
                    System.out.println("Enter element to push.");
                    int element  = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    System.out.println("Element popped: "+stack.pop());
                    break;
                case 3:
                    System.out.println("Current top element is: "+stack.peek());
                    break;
                case 4:
                    stack.showStack();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Press 0 for instructions.");
                    scanner.nextLine();
            }
        }
        scanner.close();
    }
}