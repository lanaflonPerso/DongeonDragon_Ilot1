import packageGameStart.*;

import packageGameInit.*;
import packageJDBC.*;

public class MainClass {
    public static void main(String[] args) {

    	JDBC.jdbc("jdbc:mysql://localhost:3306/", "", "");
        GameStart gameStart = new GameStart();
        GameBoard gameBoard = new GameBoard();
        gameStart.InGame(gameBoard.gameInit());
    }
}







