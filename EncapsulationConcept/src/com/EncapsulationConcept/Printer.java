package com.EncapsulationConcept;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel<=100)
            this.tonerLevel=tonerLevel;
        else
            this.tonerLevel=-1;

        this.duplex = duplex;
        this.pagesPrinted=0;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        if(tonerAmount>0 && tonerAmount<=100) {
            if(tonerLevel+tonerAmount>100)
                return -1;
            else
                this.tonerLevel+=tonerAmount;

        return this.tonerLevel;
        }
        else
            return -1;

    }


    public int printPages(int pages) {

        int pagesToPrint = pages;

        if(this.duplex) {
            pagesToPrint=(pagesToPrint/2)+(pagesToPrint%2);
            System.out.println("Printing in duplex mode.");
            System.out.println("Printing "+pagesToPrint+" pages.");
            this.pagesPrinted+=pagesToPrint;
            System.out.println("Total pages printed are: "+pagesPrinted);
            return pagesToPrint;

        }
        else {
            System.out.println("Printing in single mode.");
            System.out.println("Printing "+pages+" pages.");
            this.pagesPrinted+=pagesToPrint;
            System.out.println("Total pages printed are: "+pagesPrinted);
            return pagesToPrint;
        }

    }


    private int getPagesPrinted() {
        return pagesPrinted;
    }

    public int pagesPrinted() {
        return getPagesPrinted();
    }
}
