package WeaponsOffense;

public class Fate extends WeaponsOffense{
	private int nBonusAttackSorcier;
	private int nBonusAttackDragon;

	
	public Fate(String sName, int nBonusAttackAllEnemy, int nBonusAttackSorcier, int nBonusAttackDragon){
		super(sName, nBonusAttackAllEnemy);
		this.nBonusAttackSorcier=nBonusAttackSorcier;
		this.nBonusAttackDragon = nBonusAttackDragon;
	}
	
	public void setBonusAttackSorcier(int nBonusAttackSorcier) {
		this.nBonusAttackSorcier = nBonusAttackSorcier;
	}
	
	public void setBonusAttackDragon(int nBonusAttackDragon) {
		this.nBonusAttackDragon = nBonusAttackDragon;
	}
		
	public int getBonusAttackSorcier() {
		return nBonusAttackSorcier;
	}
	
	public int getBonusAttackDragon() {
		return nBonusAttackDragon;
	}
	
	public String toString() {
		return  super.toString() +
				" ; Bonus d'attaque contre les Sorciers : " + getBonusAttackSorcier() +
				" ; Bonus d'attaque contre les Dragons : " + getBonusAttackDragon(); 
	}
}


































