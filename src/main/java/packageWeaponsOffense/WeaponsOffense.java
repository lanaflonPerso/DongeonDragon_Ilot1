package packageWeaponsOffense;

public abstract class WeaponsOffense {
    protected String name;

    public WeaponsOffense(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "\n- Nom de l'arme offensive : " + getName() + ".\n";
    }
}
