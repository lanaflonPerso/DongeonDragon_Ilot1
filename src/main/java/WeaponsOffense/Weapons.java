package WeaponsOffense;

public class Weapons extends WeaponsOffense{

	private int nBonusAttackDragons;
	private int nBonusAttackSuccubes;

	
	public Weapons(String sName, int nBonusAttackAllEnemy, int nBonusAttackDragons, int nBonusAttackSuccubes){
		super(sName, nBonusAttackAllEnemy);
		this.nBonusAttackDragons=nBonusAttackDragons;
		this.nBonusAttackSuccubes = nBonusAttackSuccubes;
	}
	
	public void setBonusAttackDragons(int nBonusAttackDragons) {
		this.nBonusAttackDragons = nBonusAttackDragons; 
	}

	public void setBonusAttackSuccubes(int nBonusAttackSuccubes) {
		this.nBonusAttackSuccubes = nBonusAttackSuccubes; 
	}
	
	public int getBonusAttackDragons() {
		return this.nBonusAttackDragons; 
	}

	public int getBonusAttackSuccubes() {
		return this.nBonusAttackSuccubes; 
	}
	
	public String toString() {
		return super.toString() +
			   " ; Bonus d'attaque Dragons : " + getBonusAttackDragons() + 
			   " ; Bonus d'attaque Succubes : " + getBonusAttackSuccubes(); 
	}
	
	
	

}
