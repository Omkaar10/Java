package PC;

public class Speakers {

    private String speakerBrand;
    private String speakerModel;
    private int speakerVolume;


    public Speakers(String speakerBrand, String speakerModel) {
        this(speakerBrand,speakerModel,0);
    }

    public Speakers(String speakerBrand, String speakerModel, int speakerVolume) {
        this.speakerBrand = speakerBrand;
        this.speakerModel = speakerModel;
        this.speakerVolume = speakerVolume;
    }


    public String getSpeakerBrand() {
        return speakerBrand;
    }


    public String getSpeakerModel() {
        return speakerModel;
    }


    public int getSpeakerVolume() {
        return speakerVolume;
    }


    public void increaseVolume(int volume) {
        speakerVolume+=volume;
        System.out.println("Speaker Volume is: "+speakerVolume);
    }


    public void decreaseVolume(int volume) {
        speakerVolume-=volume;
        System.out.println("Speaker Volume is: "+speakerVolume);
    }
}
