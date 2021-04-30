package PC;

public class Resolution {
    private int acrossPixel;
    private int downPixel;


    public Resolution(int acrossPixel, int downPixel) {
        this.acrossPixel = acrossPixel;
        this.downPixel = downPixel;
    }


    public void display() {
        System.out.println("Display is: "+acrossPixel+" X "+downPixel);
    }
}
