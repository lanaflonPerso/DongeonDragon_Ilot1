package packageCharacters;

import packageWeaponsOffense.*;

import java.util.ArrayList;

import packageDefenseTools.Shields;

/**
 * The type Warrior.
 */
public class Warrior extends CharactersPlayer {

    /**
     * Instantiates a new Warrior.
     *
     * @param pName          the p name
     * @param pImage         the p image
     * @param pLife          the p life
     * @param pAttack        the p attack
     * @param pWeaponOffense the p weapon offense
     * @param pShield        the p shield
     */
    public Warrior(String pName, String pImage, String pLife, String pAttack, WeaponsOffense pWeaponOffense, Shields pShield) {
        super(pName, pImage, pLife, pAttack, pWeaponOffense, pShield);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

