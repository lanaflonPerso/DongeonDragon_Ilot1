package packageInGame;

import java.util.Random;
import java.util.Scanner;

public class LanceDeDe {
    private static Scanner sc;


    public static int deSix() {
        Random deSix = new Random();
        int resultatDeSix = deSix.nextInt(6) + 1;
        System.out.println("Résultat de votre Lancé : " + resultatDeSix);
        return resultatDeSix;
    }

    public static void plateauDeJeu() {
        sc = new Scanner(System.in);
        boolean bouDuChemin = true;
        int plateauJeu[] = new int[64];
        int plateau = 50;
        while (bouDuChemin) {
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
        }
    }
}
