package attachment;

public abstract class Attachment {

    private String name;
    private String type;
    private String desc;

    private int value;

    public Attachment(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public int getValue() {
        return value;
    }
    
    void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract int getAttachmentValue();

}