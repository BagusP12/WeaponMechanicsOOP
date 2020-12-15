package attachment;

public class LaserSight extends Attachment {

    private int value;

    public LaserSight(String name, String type, int value) {
        super(name, type);
        this.value = value;
        setDesc("Increase accuracy by " + value + "%");
    }

    public int getAttachmentValue() {
        return value;
    }
    
}
