package packageDefenseTools;

public class Shields extends DefenseTools{
	private String shieldLevel2AllEnemy;
	
	public Shields(String pName, String pShieldLevel2AllEnemy){
		super(pName);
		this.shieldLevel2AllEnemy = pShieldLevel2AllEnemy;
	}
	
	public String getShieldLevel2AllEnemy() {
		return shieldLevel2AllEnemy;
	}
	
	public void setShieldLevel2AllEnemy(String shieldLevel2AllEnemy) {
		this.shieldLevel2AllEnemy = shieldLevel2AllEnemy;
	}

	public String toString() {
		String str = super.toString() + " - Level : " + getShieldLevel2AllEnemy(); 
		
		return 	str;		   
	}
}
