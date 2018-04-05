package WeaponsOffense;

public class Weapons extends WeaponsOffense{

	private String bonusAttackDragons;
	private String bonusAttackSuccubes;

	public Weapons(String pName, String pBonusAttackAllEnemy, String pBonusAttackDragons, String pBonusAttackSuccubes){
		super(pName, pBonusAttackAllEnemy);
		bonusAttackDragons = pBonusAttackDragons;
		bonusAttackSuccubes = pBonusAttackSuccubes;
	}

	public String getBonusAttackDragons() {
		return bonusAttackDragons;
	}

	public void setBonusAttackDragons(String bonusAttackDragons) {
		this.bonusAttackDragons = bonusAttackDragons;
	}

	public String getBonusAttackSuccubes() {
		return bonusAttackSuccubes;
	}

	public void setBonusAttackSuccubes(String bonusAttackSuccubes) {
		this.bonusAttackSuccubes = bonusAttackSuccubes;
	}

	public String toString() {
		return super.toString() +
			   " ; Bonus d'attaque Dragons : " + getBonusAttackDragons() + 
			   " ; Bonus d'attaque Succubes : " + getBonusAttackSuccubes();
	}
}
