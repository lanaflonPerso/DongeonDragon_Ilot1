package packageEvent.packageBox;

import packageItems.packageDefenseTools.DefenseTools;

public class BoxItemDefenseTools extends Box {

    DefenseTools itemDefense;

    public BoxItemDefenseTools(String pName, DefenseTools pItemDefense) {
        super(pName);
        this.itemDefense = pItemDefense;
    }

    public DefenseTools getItemDefense() {
        return itemDefense;
    }

    public void setItemDefense(DefenseTools itemDefense) {
        this.itemDefense = itemDefense;
    }

    public String toString() {
        return super.toString() + "Nom : " + getItemDefense();
    }

    @Override
    public void interactWithUser() {

        System.out.println("Une box défense sa mèèèère ! " + getItemDefense() + " chopé à la case " + getPositionPlateau() + "\n");

    }

}
