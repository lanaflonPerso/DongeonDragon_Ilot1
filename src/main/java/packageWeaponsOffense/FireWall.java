package packageWeaponsOffense;

public class FireWall extends WeaponsOffense{
	private String attackAllEnemy;

	public FireWall(String pName, String pAttackAllEnemy) {
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
		return super.toString() + "Bonus d'attaque contre tous les ennemies : " + getAttackAllEnemy();
	}	
}
