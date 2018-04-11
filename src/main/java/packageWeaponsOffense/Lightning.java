package packageWeaponsOffense;

/**
 * The type Lightning.
 */
public class Lightning extends WeaponsOffense {
    private String bonusAttackWizards;
    private String bonusAttackDragons;

    /**
     * Instantiates a new Lightning.
     *
     * @param pName               the p name
     * @param pBonusAttackWizards the p bonus attack wizards
     * @param pBonusAttackDragons the p bonus attack dragons
     */
    public Lightning(String pName, String pBonusAttackWizards, String pBonusAttackDragons) {
        super(pName);
        this.bonusAttackWizards = pBonusAttackWizards;
        this.bonusAttackDragons = pBonusAttackDragons;
    }


    /**
     * Gets bonus attack wizards.
     *
     * @return the bonus attack wizards
     */
    public String getBonusAttackWizards() {
        return bonusAttackWizards;
    }


    /**
     * Sets bonus attack wizards.
     *
     * @param bonusAttackWizards the bonus attack wizards
     */
    public void setBonusAttackWizards(String bonusAttackWizards) {
        this.bonusAttackWizards = bonusAttackWizards;
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


    public String toString() {
        return super.toString() + "Bonus d'attaque contre les Sorciers : " + getBonusAttackWizards() + "Bonus d'attaque contre les Dragons : " + getBonusAttackDragons();
    }
}
