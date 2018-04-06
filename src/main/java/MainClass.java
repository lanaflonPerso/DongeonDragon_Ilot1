import WeaponsOffense.*;
import packageCharacters.*;
import packageDefenseTools.*;
import packageEnemies.*;
import packageMenuIntroduction.MenuIntroduction;
import packageInGame.LanceDeDe;
import packagePlayersNames.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import packageDefenseTools.Filters;
import packageDefenseTools.Shields;



public class MainClass {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Dragon dragon = null;
        Wizzard wizzard = null;
        Succube succube = null;

        ArrayList<WeaponsOffense> weaponsOffenseList = new ArrayList<WeaponsOffense>();
        ArrayList<CharactersEnemies> charactersEnemies = new ArrayList();
        ArrayList<CharactersPlayer> charactersWarriorList = new ArrayList<CharactersPlayer>();
        ArrayList<CharactersPlayer> charactersMagicianList = new ArrayList<CharactersPlayer>();
        ArrayList<PlayersName> playersNameArrayList= new ArrayList<PlayersName>();
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

                playersNameArrayList.add(new PlayersName(playeOneName));

                System.out.println("<----------------------->");
//                System.out.println(playeOneName);
                displayList( playersNameArrayList);
                System.out.println("<----------------------->");
                boolean choixDePerso = true;
                while (choixDePerso) {
                    System.out.println("Que voulez vous être :\n\t1-Guerrier\n\t2-Magicien :  ");
                    String choixPerso = sc.nextLine();
                    if (choixPerso.equals("1")) {



                    } else if (choixPerso.equals("2")) {




                    } else {
                        System.out.println("<----------------------------------------->");
                        System.out.println("Deux choix possible : 1-Guerrier 2-Magicien");
                        System.out.println("<----------------------------------------->");
                    }
                }

                boolean lanceDe = true;
                while (lanceDe) {
                    System.out.println("Que voulez vous faire :\n\t1-Commencer une Partie\n\t2-Sortir\n\t3-Quitter le jeu");
                    String choixDeSix = sc.nextLine();
                    if (choixDeSix.equals("1")) {
                        LanceDeDe.plateauDeJeu();
                    } else if (choixDeSix.equals("2")) {
                        lanceDe = false;
                    } else if (choixDeSix.equals("3")) {
                        lanceDe = false;
                        restInGame = false;
                    } else {
                        System.out.println("<---------------------------------->");
                        System.out.println("3 choix seulement : 1,2 ou,3");
                        System.out.println("<---------------------------------->");
                    }
                }

            } else if (startGame.equals("2")) {
                restInGame = false;
            } else {
                System.out.println("<---------------------------------->");
                System.out.println("2 choix seulement : 1 ou 2");
                System.out.println("<---------------------------------->");
            }
        }

        
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
      
    }

    ///////////////////////////////////////_________________Méthode_______________//////////////////////////////

    public static void displayList(ArrayList<? extends Object> listElements) {
        listElements.forEach(l -> System.out.println(l.toString()));
    }


    }





