package weapons;

public class Shotgun extends Firearm {

    private String selectMode;

    public Shotgun(String name, String type, int damage, int ammoCount, int reservedAmmo, int rateOfFire, double accuracy, double recoil, boolean magazineReload) {
        super(name, type, damage, ammoCount, reservedAmmo, rateOfFire, accuracy, recoil, magazineReload);
        selectMode = "single";
    }

    public void shoot() {
        if (ammoCount > 0) {
            if(selectMode.equals("single")) {
                shootingMechanics();
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
            if (magazineReload) {
                System.out.println("Reloading...");
                reservedAmmo -= maxMagazineAmmo - ammoCount;
                ammoCount = maxMagazineAmmo;
                showAmmoStatus();
            } else {
                int timesReloading = maxMagazineAmmo - ammoCount;
                for(int i = 0; i < timesReloading; i++){
                    System.out.println("Reloading...");
                    ammoCount++;
                    reservedAmmo--;
                    showAmmoStatus();
                }
            }
        } else {
            System.out.println("No need to reload!");
        }
    }

    public void changeFireMode(String selectMode) {
        this.selectMode = selectMode;
        System.out.println("Fire mode : " + selectMode);
    }
   
}
