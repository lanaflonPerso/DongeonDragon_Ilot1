package packageGameInit.packageAllList;

import packageEvent.packageBox.*;
import packageItems.packageDefenseTools.Filters;
import packageItems.packageDefenseTools.Shields;
import packageEvent.packageEnemies.Dragon;
import packageEvent.packageEnemies.Succube;
import packageEvent.packageEnemies.Wizzard;
import packageEvent.Event;
import packageItems.packageWeaponsOffense.Bow;
import packageItems.packageWeaponsOffense.Invisibility;
import packageItems.packageWeaponsOffense.Lightning;
import packageItems.packageWeaponsOffense.Mace;

import java.util.ArrayList;

public class ListEvent {
    public static ArrayList<Event> listEvent() {
        ArrayList<Event> listEvent = new ArrayList<Event>();
        listEvent.add(new Wizzard("sorcier novice", "image", "40", "15"));
        listEvent.add(new Wizzard("sorcier apprenti", "image", "60", "25"));
        listEvent.add(new Wizzard("sorcier expert", "image", "80", "50"));
        listEvent.add(new Wizzard("sorcier maitre", "image", "120", "75"));
        listEvent.add(new Succube("succube attirante", "image", "40", "15"));
        listEvent.add(new Succube("succube fascinante", "image", "60", "25"));
        listEvent.add(new Succube("succube seduisante", "image", "80", "50"));
        listEvent.add(new Succube("succube maitresse", "image", "120", "75"));
        listEvent.add(new Dragon("Dragon Brun", "image", "90", "15"));
        listEvent.add(new Dragon("Dragon de sang", "image", "140", "20"));
        listEvent.add(new Dragon("Dragon de glace", "image", "180", "30"));
        listEvent.add(new Dragon("Dragon ancestral", "image", "225", "40"));
        listEvent.add(new Dragon("Dragon millénaire", "image", "300", "60"));
        listEvent.add(new Dragon("Dragon aptère", "image", "350", "80"));
        listEvent.add(new BoxMalus("Box", "-5"));
        listEvent.add(new BoxMalus("Box", "-5"));
        listEvent.add(new BoxBonus("Box", "+5"));
        listEvent.add(new BoxJoker("Box", "25"));
        listEvent.add(new BoxJoker("Box", "50"));
        listEvent.add(new BoxItemDefenseTools("Box", new Shields("", "2")));
        listEvent.add(new BoxItemDefenseTools("Box", new Shields("", "3")));
        listEvent.add(new BoxItemDefenseTools("Box", new Shields("", "8")));
        listEvent.add(new BoxItemDefenseTools("Box", new Filters("", "2")));
        listEvent.add(new BoxItemDefenseTools("Box", new Filters("", "3")));
        listEvent.add(new BoxItemDefenseTools("Box", new Filters("", "5")));
        listEvent.add(new BoxItemOffense("Box", new Invisibility("", "30")));
        listEvent.add(new BoxItemOffense("Box", new Lightning("", "50", "25")));
        listEvent.add(new BoxItemOffense("Box", new Mace("", "30")));
        listEvent.add(new BoxItemOffense("Box", new Bow("", "50", "25")));

        return listEvent;
    }
}
