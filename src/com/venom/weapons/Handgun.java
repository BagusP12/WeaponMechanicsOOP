package weapons;

public class Handgun extends Firearm {

    public Handgun(String name, String type, int damage, int ammoCount, int reservedAmmo, int rateOfFire, double accuracy, boolean magazineReload) {
        super(name, type, damage, ammoCount, reservedAmmo, rateOfFire, accuracy, magazineReload);
    }

    public void shoot() {
        if (ammoCount > 0) {
            shootingMechanics();
            System.out.println("...");
        } else {
            reload();
        }
    }

    private void shootingMechanics() {
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

}