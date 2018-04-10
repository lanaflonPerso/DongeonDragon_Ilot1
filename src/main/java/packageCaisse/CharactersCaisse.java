package packageCaisse;

public abstract class CharactersCaisse {

    private String name;

    public CharactersCaisse(String pName) {
        this.name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Nom de la caisse surprise : " + getName();
    }

}
