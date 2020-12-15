package weapons;

public class AssaultRifle extends Firearm {

    private String selectMode;
    private int burstRate = 3;

    public AssaultRifle(String name, String type, int damage, int ammoCount, int reservedAmmo, int rateOfFire, double accuracy, double recoil, int burstRate) {
        super(name, type, damage, ammoCount, reservedAmmo, rateOfFire, accuracy, recoil, true);
        this.selectMode = "auto";
        this.burstRate = burstRate;
    }


    public void shoot() {
        if (ammoCount > 0) {
            if(selectMode.equals("single")) {
                shootingMechanics();
                System.out.println("...");
            }
            else if (selectMode.equals("burst")) {
                for (int i = burstRate; i > 0; i--) {
                    shootingMechanics();
                }
                System.out.println("...");
            }
            else if (selectMode.equals("auto")) {
                for (int i = ammoCount; i > 0; i--) {
                    shootingMechanics();
                }
                System.out.println("...");
            }
        } else {
            reload();
        }
    }

    void shootingMechanics() {
        showAmmoStatus();;
        ammoCount--;
    }

    public void reload() {
        if (ammoCount < maxMagazineAmmo) {
            System.out.println("Reloading...");
            reservedAmmo -= maxMagazineAmmo - ammoCount;
            ammoCount = maxMagazineAmmo;
            showAmmoStatus();
        } else {
            System.out.println("No need to reload!");
        }
    }

    public void changeFireMode(String selectMode) {
        this.selectMode = selectMode;
        System.out.println("Fire mode : " + selectMode);
    }
    
}
