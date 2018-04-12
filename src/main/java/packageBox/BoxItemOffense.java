package packageBox;

import packageWeaponsOffense.WeaponsOffense;

/**
 * The type Box item offense.
 */
public class BoxItemOffense extends Box {

	/**
	 * The Item offense.
	 */
	WeaponsOffense itemOffense;

	/**
	 * Instantiates a new Box item offense.
	 *
	 * @param pName        the p name
	 * @param pItemOffense the p item offense
	 */
	public BoxItemOffense(String pName, WeaponsOffense pItemOffense) {
		super(pName);
		this.itemOffense = pItemOffense;
	}

	/**
	 * Gets item offense.
	 *
	 * @return the item offense
	 */
	public WeaponsOffense getItemOffense() {
		return itemOffense;
	}

	/**
	 * Sets item offense.
	 *
	 * @param itemOffense the item offense
	 */
	public void setItemOffense(WeaponsOffense itemOffense) {
		this.itemOffense = itemOffense;
	}

	public String toString() {
		return super.toString() + "Nom :" + getItemOffense();
	}
	
}
