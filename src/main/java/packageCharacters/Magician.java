package packageCharacters;

import packageWeaponsOffense.*;
import packageDefenseTools.Filters;

/**
 * The type Magician.
 */
public class Magician extends CharactersPlayer {


    /**
     * Instantiates a new Magician.
     *
     * @param pName           the p name
     * @param pImage          the p image
     * @param pLife           the p life
     * @param pAttack         the p attack
     * @param pWeaponsOffense the p weapons offense
     * @param pFilter         the p filter
     */
    public Magician(String pName, String pImage, String pLife, String pAttack, WeaponsOffense pWeaponsOffense, Filters pFilter) {
        super(pName, pImage, pLife, pAttack, pWeaponsOffense, pFilter);

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
