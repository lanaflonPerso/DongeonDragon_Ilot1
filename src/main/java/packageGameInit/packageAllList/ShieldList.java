package packageGameInit.packageAllList;

import packageItems.packageDefenseTools.Shields;

import java.util.ArrayList;

public class ShieldList {
    public ArrayList<Shields> shieldList() {
        ArrayList<Shields> shieldsListBox = new ArrayList<Shields>();
        shieldsListBox.add(new Shields("Orion", "5"));
        shieldsListBox.add(new Shields("Oignion", "3"));
        shieldsListBox.add(new Shields("Ecu", "2"));
        return shieldsListBox;
    }
}
