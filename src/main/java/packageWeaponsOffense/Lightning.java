package packageWeaponsOffense;

public class Lightning extends WeaponsOffense {
    private String bonusAttackWizards;
    private String bonusAttackDragons;

    public Lightning(String pName, String pBonusAttackWizards, String pBonusAttackDragons) {
        super(pName);
        this.bonusAttackWizards = pBonusAttackWizards;
        this.bonusAttackDragons = pBonusAttackDragons;
    }


    public String getBonusAttackWizards() {
        return bonusAttackWizards;
    }


    public void setBonusAttackWizards(String bonusAttackWizards) {
        this.bonusAttackWizards = bonusAttackWizards;
    }


    public String getBonusAttackDragons() {
        return bonusAttackDragons;
    }


    public void setBonusAttackDragons(String bonusAttackDragons) {
        this.bonusAttackDragons = bonusAttackDragons;
    }


    public String toString() {
        return super.toString() + "- Bonus d'attaque contre les Sorciers : " + getBonusAttackWizards() + ".\n- Bonus d'attaque contre les Dragons : " + getBonusAttackDragons() + ".\n";
    }
}
