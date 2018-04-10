package packageBox;

public class BoxJoker extends Box {

	String boxLife;
	
	public BoxJoker(String pName, String pCaseHP) {
		super(pName);
		this.boxLife = pCaseHP;
	}
	
	public String getBoxLife() {
		return boxLife;
	}

	public void setBoxLife(String boxLife) {
		this.boxLife = boxLife;
	}

	public String toString() {
		return super.toString() + "Ton nombres de HP est augmente de " + getBoxLife();
	}

}
