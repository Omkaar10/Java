package PC;

public class Dimensions {
    private double length;
    private double width;
    private double height;


    public Dimensions() {
        this(42,42,18);
    }


    public Dimensions(double length, double width) {

        this(length,width,0);
    }

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height=height;
    }


    public void size() {
        if(height<=0)
            System.out.println("Dimensions are: "+length+" X "+width);
        else
            System.out.println("Dimensions are: "+length+" X "+width+" X "+height);
    }
}
