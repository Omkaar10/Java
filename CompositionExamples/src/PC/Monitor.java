package PC;

public class Monitor {
    private String monitorBrand;
    private int refreshRate;
    private Resolution resolution;
    private Dimensions monitorDimensions;


    public Monitor(String monitorBrand, int refreshRate, Resolution resolution, Dimensions monitorDimensions) {
        this.monitorBrand = monitorBrand;
        this.refreshRate = refreshRate;
        this.resolution = resolution;
        this.monitorDimensions = monitorDimensions;
    }


    public void drawPixel(int x, int y) {
        System.out.println("Displaying object at: ("+x+","+y+")");

    }

    public String getBrand() {
        return monitorBrand;
    }


    public void screenDisplay() {
         resolution.display();
    }


    public void monitorSize() {
        monitorDimensions.size();
    }

}
