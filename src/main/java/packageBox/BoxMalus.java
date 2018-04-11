package packageBox;

/**
 * The type Box malus.
 */
public class BoxMalus extends Box {

	/**
	 * The Box malus.
	 */
	String boxMalus;

	/**
	 * Instantiates a new Box malus.
	 *
	 * @param pName     the p name
	 * @param pBoxMalus the p box malus
	 */
	public BoxMalus(String pName, String pBoxMalus) {
		super(pName);
		this.boxMalus = pBoxMalus;
	}

	/**
	 * Gets box malus.
	 *
	 * @return the box malus
	 */
	public String getBoxMalus() {
		return boxMalus;
	}

	/**
	 * Sets box malus.
	 *
	 * @param boxMalus the box malus
	 */
	public void setBoxMalus(String boxMalus) {
		this.boxMalus = boxMalus;
	}

	public String toString() {
		return super.toString() + "Recule de : " + getBoxMalus() + " cases.";
	}
}
