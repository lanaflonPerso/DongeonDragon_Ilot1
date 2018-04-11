package packageBox;

/**
 * The type Box bonus.
 */
public class BoxBonus extends Box {

    /**
     * The Box bonus.
     */
    String boxBonus;

    /**
     * Instantiates a new Box bonus.
     *
     * @param pName     the p name
     * @param pBoxBonus the p box bonus
     */
    public BoxBonus (String pName, String pBoxBonus) {
        super(pName);
        this.boxBonus = pBoxBonus;
    }

    /**
     * Gets box bonus.
     *
     * @return the box bonus
     */
    public String getBoxBonus() {
        return boxBonus;
    }

    /**
     * Sets box bonus.
     *
     * @param boxBonus the box bonus
     */
    public void setBoxBonus(String boxBonus) {
        this.boxBonus = boxBonus;
    }

    public String toString() {
        return super.toString() + "Avance de : "+ getBoxBonus()  + "cases";
    }
}
