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


    public  void InGame() {

        boolean restInGame = true;
        while (restInGame) {
            sc = new Scanner(System.in);
             AllList allList = new AllList();
             ChoixPerso choixPersonnel = new ChoixPerso();
             LanceDeDe dede = new LanceDeDe();
        System.out.println(MenuIntroduction.getDessinMenu());
        System.out.println("Que voulez vous faire :\n\t1-Jouer\n\t2-Quitter");
        String startGame = sc.nextLine();
        if (startGame.equals("1")) {
            System.out.println("Nom du Player One");
            String playeOneName = sc.nextLine();
            allList.playerNameList(playeOneName);

            System.out.println("<----------------------->");


            allList.displayArrayList((allList.playerNameList(playeOneName)));
            allList.displayArrayList(allList.dragonList());
            allList.displayArrayList(allList.succubeList());
            allList.displayArrayList(allList.wizzardList());
            allList.displayArrayList(allList.shieldList());
            allList.displayArrayList(allList.filterList());
            allList.displayArrayList(allList.listEvent());

            System.out.println("<----------------------->");
            boolean choixDePerso = true;
            while (choixDePerso) {
                System.out.println("Que voulez vous être :\n\t1-Guerrier\n\t2-Magicien :  ");
                String choixPerso = sc.nextLine();
                if (choixPerso.equals("1")) {
                    // Factory.getInstanceGuerrier();
                    System.out.println("vous etes un Guerrier");
                    choixDePerso = false;

                } else if (choixPerso.equals("2")) {
                    System.out.println("vous etes un Magicien");
                    choixDePerso = false;
                } else {
                    System.out.println("<----------------------------------------->");
                    System.out.println("Deux choix possible : 1-Guerrier 2-Magicien");
                    System.out.println("<----------------------------------------->");
                }
            }


                System.out.println("<----------------------->");
                
               choixPersonnel.choixPersonnage();


                boolean lanceDe = true;

                while (lanceDe) {
                    System.out.println("Que voulez vous faire :\n\t1-Commencer une Partie\n\t2-Sortir\n\t3-Quitter le jeu");
                    String choixDeSix = sc.nextLine();
                    if (choixDeSix.equals("1")) {
                        dede.plateauDeJeu();
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



