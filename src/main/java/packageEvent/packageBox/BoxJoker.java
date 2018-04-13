package packageEvent.packageBox;

public class BoxJoker extends Box {

    String boxLife;

    public BoxJoker(String pName, String pBoxLife) {
        super(pName);
        this.boxLife = pBoxLife;
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

    @Override
    public void interactWithUser() {

        System.out.println("Je suis tombé sur une " + getName() + " à la case " + getPositionPlateau() + "\n");

    }

}
