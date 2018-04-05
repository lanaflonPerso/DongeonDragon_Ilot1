import WeaponsOffense.Fate;
import WeaponsOffense.Weapons;
import packageCharacters.CharactersPlayer;
import packageDefenseTools.DefenseTools;
import packageEnemies.CharactersEnemies;
import packageCharacters.Magician;
import packageCharacters.Warrior;
import packageEnemies.Dragon;
import packageEnemies.Succube;
import packageEnemies.Wizzard;
import packageMenuIntroduction.MenuIntroduction;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import packageDefenseTools.Filters;
import packageDefenseTools.Shields;


public class MainClass {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Dragon dragon = null;
        Wizzard wizzard = null;
        Succube succube = null;
        Weapons weapons = null;
        Fate fate = null;

        ArrayList<CharactersEnemies> charactersEnemies = new ArrayList();
        ArrayList<CharactersPlayer> charactersPlayersList = new ArrayList<CharactersPlayer>();
        ArrayList<Weapons> weaponsList = new ArrayList<Weapons>();
        ArrayList<Fate> fateList = new ArrayList<Fate>();
        ArrayList<DefenseTools> defenseToolsList = new ArrayList<DefenseTools>();
        ArrayList<Dragon> dragonsList = new ArrayList<Dragon>();
        ArrayList<Succube> succubesList = new ArrayList<Succube>();
        ArrayList<Wizzard> wizzardsList = new ArrayList<Wizzard>();

        boolean restInGame = true;
        while (restInGame) {
            System.out.println(MenuIntroduction.getDessinMenu());
            System.out.println("Que voulez vous faire :\n\t1-Jouer\n\t2-Quitter");
            String startGame = sc.nextLine();
            if (startGame.equals("1")) {
                System.out.println("Nom du Player One");
                String playeOneName = sc.nextLine();
                System.out.println("<----------------------->");
                System.out.println(playeOneName);
                System.out.println("<----------------------->");
                boolean lanceDe = true;

                while (lanceDe) {
                    System.out.println("Que voulez vous faire :\n\t1-Commencer une Partie\n\t2-Sortir\n\t3-Quitter le jeu");
                    String choixDeSix = sc.nextLine();
                    if (choixDeSix.equals("1")) {
//                        deSix();
                        plateauDeJeu();

                    } else if (choixDeSix.equals("2")) {
                        lanceDe = false;

                    } else if (choixDeSix.equals("3")) {
                        lanceDe = false;
                        restInGame = false;
                    } else {
                        System.out.println("3 choix seulement : 1,2 ou,3");
                    }
                }

            } else if (startGame.equals("2")) {
                restInGame = false;
            } else {
                System.out.println("2 choix seulement : 1 ou 2");
            }
        }

        fateList.add(new Fate("Eclair", "50", "25", "0"));
        fateList.add(new Fate("Invisibilite", "30", "30", "30"));
        fateList.add(new Fate("Mur de feu", "25", "25", "25"));

        weaponsList.add(new Weapons("Arc", "50", "25", "0"));
        weaponsList.add(new Weapons("Massue", "0", "0", "30"));
        weaponsList.add(new Weapons("Epee", "0", "0", "25"));

        dragonsList.add(new Dragon("Dragon Brun", "image", "90", "15"));
        dragonsList.add(new Dragon("Dragon de sang", "image", "140", "20"));
        dragonsList.add(new Dragon("Dragon de glace", "image", "180", "30"));
        dragonsList.add(new Dragon("Dragon ancestral", "image", "225", "40"));
        dragonsList.add(new Dragon("Dragon millénaire", "image", "300", "60"));
        dragonsList.add(new Dragon("Dragon aptère", "image", "350", "80"));

        wizzardsList.add(new Wizzard("sorcier novice", "image", "40", "15"));
        wizzardsList.add(new Wizzard("sorcier apprenti", "image", "60", "25"));
        wizzardsList.add(new Wizzard("sorcier expert", "image", "80", "50"));
        wizzardsList.add(new Wizzard("sorcier maitre", "image", "120", "75"));

        succubesList.add(new Succube("succube attirante", "image", "40", "15"));
        succubesList.add(new Succube("succube fascinante", "image", "60", "25"));
        succubesList.add(new Succube("succube seduisante", "image", "80", "50"));
        succubesList.add(new Succube("succube maitresse", "image", "120", "75"));

        displayList(succubesList);
        displayList(dragonsList);
    }

    ///////////////////////////////////////_________________Méthode_______________//////////////////////////////
    
    public static void displayList(ArrayList <? extends Object > listElements){
    	listElements.forEach(l -> System.out.println(l.toString()));
    }


    public static int deSix() {
        Random deSix = new Random();
       int resultatDeSix= deSix.nextInt(6) + 1;
        System.out.println("Résultat de votre Lancé : " + resultatDeSix );
        return resultatDeSix;

    }

    private static void  plateauDeJeu(){

       boolean bouDuChemin= true;
        int plateau=0;
       int result;
      while(bouDuChemin) {
        if (plateau < 64){
            System.out.println("Lancé le Dé en Appuyant sur entée");
            String lanceDe = sc.nextLine();
            plateau += deSix();
            System.out.println("Votre position sur le plateau :" + plateau);
//        }else if(plateau>64){
//            System.out.println("Vous étes au bout du chemin");
//            bouDuChemin=false;
      }else {
            System.out.println("Vous étes au bout du chemin");
            bouDuChemin=false;

        }
    }
    }
}



