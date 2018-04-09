package packageCaisse;

public class CaisseBonus extends CharactersCaisse{
	String caseBonus;
	
	public CaisseBonus(String pName, String pCaseBonus) {
		super(pName);
		this.caseBonus = pCaseBonus;
	}

	
	
	public String getCaseBonus() {
		return caseBonus;
	}



	public void setCaseBonus(String caseBonus) {
		this.caseBonus = caseBonus;
	}



	public String toString() {
		return super.toString() + " Avance de " + getCaseBonus() + " cases.";
	}
	
}
