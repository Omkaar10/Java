package PC;

public class Printer {
    private String printerBrand;
    private String printerModel;
    private boolean printerStatus;
    private Dimensions printerDimensions;


    public Printer(String printerBrand, String printerModel, Dimensions printerDimensions) {
        this(printerBrand,printerModel,false,printerDimensions);
    }


    public Printer(String printerBrand, String printerModel, boolean printerStatus, Dimensions printerDimensions) {
        this.printerBrand = printerBrand;
        this.printerModel = printerModel;
        this.printerStatus = printerStatus;
        this.printerDimensions = printerDimensions;
    }


    public void printerSize() {
        printerDimensions.size();
    }


    public void isPrinting(String printingWork) {
        if(printingWork.isEmpty()) {
            printerStatus= false;
            System.out.println("Printer is not printing anything");
        }
        else {
            printerStatus=true;
            System.out.println("Printer is printing: "+printingWork);
        }
    }


    public boolean isPrinterStatus() {
        return printerStatus;
    }
}
