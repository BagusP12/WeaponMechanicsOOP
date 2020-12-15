package weapons;

import java.util.ArrayList;
import java.util.List;
import attachment.*;

public abstract class Firearm {

    String name;
    String type;

    int damage;
    int ammoCount;
    int maxMagazineAmmo;
    int reservedAmmo;
    int selectMode;

    double accuracy;
    double zoom;

    boolean magazineReload;

    private List<Attachment> attachment = new ArrayList<Attachment>();

    public Firearm(String name, String type, int damage, int ammoCount, int reservedAmmo, int rateOfFire, double accuracy, boolean magazineReload) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.ammoCount = ammoCount;
        this.maxMagazineAmmo = ammoCount;
        this.reservedAmmo = reservedAmmo;
        this.selectMode = rateOfFire;
        this.accuracy = accuracy;
        this.magazineReload = magazineReload;
        zoom = 0;
    }

    public void weaponInfo() {
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Type\t\t: " + this.type);
        System.out.println("Damage\t\t: " + this.damage);
        System.out.println("Rate of Fire\t: " + this.selectMode + "RPM");
        System.out.println("Accuracy\t: " + accuracy + "%");
        System.out.println("Ammo\t\t: " + getAmmoStatus());
        if (attachment.size() > 0) {
            System.out.println("Attachment\t: " + attachment.size());
            for (int i = 0; i < attachment.size(); i++) {
                System.out.println("\t" + (i + 1) + ".");
                System.out.println("\tName : " + attachment.get(i).getName());
                System.out.println("\tType : " + attachment.get(i).getType());
                System.out.println("\tDesc : " + attachment.get(i).getDesc());
            }
        }
    }

    public void showAmmoStatus() {
        System.out.println(ammoCount + "/" + reservedAmmo);
    }

    public String getAmmoStatus() {
        return ammoCount + "/" + reservedAmmo;
    }

    public abstract void shoot();
    public abstract void reload();
    abstract void shootingMechanics();

    public void pickupAmmo(int amount) {
        reservedAmmo += amount;
        System.out.println("Picking " + amount + " Ammo");
        showAmmoStatus();
    }

    public void installAttachment(Attachment attachment) {
        this.attachment.add(attachment);
        //addAccuracy(attachment);
        if(attachment.getClass() == Scope.class) {
            addZoom(attachment);
        } else if (attachment.getClass() == LaserSight.class) {
            addAccuracy(attachment);
        }
        System.out.println("Attachment installed : " + attachment.getName());
    }

    public void addAccuracy(Attachment attachment) {
        accuracy += attachment.getAttachmentValue();
    }

    public void addZoom(Attachment attachment) {
        zoom = attachment.getAttachmentValue();
    }
    
}