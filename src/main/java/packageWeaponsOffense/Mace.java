package packageWeaponsOffense;

public class Mace extends WeaponsOffense{
	private String attackAllEnemy;

	public Mace(String pName, String pAttackAllEnemy) {
		super(pName);
		this.attackAllEnemy = pAttackAllEnemy;
	}
	
	public String getAttackAllEnemy() {
		return attackAllEnemy;
	}

	public void setAttackAllEnemy(String attackAllEnemy) {
		this.attackAllEnemy = attackAllEnemy;
	}
	
	public String toString() {
		return super.toString() + "Points d'attaque : " + getAttackAllEnemy();
	}
}
