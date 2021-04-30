package PC;

public class CPU {

    private String cpuBrand;
    private String cpuModel;
    private boolean powerSupply;
    private Dimensions dimensions;


    public CPU(String cpuBrand, String cpuModel, boolean powerSupply, Dimensions dimensions) {
        this.cpuBrand = cpuBrand;
        this.cpuModel = cpuModel;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }


    public void powerUp(int powerButton) {
        if(powerButton>0 && powerButton<2) {
            powerSupply=true;
            System.out.println("CPU is on");
        }
        else {
            powerSupply=false;
            System.out.println("CPU has no power supply");
        }
    }


    public String getCpuBrand() {
        return cpuBrand;
    }


    public String getCpuModel() {
        return cpuModel;
    }


    public void cpuSize() {
        dimensions.size();
    }


    public boolean isPowerSupply() {
        return powerSupply;
    }
}
