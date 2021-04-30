package PC;

public class Main {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("Dell",60,new Resolution(2540,1440),new Dimensions(15,25));
        CPU cpu = new CPU("Lenevo","ST250",false,new Dimensions());
        Mouse mouse = new Mouse("Logitek","54LK");
        Keyboard keyboard = new Keyboard("Lenevo","AX20",new Dimensions(5,15));
        Speakers speakers = new Speakers("Bose","ZX-540");
        Printer printer = new Printer("HP","SA-5500",new Dimensions(8,17,14));


        myPC pc = new myPC(monitor,mouse,keyboard,cpu,printer,speakers);

        pc.getMonitor().monitorSize();
        pc.getCpu().powerUp(1);
        pc.getCpu().isPowerSupply();
        pc.getMouse().mouseTracking(45);
        pc.getMouse().mouseTracking(-10);
        System.out.println(pc.getSpeakers().getSpeakerVolume());
        pc.getSpeakers().increaseVolume(20);
        pc.getMouse().selection("hello world");



    }
}
