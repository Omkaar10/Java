package PC;

public class myPC {

    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;
    private CPU cpu;
    private Printer printer;
    private Speakers speakers;


    public myPC(Monitor monitor, Mouse mouse, Keyboard keyboard, CPU cpu, Printer printer, Speakers speakers) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.cpu = cpu;
        this.printer = printer;
        this.speakers = speakers;
    }


    public Monitor getMonitor() {
        return monitor;
    }


    public Mouse getMouse() {
        return mouse;
    }


    public Keyboard getKeyboard() {
        return keyboard;
    }


    public CPU getCpu() {
        return cpu;
    }


    public Printer getPrinter() {
        return printer;
    }


    public Speakers getSpeakers() {
        return speakers;
    }
}
