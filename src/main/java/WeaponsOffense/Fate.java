package WeaponsOffense;

public class Fate extends WeaponsOffense{

	private String bonusAttackSorcier;
	private String bonusAttackDragon;
	
	public Fate(String pName, String pBonusAttackAllEnemy, String pBonusAttackSorcier, String pBonusAttackDragon){
		super(pName, pBonusAttackAllEnemy);
		bonusAttackSorcier = pBonusAttackSorcier;
		bonusAttackDragon = pBonusAttackDragon;
	}

	public String getBonusAttackSorcier() {
		return bonusAttackSorcier;
	}

	public void setBonusAttackSorcier(String bonusAttackSorcier) {
		this.bonusAttackSorcier = bonusAttackSorcier;
	}

	public String getBonusAttackDragon() {
		return bonusAttackDragon;
	}

	public void setBonusAttackDragon(String bonusAttackDragon) {
		this.bonusAttackDragon = bonusAttackDragon;
	}

	public String toString() {
		return  super.toString() +
				" ; Bonus d'attaque contre les Sorciers : " + getBonusAttackSorcier() +
				" ; Bonus d'attaque contre les Dragons : " + getBonusAttackDragon();
	}
}



































