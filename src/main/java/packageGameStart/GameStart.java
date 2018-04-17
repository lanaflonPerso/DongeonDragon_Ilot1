package packageGameStart;

import packageGameInit.GameBoard;
import packageGameInit.packageAllList.*;
import packageEvent.Event;
import packageEvent.packageEnemies.*;
import packageInGame.LanceDeDe;
import packageInGame.ChoixPerso;
import packageKeyBoard.*;


public class GameStart {

    Dragon dragon = null;
    Wizzard wizzard = null;
    Succube succube = null;

    public void InGame() {

        boolean restInGame = true;

        while (restInGame) {
            
            PlayerNameList playerNameList = new PlayerNameList();
            ChoixPerso choixPersonnel = new ChoixPerso();
            LanceDeDe dede = new LanceDeDe();
            ListEvent  listEvent = new ListEvent();

            System.out.println(MenuIntroduction.getDessinMenu());
            System.out.println("Que voulez vous faire :\n\t1-Jouer\n\t2-Quitter");
            String startGame = KeyBoard.INPUT.nextLine();
            if (startGame.equals("1")) {
                System.out.println("Nom du Player One");
                String playeOneName = KeyBoard.INPUT.nextLine();
                
                playerNameList.playerNameList(playeOneName);

                choixPersonnel.choixPersonnage();

                boolean lanceDe = true;

                while (lanceDe) {
                    System.out.println("Que voulez vous faire :\n\t1-Commencer une Partie\n\t2-Sortir\n\t3-Quitter le jeu");
                    String choixDeSix = KeyBoard.INPUT.nextLine();

                    if (choixDeSix.equals("1")) {
                    	moveGamer();
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

    public void moveGamer() {
	    Event[] boardEvent = null;
		int moveBoard = 0;
		int finishBoard = 0;
	    GameBoard gameBoard = new GameBoard();
	    boardEvent = gameBoard.gameInit();
	    LanceDeDe lanceDeDe = new LanceDeDe();
	    
	    try {
	        while (moveBoard != -1) {
	        	moveBoard=lanceDeDe.getNewBoardPositionPlayer();
	    		System.out.println(boardEvent[moveBoard]);
	        }
	    }catch(ArrayIndexOutOfBoundsException e) {
	    	if(moveBoard > 63)
	    		System.out.println("Vous avez fini");
		 }
	     }
    }
    




