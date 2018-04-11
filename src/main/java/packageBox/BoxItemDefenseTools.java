package packageBox;

import packageDefenseTools.DefenseTools;

/**
 * The type Box item defense tools.
 */
public class BoxItemDefenseTools extends Box {

    /**
     * The Item defense.
     */
    DefenseTools itemDefense;

    /**
     * Instantiates a new Box item defense tools.
     *
     * @param pName        the p name
     * @param pItemDefense the p item defense
     */
    public BoxItemDefenseTools(String pName, DefenseTools pItemDefense) {
        super(pName);
        this.itemDefense = pItemDefense;
    }

    /**
     * Gets item defense.
     *
     * @return the item defense
     */
    public DefenseTools getItemDefense() {
        return itemDefense;
    }

    /**
     * Sets item defense.
     *
     * @param itemDefense the item defense
     */
    public void setItemDefense(DefenseTools itemDefense) {
        this.itemDefense = itemDefense;
    }

    public String toString() {
        return super.toString() + "Nom : " + getItemDefense();
    }


//    @Override
//    public void interactWithBox(){
//        perso.sqetItemDefensetOOLLS5
//    }
}
