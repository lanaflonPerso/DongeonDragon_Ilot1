package packageAllList;

import packageEnemies.Wizzard;

import java.util.ArrayList;

/**
 * The type Wizzard list.
 */
public class WizzardList {
    /**
     * Wizzard list array list.
     *
     * @return the array list
     */
    public ArrayList<Wizzard> wizzardList() {
        ArrayList<Wizzard> wizzardsList = new ArrayList<Wizzard>();
        wizzardsList.add(new Wizzard("sorcier novice", "image", "40", "15"));
        wizzardsList.add(new Wizzard("sorcier apprenti", "image", "60", "25"));
        wizzardsList.add(new Wizzard("sorcier expert", "image", "80", "50"));
        wizzardsList.add(new Wizzard("sorcier maitre", "image", "120", "75"));
        return wizzardsList;
    }
}
