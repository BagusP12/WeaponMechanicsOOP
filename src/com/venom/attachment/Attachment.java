package attachment;

public abstract class Attachment {

    private String name;
    private String type;
    private String desc;

    public Attachment(String name, String type) {
        this.name = name;
        this.type = type;
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
    
    void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract int getAttachmentValue();

}