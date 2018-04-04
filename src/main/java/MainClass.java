



import packageMenuIntroduction.MenuIntroduction;
import packageEnemies.CharactersEnemies;
import packageCharacters.CharactersPlayer;
import packageDefenseTools.DefenseTools;
import packageEnemies.Dragon;
import packageEnemies.Succube;
import packageWeapons.Weapons;
import packageEnemies.Wizzard;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class MainClass {

    private static Scanner sc;


    public static void main(String[] args) {

        sc = new Scanner(System.in);

        Dragon dragon = null;
        Wizzard wizzard = null;
        Succube succube = null;
        Weapons weapons = null;

        ArrayList<CharactersEnemies> charactersEnemies = new ArrayList();
        ArrayList<CharactersPlayer> charactersPlayersList = new ArrayList<CharactersPlayer>();
        ArrayList<Weapons> weaponsList = new ArrayList<Weapons>();
        ArrayList<DefenseTools> defenseToolsList = new ArrayList<DefenseTools>();
        ArrayList<Dragon> dragonsList = new ArrayList<Dragon>();
        ArrayList<Succube> succubesList = new ArrayList<Succube>();
        ArrayList<Wizzard> wizzardsList = new ArrayList<Wizzard>();



        boolean restInGame = true;
        while (restInGame) {
            System.out.println(MenuIntroduction.getDessinMenu());
            System.out.println("_________________________________________________________________________________________________\n" + "|                                                                                               |\n" + "|                                                                                               |\n" + "| ,--.                                                 |    ,--.                                |\n" + "| |   |,---.,---.,---.,---.,---.,---.    ,---.,---.,---|    |   |,---.,---.,---.,---.,---.,---. |\n" + "| |   ||   ||   ||   ||---'|   ||   |    ,---||   ||   |    |   ||    ,---||   ||   ||   |`---. |\n" + "| `--' `---'`   '`---|`---'`---'`   '    `---^`   '`---'    `--' `    `---^`---|`---'`   '`---' |\n" + "|               `---'                                                     `---'                 |\n" + "|                                                                                               |\n" + "|                                                                                               |\n" + "|  /'                                                                                           |\n" + "|  ||                                                                                           |\n" + "|  ||      ** *                                                                                 |\n" + "|  ||      __X_                                                                                 |\n" + "|  ||     ( ___\\                        .     _///_,                                            |\n" + "|  ||     |:  \\\\                      .      / ` ' '>                                           |\n" + "| ><><  ___)..:/_#__,                   )   o'  __/_'>                                          |\n" + "| (X|) (|+(____)+\\ _)                  (   /  _/  )_\\'>                                         |\n" + "|  o|_\\/>> + + + << \\                   ' \"__/   /_/\\_>                                         |\n" + "|     |:\\/|+ + + +| \\_\\<                   ____/_/_/_/                                          |\n" + "|     \\./  XXXXXX.  (o_)_                 /,---, _/ /                                           |\n" + "|        /+ + + |   \\:|                  \"\"  /_/_/_/                                            |\n" + "|       /+ +/+ +|  -/->>>----.              /_(_(_(_                 \\                          |\n" + "|      /+ +|+ /XX /   _--,  _ \\            (   \\_\\_\\\\_               )\\                         |\n" + "|    \\+ + + /  |X   (,\\- \\/_ ,              \\'__\\_\\_\\_\\__            ).\\                        |\n" + "|     /\\+ + /\\  |X \\    /,//_/              //____|___\\__)           )_/                        |\n" + "|    +_+_+_( )o_)X  \\  (( ///               |  _  \\'___'_(           /'                         |\n" + "|     (_o(  /__/ X   \\  \\\\//                \\_ (-'\\'___'_\\      __,'_'                          |\n" + "|      \\_|  |_/  X    \\ ///                 __) \\  \\\\___(_   __/.__,'                           |\n" + "|      \\_| >(_/        \\,/               ,((,-,__\\  '\", __\\_/. __,'                             |\n" + "| ,////__o\\ /__////,    V                           '\"./_._._-'                                 |\n" + "|_______________________________________________________________________________________________|");

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
                    System.out.println("Que voulez vous faire :\n\t1-Lancer le Dé\n\t2-Sortir\n\t3-Quitter le jeu");
                    String choixDeSix = sc.nextLine();
                    if (choixDeSix.equals("1")) {
                        deSix();
//                        restInGame = false;

                    } else if (choixDeSix.equals("2")) {
                        lanceDe = false;


                    }else if (choixDeSix.equals("3")) {
                        lanceDe = false;
                        restInGame = false;
                    }else
                     {
                        System.out.println("3 choix seulement : 1,2 ou,3");

                    }

                }


            } else if (startGame.equals("2")) {
                restInGame = false;
            } else {
                System.out.println("2 choix seulement : 1 ou 2");

            }


        }


//        System.out.println(MenuIntroduction.getDessinMenu());


        weaponsList.add(new Weapons("Arc", 50, 25, 0));
        weaponsList.add(new Weapons("Massue", 0, 0, 30));
        weaponsList.add(new Weapons("Epee", 0, 0, 25));

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



        displayDragonsList(dragonsList);
        displayWizzardList(wizzardsList);
        displaySuccubeList(succubesList);
        displayWeaponsList(weaponsList);

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
        for (Weapons w : weapons) {
            System.out.println(w.toString());
        }
    }
        ///////////////////////////////////////_________________Méthode_______________//////////////////////////////
        private static void deSix () {
            Random deSix = new Random();
            System.out.println("Résultat de votre Lancé : " + (deSix.nextInt(6) + 1));

        }
}



