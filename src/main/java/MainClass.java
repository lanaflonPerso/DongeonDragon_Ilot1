import packageGameStart.*;

import packageGameInit.*;

public class MainClass {
    public static void main(String[] args) {

        GameStart gameStart = new GameStart();
        GameBoard gameBoard = new GameBoard();
        gameStart.InGame(gameBoard.gameInit());

   	 	 }
    }







