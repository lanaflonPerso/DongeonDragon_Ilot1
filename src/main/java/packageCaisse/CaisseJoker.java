package packageCaisse;

public class CaisseJoker extends CharactersCaisse {

    String caseHP;

    public CaisseJoker(String pName, String pCaseHP) {
        super(pName);
        this.caseHP = pCaseHP;
    }

    public String getCaseHP() {
        return caseHP;
    }

    public void setCaseHP(String caseHP) {
        this.caseHP = caseHP;
    }

    public String toString() {
        return super.toString() + "Ton nombres de HP est augmente de " + getCaseHP();
    }

}
