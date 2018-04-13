package packageGameInit.packageAllList;

import packageEvent.packageEnemies.Dragon;

import java.util.ArrayList;

public class DragonList {
    public ArrayList<Dragon> dragonList() {
        ArrayList<Dragon> dragonsList = new ArrayList<Dragon>();
        dragonsList.add(new Dragon("Dragon Brun", "image", "90", "15"));
        dragonsList.add(new Dragon("Dragon de sang", "image", "140", "20"));
        dragonsList.add(new Dragon("Dragon de glace", "image", "180", "30"));
        dragonsList.add(new Dragon("Dragon ancestral", "image", "225", "40"));
        dragonsList.add(new Dragon("Dragon millénaire", "image", "300", "60"));
        dragonsList.add(new Dragon("Dragon aptère", "image", "350", "80"));
        return dragonsList;
    }
}
