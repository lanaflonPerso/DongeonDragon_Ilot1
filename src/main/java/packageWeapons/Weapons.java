package packageWeapons;

public class Weapons {

		private String nName;
		private int nBonusAttackDragons;
		private int nBonusAttackSuccubes;
		private int nBonusAttackEnemy;

	
	public Weapons(String nName, int nBonusAttackDragons, int nBonusAttackSuccubes, int nBonusAttackEnemy){
		this.nName=nName;
		this.nBonusAttackDragons=nBonusAttackDragons;
		this.nBonusAttackSuccubes = nBonusAttackSuccubes;
		this.nBonusAttackEnemy = nBonusAttackEnemy;
	}
	
	public String toString() {
		String str =  " - Nom de l'arme : " + nName + ".\n";
		String str1 = " - Bonus contre les dragons : +" + nBonusAttackDragons + ".\n";
		String str2 = " - Bonus contre les succubes : +" + nBonusAttackSuccubes + ".\n";
		String str3 = " - Bonus contre tous les ennemies +" + nBonusAttackEnemy + ".\n";
		return   str + str1 + str2 + str3;
	}
}
