package packageBox;

public class BoxMalus extends Box {

	String boxMalus;
	
	public BoxMalus(String pName, String pCaseMalus) {
		super(pName);
		this.boxMalus = pCaseMalus;
	}

	public String getBoxMalus() {
		return boxMalus;
	}

	public void setBoxMalus(String boxMalus) {
		this.boxMalus = boxMalus;
	}

	public String toString() {
		return super.toString() + "Recule de : " + getBoxMalus() + " cases.";
	}
}
