package packageAllList;

import WeaponsOffense.*;
import packageCharacters.*;
import packageDefenseTools.*;
import packageEnemies.*;
import packagePlayersNames.*;

import java.util.ArrayList;


public class AllList {

    public static void displayList(ArrayList<? extends Object> listElements) {

        listElements.forEach(l -> System.out.println(l.toString()));

    }

    ArrayList<WeaponsOffense> weaponsOffenseList = new ArrayList<WeaponsOffense>();
    ArrayList<DefenseTools> defenseToolsList = new ArrayList<DefenseTools>();
    ArrayList<CharactersEnemies> charactersEnemies = new ArrayList();
    ArrayList<CharactersPlayer> charactersWarriorList = new ArrayList<CharactersPlayer>();
    ArrayList<CharactersPlayer> charactersMagicianList = new ArrayList<CharactersPlayer>();

    public static ArrayList<PlayersName> playerNameList(String namePlay) {
        ArrayList<PlayersName> playersNameArrayList = new ArrayList<PlayersName>();
        playersNameArrayList.add(new PlayersName(namePlay));
        return playersNameArrayList;
    }

    public static ArrayList<Dragon> dragonList() {
        ArrayList<Dragon> dragonsList = new ArrayList<Dragon>();
        dragonsList.add(new Dragon("Dragon Brun", "image", "90", "15"));
        dragonsList.add(new Dragon("Dragon de sang", "image", "140", "20"));
        dragonsList.add(new Dragon("Dragon de glace", "image", "180", "30"));
        dragonsList.add(new Dragon("Dragon ancestral", "image", "225", "40"));
        dragonsList.add(new Dragon("Dragon millénaire", "image", "300", "60"));
        dragonsList.add(new Dragon("Dragon aptère", "image", "350", "80"));

        return dragonsList;
    }

    public static ArrayList<Succube> succubeList() {

        ArrayList<Succube> succubesList = new ArrayList<Succube>();
        succubesList.add(new Succube("succube attirante", "image", "40", "15"));
        succubesList.add(new Succube("succube fascinante", "image", "60", "25"));
        succubesList.add(new Succube("succube seduisante", "image", "80", "50"));
        succubesList.add(new Succube("succube maitresse", "image", "120", "75"));
        return succubesList;
    }

    public static ArrayList<Wizzard> wizzardList() {
        ArrayList<Wizzard> wizzardsList = new ArrayList<Wizzard>();
        wizzardsList.add(new Wizzard("sorcier novice", "image", "40", "15"));
        wizzardsList.add(new Wizzard("sorcier apprenti", "image", "60", "25"));
        wizzardsList.add(new Wizzard("sorcier expert", "image", "80", "50"));
        wizzardsList.add(new Wizzard("sorcier maitre", "image", "120", "75"));
        return wizzardsList;
    }

    public static ArrayList<Shields> shieldList() {
        ArrayList<Shields> shieldsList = new ArrayList<Shields>();
        shieldsList.add(new Shields("Orion", "5"));
        shieldsList.add(new Shields("Oignion", "3"));
        shieldsList.add(new Shields("Ecu", "2"));
        return shieldsList;
    }

    public static ArrayList<Filters> filterList() {
        ArrayList<Filters> filtersList = new ArrayList<Filters>();
        filtersList.add(new Filters("Love", "5"));
        filtersList.add(new Filters("Persuasion", "3"));
        filtersList.add(new Filters("Protection", "2"));
        return filtersList;

    }

    public static ArrayList<WeaponsOffense> sortList() {
        ArrayList<WeaponsOffense> sortsList = new ArrayList<WeaponsOffense>();
        sortsList.add(new Bow("Bow", "50", "80"));
        sortsList.add(new Lightning("Lightning", "80", "50"));
        return sortsList;
    }

    public static ArrayList<WeaponsOffense> armeList() {
        ArrayList<WeaponsOffense> armesList = new ArrayList<WeaponsOffense>();
        armesList.add(new Sword("Excaliburne", "65"));
        armesList.add(new Mace("KiKogne", "55"));
        return armesList;
    }

}
