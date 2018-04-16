package packageInGame;

import java.util.Random;
import java.util.Scanner;

public class LanceDeDe {
    private static Scanner sc;


    public  int deSix() {

        Random deSix = new Random();
        int resultatDeSix = deSix.nextInt(6) + 1;
        System.out.println("Résultat de votre Lancé : " + resultatDeSix);
        return resultatDeSix;
    }

    public int getNewBoardPositionPlayer() {
        sc = new Scanner(System.in);
        LanceDeDe dede = new getNewBoardPositionPlayer();

        int positionPerso = 0;
        int lastPosition = 0;
        
        boolean moveBoard = true;
        boolean finishBoard = true;

        while (moveBoard) {
            if (positionPerso < 64) {
                System.out.println("<---------------------------------->");
                System.out.println("Lancé le Dé en Appuyant sur entée");
                System.out.println("<---------------------------------->");
                sc.nextLine();
                System.out.println("<---------------------------------->");
                lastPosition = dede.deSix();
                positionPerso += lastPosition;
                System.out.println("Votre position sur le positionPerso est : " + positionPerso + " <= 63 :");
            } else moveBoard = false;
        }

        while (finishBoard) {

            positionPerso -= lastPosition;
            System.out.println("<---------------------------------->");
            System.out.println("<---------Décrémentation----------->");
            System.out.println("<---------------------------------->");

            sc.nextLine();
            lastPosition = dede.deSix();
            positionPerso += lastPosition;

            System.out.println("<-------------Lancer de Dé = " + lastPosition + "--------------------->");
            if (positionPerso > 64) {
                System.out.println("if(" + positionPerso + " > 64 )");
                finishBoard = true;
            } else {
                finishBoard = false;
                System.out.println("Valeur du positionPerso final : " + positionPerso);
            }
        }
        return;
    }
}
