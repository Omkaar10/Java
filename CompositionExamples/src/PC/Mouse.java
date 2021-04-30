package PC;

public class Mouse {
    private int scroll;
    private boolean select;
    private String mouseBrand;
    private String mouseModel;


    public Mouse(String mouseBrand,String mouseModel) {
        this(0,false,mouseBrand,mouseModel);
    }


    public Mouse(int scroll, boolean select, String mouseBrand, String mouseModel) {
        this.scroll = scroll;
        this.select = select;
        this.mouseBrand = mouseBrand;
        this.mouseModel = mouseModel;
    }

    public void mouseTracking(int scroll) {
        if(scroll<0)
            System.out.println("Scrolling down");
        else
            System.out.println("Scrolling up");
    }


    public void selection(String object) {
         if (object.isEmpty()) {
             System.out.println("Nothing selected");
             select=false;
         }

         else {
             System.out.println("Current selection is: "+object);
             select=true;
         }
    }


    public boolean isSelect() {
        return select;
    }
}
