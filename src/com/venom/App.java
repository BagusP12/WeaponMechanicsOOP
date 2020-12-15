import weapons.*;
import attachment.*;

public class App {
    public static void main(String[] args) {

        Handgun glock = new Handgun("Glock", "Handgun", 20, 10, 40, 1400, 75, 40, true);

        Handgun desertEagle = new Handgun("Desert Eagle", "Handgun", 50, 7, 28, 1200, 80, 70, true);

        Handgun colt1860Army = new Handgun("Colt 1860 Army", "Revolver", 35, 6, 31, 900, 85, 60, false);

        AssaultRifle m4a1 = new AssaultRifle("M4A1", "Assault Rifle", 30, 30, 120, 1300, 80, 70, 3);

        Scope vortexScope = new Scope("Vortex Spitfire 3x Scope", "Scope", 3);

        LaserSight gnpLaser = new LaserSight("G&P T1 Laser Sight", "Laser Sight", 5);

        Grip fabGrip = new Grip("FAB Finger Grooves REG", "Fore Grip", 10);

        desertEagle.weaponInfo();
        desertEagle.shoot();
        desertEagle.shoot();
        desertEagle.shoot();
        desertEagle.reload();

        desertEagle.installAttachment(vortexScope);
        desertEagle.installAttachment(gnpLaser);
        desertEagle.weaponInfo();

        m4a1.weaponInfo();
        m4a1.changeFireMode("burst");
        m4a1.shoot();
        m4a1.shoot();
        m4a1.shoot();
        m4a1.changeFireMode("single");
        m4a1.shoot();
        m4a1.shoot();
        m4a1.shoot();
        m4a1.shoot();
        m4a1.shoot();
        m4a1.shoot();
        m4a1.changeFireMode("auto");
        m4a1.shoot();
        m4a1.changeFireMode("single");
        m4a1.shoot();

        m4a1.installAttachment(vortexScope);
        m4a1.installAttachment(fabGrip);

        m4a1.weaponInfo();
        m4a1.shoot();
        m4a1.shoot();
        m4a1.shoot();
        m4a1.pickupAmmo(53);

    }
    
}
