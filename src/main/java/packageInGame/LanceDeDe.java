package packageInGame;

import java.util.Random;

import packageKeyBoard.*;

public class LanceDeDe {
    //private static Scanner sc = new Scanner(System.in);
    private int positionPerso = 0;
    private int lastPosition = 0;
    private boolean finishBoard = true;

    
    public  int deSix() {
    	
        Random deSix = new Random();
        int resultatDeSix = deSix.nextInt(6) + 1;
        System.out.println("Résultat de votre Lancé : " + resultatDeSix);
        return resultatDeSix;
    }

    public int getNewBoardPositionPlayer() {

    if (positionPerso < 64) {
        System.out.println("<---------------------------------->");
        System.out.println("Lancé le Dé en Appuyant sur entée");
        System.out.println("<---------------------------------->");
        //sc.nextLine();
        KeyBoard.INPUT.nextLine();
        System.out.println("<---------------------------------->");
        lastPosition = deSix();
        positionPerso += lastPosition;
        System.out.println("Votre position sur le positionPerso est : " + positionPerso + " <= 63 :");
        return positionPerso;
    }
    else
    	return -1;
        
    }
    
    public int finishBoard() {
            positionPerso -= lastPosition;
            System.out.println("<---------------------------------->");
            System.out.println("<---------Décrémentation----------->");
            System.out.println("<---------------------------------->");

            //sc.nextLine();
            KeyBoard.INPUT.nextLine();
            lastPosition = deSix();
            positionPerso += lastPosition;

            System.out.println("<-------------Lancer de Dé = " + lastPosition + "--------------------->");
            if (positionPerso > 64) {
                System.out.println("if(" + positionPerso + " > 64 )");
                finishBoard = true;
                return positionPerso;
            }
            else {
                finishBoard = false;
                System.out.println("Valeur du positionPerso final : " + positionPerso);
                return -1;
            }
        
    }
}

