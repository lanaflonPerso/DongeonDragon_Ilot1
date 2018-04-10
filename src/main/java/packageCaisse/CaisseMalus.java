package packageCaisse;

public class CaisseMalus extends CharactersCaisse {
    String caseMalus;

    public CaisseMalus(String pName, String pCaseMalus) {
        super(pName);
        this.caseMalus = pCaseMalus;
    }

    public String getCaseMalus() {
        return caseMalus;
    }

    public void setCaseMalus(String caseMalus) {
        this.caseMalus = caseMalus;
    }

    public String toString() {
        return super.toString() + "Recule de : " + getCaseMalus() + " cases.";
    }
}
