package packageGameInit;

import packageEvent.Event;


public class GameBoard {
	
	public Event[] gameInit() {
		GameInit gameInit=new GameInit();
		Event[] boardGame =gameInit.gameBoardInit();

		return  boardGame;
	}

}

/// prochaine étape, les interfaces.
//uneInterface monObjet = new UneClasse();
//monObjet.methode1();
//monObjet = new UneAutreClasse();
//monObjet.methode1();
//monObjet.methode2();

