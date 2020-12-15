package attachment;

public class LaserSight extends Attachment {

    public LaserSight(String name, String type, int value) {
        super(name, type, value);
        setDesc("Increase accuracy by " + value + "%");
    }

    public int getAttachmentValue() {
        return getValue();
    }
    
}
