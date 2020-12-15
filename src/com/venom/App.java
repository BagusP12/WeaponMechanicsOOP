import weapons.*;
import attachment.*;

public class App {
    public static void main(String[] args) {

        Handgun glock = new Handgun("Glock", "Handgun", 20, 10, 40, 1400, 75, true);

        Handgun desertEagle = new Handgun("Desert Eagle", "Handgun", 50, 7, 28, 1200, 80, true);

        Handgun colt1860Army = new Handgun("Colt 1860 Army", "Revolver", 35, 6, 31, 900, 85, false);

        Scope vortexScope = new Scope("Vortex Spitfire 3x Scope", "Scope", 3);

        LaserSight gnpLaser = new LaserSight("G&P T1 Laser Sight", "Laser Sight", 5);

        desertEagle.weaponInfo();
        desertEagle.shoot();
        desertEagle.shoot();
        desertEagle.shoot();
        desertEagle.reload();

        desertEagle.installAttachment(vortexScope);
        desertEagle.installAttachment(gnpLaser);
        desertEagle.weaponInfo();

    }
    
}
