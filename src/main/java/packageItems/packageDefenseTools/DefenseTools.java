package packageItems.packageDefenseTools;

import packageItems.Items;

public abstract class DefenseTools extends Items {
    public String name;

    public DefenseTools(String pName) {
        this.name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String str = " - Nom de l'equipement deffensif : " + name;

        return str;
    }
}
