package WeaponsOffense;

public abstract class  WeaponsOffense {
	protected String sName;
	protected int nBonusAttackAllEnemy;
	
	public WeaponsOffense(String sName, int nBonusAttackAllEnemy) {
		this.sName = sName;
		this.nBonusAttackAllEnemy = nBonusAttackAllEnemy;
	}
	
	public void setName(String sName) {
		this.sName = sName;
	}
	
	public void setBonusAttackEnemy(int nBonusAttackAllEnemy) {
		this.nBonusAttackAllEnemy = nBonusAttackAllEnemy; 
	}
	
	public String getName() {
		return this.sName;
	}
	
	public int getBonusAttackEnemy() {
		return this.nBonusAttackAllEnemy; 
	}
	
	public String toString() {
		return "Nom de l'arme : " + getName() + " ; Bonus d'attaque contre tous les ennemies : " + getBonusAttackEnemy(); 
	}

}
