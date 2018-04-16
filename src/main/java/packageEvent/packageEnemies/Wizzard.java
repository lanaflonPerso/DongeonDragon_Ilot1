package packageEvent.packageEnemies;

public class Wizzard extends CharactersEnemies {

    private String attackLevel;

    public Wizzard(String pName, String pImage, String pLife, String pAttackLevel) {
        super(pName, pImage, pLife);
        attackLevel = pAttackLevel;
    }

    public String getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(String attackLevel) {
        this.attackLevel = attackLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " level d'attaque : " + getAttackLevel();
    }

    @Override
    public void interactWithUser() {
        System.out.println("Je suis tombé sur un " + getName() + " à la case " + getPositionPlateau());
        System.out.println("Il possède une puissance de : " + getAttackLevel() + "\n");

    }
}
 