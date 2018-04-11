package packageWeaponsOffense;

/**
 * The type Weapons offense.
 */
public abstract class WeaponsOffense {
    /**
     * The Name.
     */
    protected String name;

    /**
     * Instantiates a new Weapons offense.
     *
     * @param pName the p name
     */
    public WeaponsOffense(String pName) {
        name = pName;
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
        return "\n- Nom de l'arme offensive : " + getName() + ".\n";
    }
}
