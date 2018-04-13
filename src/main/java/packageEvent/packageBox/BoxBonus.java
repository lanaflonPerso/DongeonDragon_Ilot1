package packageEvent.packageBox;

public class BoxBonus extends Box {

    String boxBonus;

    public BoxBonus (String pName, String pBoxBonus) {
        super(pName);
        this.boxBonus = pBoxBonus;
    }

    public String getBoxBonus() {
        return boxBonus;
    }

    public void setBoxBonus(String boxBonus) {
        this.boxBonus = boxBonus;
    }

    public String toString() {
        return super.toString() + "Avance de : "+ getBoxBonus()  + "cases";
    }

    @Override
    public void interactWithUser() {

        System.out.println("Je suis tombé sur une " + getName() + " à la case " + getPositionPlateau() + "qui me fais avancer de " + getBoxBonus() + " cases" + "\n");

    }
}
