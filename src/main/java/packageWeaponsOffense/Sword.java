package packageWeaponsOffense;

/**
 * The type Sword.
 */
public class Sword extends WeaponsOffense {
    private String bonusAllAttack;

    /**
     * Instantiates a new Sword.
     *
     * @param pName           the p name
     * @param pBonusAllAttack the p bonus all attack
     */
    public Sword(String pName, String pBonusAllAttack) {
        super(pName);
        this.bonusAllAttack = pBonusAllAttack;
    }

    /**
     * Gets bonus all attack.
     *
     * @return the bonus all attack
     */
    public String getBonusAllAttack() {
        return bonusAllAttack;
    }

    /**
     * Sets bonus all attack.
     *
     * @param pBonusAllAttack the p bonus all attack
     */
    public void setBonusAllAttack(String pBonusAllAttack) {
        this.bonusAllAttack = pBonusAllAttack;
    }

    public String toString() {
        return super.toString() + "- Bonus d'attaque : " + getBonusAllAttack() + "\n";
    }

}
