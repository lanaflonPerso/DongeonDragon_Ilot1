import packageGameInit.GameBoard;
import packageGameStart.*;
import packageInGame.*;
import packageEvent.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {
    public static void main(String[] args) {

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
        	while (finishBoard != -1 && finishBoard != 64) {
    	      	finishBoard=lanceDeDe.finishBoard();
    	   	}
         }

    }
}






