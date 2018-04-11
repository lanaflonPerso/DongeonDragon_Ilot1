package packageGameStart;

import packageAllList.*;
import packageEnemies.*;

import packageInGame.LanceDeDe;
import packageMenuIntroduction.MenuIntroduction;
import packageChoixPerso.ChoixPerso;
import java.util.Scanner;


public class GameStart {

    private static Scanner sc;
    Dragon dragon = null;
    Wizzard wizzard = null;
    Succube succube = null;


    public static void InGame() {

        boolean restInGame = true;
        while (restInGame) {
            sc = new Scanner(System.in);

        System.out.println(MenuIntroduction.getDessinMenu());
        System.out.println("Que voulez vous faire :\n\t1-Jouer\n\t2-Quitter");
        String startGame = sc.nextLine();
        
        if (startGame.equals("1")) {
            System.out.println("Nom du Player One");
            String playeOneName = sc.nextLine();
            AllList.playerNameList(playeOneName);

            System.out.println("<----------------------->");

            AllList.displayArrayList((AllList.playerNameList(playeOneName)));
            AllList.displayArrayList(AllList.dragonList());
            AllList.displayArrayList(AllList.succubeList());
            AllList.displayArrayList(AllList.wizzardList());
            AllList.displayArrayList(AllList.shieldList());
            AllList.displayArrayList(AllList.filterList());
            AllList.displayArrayList(AllList.listEvent());

            System.out.println("<----------------------->");
            boolean choixDePerso = true;

           ChoixPerso.choixPersonnage();


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
    }

    }



