package packageInGame;

import java.util.Random;
import java.util.Scanner;

/**
 * The type Lance de de.
 */
public class LanceDeDe {
    private static Scanner sc;


    /**
     * De six int.
     *
     * @return the int
     */
    public  int deSix() {

        Random deSix = new Random();
        int resultatDeSix = deSix.nextInt(6) + 1;
        System.out.println("Résultat de votre Lancé : " + resultatDeSix);
        return resultatDeSix;
    }

    /**
     * Plateau de jeu.
     */
    public  void plateauDeJeu() {
        sc = new Scanner(System.in);
        LanceDeDe dede = new LanceDeDe();
        boolean bouDuChemin = true;
        int plateauJeu[] = new int[64];
        int plateau = 50;
        /*while (bouDuChemin) {
            try {
                if (plateauJeu[plateau] < 64) {
                    System.out.println("<---------------------------------->");
                    System.out.println("Lancé le Dé en Appuyant sur entée");
                    System.out.println("<---------------------------------->");
                    String lanceDe = sc.nextLine();
                    System.out.println("<---------------------------------->");
                    plateau += deSix();
                    System.out.println("Votre position sur le plateau :" + plateau);
                    plateauJeu[plateau] = plateau;

                } else {
                    System.out.println("<---------------------------------->");
                    System.out.println("Lancé le Dé en Appuyant sur entée");
                    System.out.println("<---------------------------------->");
                    String lanceDe = sc.nextLine();
                    System.out.println("<---------------------------------->");
                    plateau += deSix();
                    plateauJeu[plateau] = plateau;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("////////////////////////////////////////////////////////////////////////////" + "\n/////////////////////Vous étes au bout du chemin////////////////////////////" + "\n////////////////////////////////////////////////////////////////////////////");
                bouDuChemin = false;
            }
        }*/

        boolean loop = true;
        boolean loop1 = true;
        int test = 0;

        while (loop) {
            if (plateau < 64) {
                System.out.println("<---------------------------------->");
                System.out.println("Lancé le Dé en Appuyant sur entée");
                System.out.println("<---------------------------------->");
                sc.nextLine();
                System.out.println("<---------------------------------->");
                test = dede.deSix();
                plateau += test;
                System.out.println("Votre position sur le plateau est : " + plateau + " <= 63 :");
                //plateauJeu[plateau] = plateau;
            } else loop = false;
        }

        while (loop1) {

            plateau -= test;
            System.out.println("<---------------------------------->");
            System.out.println("<---------Décrémentation----------->");
            System.out.println("<---------------------------------->");

            sc.nextLine();
            test = dede.deSix();
            plateau += test;

            System.out.println("<-------------Lancer de Dé = " + test + "--------------------->");
            //plateauJeu[plateau] = plateau;
            if (plateau > 64) {
                System.out.println("if(" + plateau + " > 64 )");
                loop1 = true;
            } else {
                loop1 = false;
                System.out.println("Valeur du plateau final : " + plateau);
            }
        }

    }
}
