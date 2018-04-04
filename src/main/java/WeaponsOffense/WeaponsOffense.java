package WeaponsOffense;

public abstract class WeaponsOffense {
    protected String name;
    protected String bonusAttackAllEnemy;

    public WeaponsOffense(String pName, String pBonusAttackAllEnemy) {
        name = pName;
        bonusAttackAllEnemy = pBonusAttackAllEnemy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBonusAttackAllEnemy() {
        return bonusAttackAllEnemy;
    }

    public void setBonusAttackAllEnemy(String bonusAttackAllEnemy) {
        this.bonusAttackAllEnemy = bonusAttackAllEnemy;
    }

    public String toString() {
        return "Nom de l'arme offensive : " + getName() + " ; Bonus d'attaque contre tous les ennemies : " + getBonusAttackAllEnemy();
    }

}
