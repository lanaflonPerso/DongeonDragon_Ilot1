package packageDefenseTools;

/**
 * The type Defense tools.
 */
public abstract class DefenseTools {
    /**
     * The Name.
     */
    public String name;

    /**
     * Instantiates a new Defense tools.
     *
     * @param pName the p name
     */
    public DefenseTools(String pName) {
        this.name = pName;
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
        String str = " - Nom de l'equipement deffensif : " + name;

        return str;
    }
}
