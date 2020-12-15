package attachment;

public class Grip extends Attachment{

    public Grip(String name, String type, int value) {
        super(name, type, value);
        setDesc("Remove "+ value + " recoil");
    }

    public int getAttachmentValue() {
        return getValue();
    }
    
}
