package packageAllList;

import packageDefenseTools.Shields;

import java.util.ArrayList;

/**
 * The type Shield list.
 */
public class ShieldList {
    /**
     * Shield list array list.
     *
     * @return the array list
     */
    public ArrayList<Shields> shieldList() {
        ArrayList<Shields> shieldsListBox = new ArrayList<Shields>();
        shieldsListBox.add(new Shields("Orion", "5"));
        shieldsListBox.add(new Shields("Oignion", "3"));
        shieldsListBox.add(new Shields("Ecu", "2"));
        return shieldsListBox;
    }
}
