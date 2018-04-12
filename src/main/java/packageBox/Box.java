package packageBox;

/**
 * The type Box.
 */
public abstract class Box {


	private String name;

	/**
	 * Instantiates a new Box.
	 *
	 * @param pName the p name
	 */
	public Box(String pName) {
		this.name=pName;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) {

        this.name = name;
    }

    public String toString() {
        return "Nom de la caisse surprise : " + getName();
    }

//	public abstract void interactWithBox();
}
