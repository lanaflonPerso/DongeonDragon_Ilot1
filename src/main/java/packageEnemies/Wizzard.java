package packageEnemies;

/**
 * The type Wizzard.
 */
public class Wizzard extends CharactersEnemies {

    private String attackLevel;

    /**
     * Instantiates a new Wizzard.
     *
     * @param pName        the p name
     * @param pImage       the p image
     * @param pLife        the p life
     * @param pAttackLevel the p attack level
     */
    public Wizzard(String pName, String pImage, String pLife, String pAttackLevel) {
        super(pName, pImage, pLife);
        attackLevel = pAttackLevel;
    }

    /**
     * Gets attack level.
     *
     * @return the attack level
     */
    public String getAttackLevel() {
        return attackLevel;
    }

    /**
     * Sets attack level.
     *
     * @param attackLevel the attack level
     */
    public void setAttackLevel(String attackLevel) {
        this.attackLevel = attackLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " level d'attaque : " + getAttackLevel();
    }
}
 