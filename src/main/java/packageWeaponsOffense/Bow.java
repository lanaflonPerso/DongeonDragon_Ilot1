package packageWeaponsOffense;

/**
 * The type Bow.
 */
public class Bow extends WeaponsOffense {
    private String bonusAttackDragons;
    private String bonusAttackSuccubus;

    /**
     * Instantiates a new Bow.
     *
     * @param pName                the p name
     * @param pBonusAttackDragons  the p bonus attack dragons
     * @param pBonusAttackSuccubus the p bonus attack succubus
     */
    public Bow(String pName, String pBonusAttackDragons, String pBonusAttackSuccubus) {
        super(pName);
        this.bonusAttackDragons = pBonusAttackDragons;
        this.bonusAttackSuccubus = pBonusAttackSuccubus;
    }

    /**
     * Gets bonus attack dragons.
     *
     * @return the bonus attack dragons
     */
    public String getBonusAttackDragons() {
        return bonusAttackDragons;
    }

    /**
     * Sets bonus attack dragons.
     *
     * @param bonusAttackDragons the bonus attack dragons
     */
    public void setBonusAttackDragons(String bonusAttackDragons) {
        this.bonusAttackDragons = bonusAttackDragons;
    }

    /**
     * Gets bonus attack succubus.
     *
     * @return the bonus attack succubus
     */
    public String getBonusAttackSuccubus() {
        return bonusAttackSuccubus;
    }

    /**
     * Sets bonus attack succubus.
     *
     * @param bonusAttackSuccubus the bonus attack succubus
     */
    public void setBonusAttackSuccubus(String bonusAttackSuccubus) {
        this.bonusAttackSuccubus = bonusAttackSuccubus;
    }

    public String toString() {
        return super.toString() + "- Bonus d'attaque contre les dragons : " + getBonusAttackDragons() + "\n- Bonus d'attaque contre les succubes : " + getBonusAttackSuccubus() + "\n";
    }
}
