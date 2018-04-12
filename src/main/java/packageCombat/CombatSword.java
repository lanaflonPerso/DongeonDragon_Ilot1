package packageCombat;
import packageWeaponsOffense.*;

public class CombatSword implements CombatType {

    @Override
    public void attack () {
        System.out.println("attaque avec une epée");
    }
}
