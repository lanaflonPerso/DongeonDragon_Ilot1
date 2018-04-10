package packageBox;

public class BoxBonus extends Box {

	String boxItems;
	
	public BoxBonus(String pName, String pCaseBonus) {
		super(pName);
		this.boxItems = pCaseBonus;
	}

	public String getBoxItems() {
		return boxItems;
	}

	public void setBoxItems(String boxItems) {
		this.boxItems = boxItems;
	}

	public String toString() {
		return super.toString() + " Avance de " + getBoxItems() + " cases.";
	}
	
}
