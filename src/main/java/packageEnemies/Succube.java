package packageEnemies;

public class Succube extends  CharactersEnemies {

    protected String attackLevel;

    public Succube(String pName, String pImage, String pLife, String pAttackLevel) {
        super(pName,pImage,pLife);
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
        return super.toString() + "level d'attaque" + getAttackLevel();
    }
}
