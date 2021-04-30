package PC;

public class Keyboard {

    private String keyboardBrand;
    private String keyboardModel;
    private Dimensions keyboardDimensions;
    private boolean typing;


    public Keyboard(String keyboardBrand, String keyboardModel, Dimensions keyboardDimensions) {
        this(keyboardBrand,keyboardModel,keyboardDimensions,false);
    }


    public Keyboard(String keyboardBrand, String keyboardModel, Dimensions keyboardDimensions, boolean typing) {
        this.keyboardBrand = keyboardBrand;
        this.keyboardModel = keyboardModel;
        this.keyboardDimensions = keyboardDimensions;
        this.typing=typing;
    }


    public String getKeyboardBrand() {
        return keyboardBrand;
    }


    public String getKeyboardModel() {
        return keyboardModel;
    }


    public void keyboardSize() {
        keyboardDimensions.size();
    }


    public void startTyping(String anything) {
        if(anything.isEmpty()) {
            typing = false;
            System.out.println("Typing nothing");
        }
        else {
            System.out.println("Typing: "+anything);
        }
    }


    public boolean isTyping() {
        return typing;
    }
}
