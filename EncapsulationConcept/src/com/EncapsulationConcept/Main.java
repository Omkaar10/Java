package com.EncapsulationConcept;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(40,true);
        printer.addToner(40);
        printer.printPages(20);
        printer.printPages(20);
        printer.setDuplex(false);
        printer.printPages(10);
    }
}
