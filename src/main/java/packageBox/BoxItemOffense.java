package packageBox;

import packageWeaponsOffense.WeaponsOffense;

public class BoxItemOffense extends Box {

	WeaponsOffense itemOffense;

	public BoxItemOffense(String pName, WeaponsOffense pItemOffense) {
		super(pName);
		this.itemOffense = pItemOffense;
	}

	public WeaponsOffense getItemOffense() {
		return itemOffense;
	}

	public void setItemOffense(WeaponsOffense itemOffense) {
		this.itemOffense = itemOffense;
	}

	public String toString() {
		return super.toString() + "Nom :" + getItemOffense();
	}
	
}
