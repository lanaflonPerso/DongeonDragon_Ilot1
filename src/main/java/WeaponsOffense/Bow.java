package WeaponsOffense;

public class Bow extends WeaponsOffense{
	private String bonusAttackDragons;
	private String bonusAttackSuccubus;
	
	public Bow(String pName, String pBonusAttackDragons, String pBonusAttackSuccubus) {
		super(pName);
		this.bonusAttackDragons = pBonusAttackDragons;
		this.bonusAttackSuccubus = pBonusAttackSuccubus;
	}
	
	public String getBonusAttackDragons() {
		return bonusAttackDragons;
	}
	public void setBonusAttackDragons(String bonusAttackDragons) {
		this.bonusAttackDragons = bonusAttackDragons;
	}
	public String getBonusAttackSuccubus() {
		return bonusAttackSuccubus;
	}
	public void setBonusAttackSuccubus(String bonusAttackSuccubus) {
		this.bonusAttackSuccubus = bonusAttackSuccubus;
	}
	
	public String toString() {
		return super.toString() + "Bonus d'attaque contre les dragons : " + getBonusAttackDragons() + "Bonus d'attaque contre les succubes : " + getBonusAttackSuccubus();
	}
}
