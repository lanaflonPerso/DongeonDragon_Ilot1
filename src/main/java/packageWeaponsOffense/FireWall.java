package packageWeaponsOffense;

/**
 * The type Fire wall.
 */
public class FireWall extends WeaponsOffense {
    private String attackAllEnemy;

    /**
     * Instantiates a new Fire wall.
     *
     * @param pName           the p name
     * @param pAttackAllEnemy the p attack all enemy
     */
    public FireWall(String pName, String pAttackAllEnemy) {
        super(pName);
        this.attackAllEnemy = pAttackAllEnemy;
    }


    /**
     * Gets attack all enemy.
     *
     * @return the attack all enemy
     */
    public String getAttackAllEnemy() {
        return attackAllEnemy;
    }


    /**
     * Sets attack all enemy.
     *
     * @param attackAllEnemy the attack all enemy
     */
    public void setAttackAllEnemy(String attackAllEnemy) {
        this.attackAllEnemy = attackAllEnemy;
    }


    public String toString() {
        return super.toString() + "- Bonus d'attaque contre tous les ennemies : " + getAttackAllEnemy() + ".\n";
    }
}
