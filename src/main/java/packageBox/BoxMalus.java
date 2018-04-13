package packageBox;

public class BoxMalus extends Box {

    String boxMalus;

    public BoxMalus(String pName, String pBoxMalus) {
        super(pName);
        this.boxMalus = pBoxMalus;
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

    @Override
    public void interactWithUser() {

    }
}
