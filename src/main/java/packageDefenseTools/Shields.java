package packageDefenseTools;

/**
 * The type Shields.
 */
public class Shields extends DefenseTools {
    private String shieldLevel2AllEnemy;

    /**
     * Instantiates a new Shields.
     *
     * @param pName                 the p name
     * @param pShieldLevel2AllEnemy the p shield level 2 all enemy
     */
    public Shields(String pName, String pShieldLevel2AllEnemy) {
        super(pName);
        this.shieldLevel2AllEnemy = pShieldLevel2AllEnemy;
    }

    /**
     * Gets shield level 2 all enemy.
     *
     * @return the shield level 2 all enemy
     */
    public String getShieldLevel2AllEnemy() {
        return shieldLevel2AllEnemy;
    }

    /**
     * Sets shield level 2 all enemy.
     *
     * @param shieldLevel2AllEnemy the shield level 2 all enemy
     */
    public void setShieldLevel2AllEnemy(String shieldLevel2AllEnemy) {
        this.shieldLevel2AllEnemy = shieldLevel2AllEnemy;
    }

    public String toString() {
        String str = super.toString() + " - Level : " + getShieldLevel2AllEnemy();

        return str;
    }
}
