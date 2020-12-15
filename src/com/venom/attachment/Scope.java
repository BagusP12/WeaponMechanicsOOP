package attachment;

public class Scope extends Attachment {

    public Scope(String name, String type, int value) {
        super(name, type, value);
        setDesc(value + "x zoom in");
    }

    public int getAttachmentValue() {
        return getValue();
    }

}