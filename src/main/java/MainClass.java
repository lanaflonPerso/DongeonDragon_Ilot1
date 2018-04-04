import msgPourris.Msg;
import packageCharacters.CharactersPlayer;
import packageDefenseTools.DefenseTools;
import packageEnemies.CharactersEnemies;
import packageEnemies.Dragon;
import packageEnemies.Succube;
import WeaponsOffense.Weapons;
import WeaponsOffense.Fate;
import packageEnemies.Wizzard;


import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        Dragon dragon = null;
        Wizzard wizzard = null;
        Succube succube = null; 
        Weapons weapons = null;
        Fate fate = null;

        ArrayList<CharactersPlayer> charactersPlayersList = new ArrayList<CharactersPlayer>();
        ArrayList<Weapons> weaponsList = new ArrayList<Weapons>();
        ArrayList<Fate> fateList = new ArrayList<Fate>();
        ArrayList<DefenseTools> defenseToolsList = new ArrayList<DefenseTools>();
        ArrayList<Dragon> dragonsList = new ArrayList<Dragon>();
        ArrayList<Succube> succubesList = new ArrayList<Succube>();
        ArrayList<Wizzard> wizzardsList = new ArrayList<Wizzard>();

        System.out.println(Msg.getMyMsgPourri());

        fateList.add(new Fate("Eclair", 50, 25, 0));
        fateList.add(new Fate("Invisibilite", 30, 30, 30));
        fateList.add(new Fate("Mur de feu", 25, 25, 25));
 
        weaponsList.add(new Weapons("Arc", 50, 25, 0));
        weaponsList.add(new Weapons("Massue", 0, 0, 30));
        weaponsList.add(new Weapons("Epee", 0, 0, 25));
        
        dragonsList.add(new Dragon("Dragon Brun", "image", "90", "15"));
        dragonsList.add(new Dragon("Dragon de sang", "image", "140", "20"));
        dragonsList.add(new Dragon("Dragon de glace", "image", "180", "30"));
        dragonsList.add(new Dragon("Dragon ancestral", "image", "225", "40"));
        dragonsList.add(new Dragon("Dragon millénaire", "image", "300", "60"));
        dragonsList.add(new Dragon("Dragon aptère", "image", "350", "80"));

        wizzardsList.add(new Wizzard("sorcier novice","image","40","15"));
        wizzardsList.add(new Wizzard("sorcier apprenti","image","60","25"));
        wizzardsList.add(new Wizzard("sorcier expert","image","80","50"));
        wizzardsList.add(new Wizzard("sorcier maitre","image","120","75"));

        succubesList.add(new Succube("succube attirante","image","40","15"));
        succubesList.add(new Succube("succube fascinante","image","60","25"));
        succubesList.add(new Succube("succube seduisante","image","80","50"));
        succubesList.add(new Succube("succube maitresse","image","120","75"));

        
        displayDragonsList(dragonsList);
        displayWizzardList(wizzardsList);
        displaySuccubeList(succubesList);
        displayWeaponsList(weaponsList);
        displayFateList(fateList);

    }

    

    public static void displayDragonsList(ArrayList<Dragon> dragon) {
        for (Dragon d : dragon) {
            System.out.println(d.toString());
        }
    }

    public static void displayWizzardList(ArrayList<Wizzard> wizzard) {
        for (Wizzard w : wizzard) {
            System.out.println(w.toString());
        }
    }

    public static void displaySuccubeList(ArrayList<Succube> succube) {
        for (Succube s : succube) {
            System.out.println(s.toString());
        }
    }
    
    public static void displayWeaponsList(ArrayList<Weapons> weapons) {
    	for(Weapons w : weapons) {
    		System.out.println(w.toString());
    	}
    }
    	
    public static void displayFateList(ArrayList<Fate> fate) {
    	for(Fate f : fate) {
    		System.out.println(f.toString());
    	}
    }
}
