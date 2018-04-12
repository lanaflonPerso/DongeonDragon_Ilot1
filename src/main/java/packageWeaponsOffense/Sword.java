package packageWeaponsOffense;

public class Sword extends WeaponsOffense {
    private String bonusAllAttack;

    public Sword(String pName, String pBonusAllAttack) {
        super(pName);
        this.bonusAllAttack = pBonusAllAttack;
    }

    public String getBonusAllAttack() {
        return bonusAllAttack;
    }

    public void setBonusAllAttack(String pBonusAllAttack) {
        this.bonusAllAttack = pBonusAllAttack;
    }

    public String toString() {
        return super.toString() + "- Bonus d'attaque : " + getBonusAllAttack() + "\n";
    }

}
