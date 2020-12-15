package attachment;

public class Scope extends Attachment {

    private int value;

    public Scope(String name, String type, int value) {
        super(name, type);
        this.value = value;
        setDesc(value + "x Zoom In");
    }

    public int getAttachmentValue() {
        return value;
    }

}