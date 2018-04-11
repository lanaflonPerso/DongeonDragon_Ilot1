package packageBox;

/**
 * The type Box joker.
 */
public class BoxJoker extends Box {

	/**
	 * The Box life.
	 */
	String boxLife;

	/**
	 * Instantiates a new Box joker.
	 *
	 * @param pName    the p name
	 * @param pBoxLife the p box life
	 */
	public BoxJoker(String pName, String pBoxLife) {
		super(pName);
		this.boxLife = pBoxLife;
	}

	/**
	 * Gets box life.
	 *
	 * @return the box life
	 */
	public String getBoxLife() {
		return boxLife;
	}

	/**
	 * Sets box life.
	 *
	 * @param boxLife the box life
	 */
	public void setBoxLife(String boxLife) {
		this.boxLife = boxLife;
	}

	public String toString() {
		return super.toString() + "Ton nombres de HP est augmente de " + getBoxLife();
	}

}
