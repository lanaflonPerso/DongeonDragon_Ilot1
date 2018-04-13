package packageGameInit;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Random;
//import packageAllList.AllList;
import packageAllList.ListEvent;
import packageBox.*;
import packageEnemies.*;
import packageEvent.Event;


public class GameBoard {
	
	public Event[] boardTest = new Event[29];  /* Instance d'un nouveau tableau d'objets qui sera initialisé
														à 64 case mémoires qui prendrons comme valeurs null par défaut. */
	public void gameBoardInit(){

		int boardLength = boardTest.length;
		ArrayList<Event> myList = ListEvent.listEvent(); /*  Instance d'une nouvelle ArrayList nommé myList

		qui prend pour valeur la liste des évènements.*/
		
		int count = 0; // Création d'une variable de type int qui a pour valeur zero.
		
		Random r = new Random(boardLength); // instance d'un nouveal objet nommer r en utilisant la méthode random.
		
		int boardPos; /* Attribution d'une d'une case mémoire 
		qui va acceuillire la valeur de la position aléatoire des évènements dans le plateau.*/
		
		 
		
		while( count < myList.size()) {	/* Boucle qui va implémenter aléatoirement les évènements sur le plateau
		et compter les nombres de tours effectués par la boucle.*/
			
			boardPos = r.nextInt(boardLength); // variable qui prend pour valeur un int aléatoire de 0 à 64
			
			if (boardTest[boardPos] == null) { // Si la position aléatoire à comme valeur null alors ..
				
				boardTest[boardPos] = myList.get(count); /* J'écrase la valeur null à la position boardPos du tableau 
										boardTest par l'objet de l'ArrayList myList à l'emplacement de valeur count. */
				
				count = count + 1; // la variable prend pour valeur la sienne plus un.
			}
		}
		
		// Affiche la valeur de count pour connaître les nombres de tours éffectués par la boucle while.
		System.out.println("nombre de tours de ma boucle : " + count);
		
		// Affiche la taille de la liste des évènements.
		//System.out.println(myList.size());
		
		// Affiche les emplacements des évènements sur le plateau.
		//System.out.println(Arrays.toString(boardTest));
		
		//AllList.displayArrayList(AllList.listEvent());

		for (int i = 0; i < boardTest.length; i++) {
			boardTest[i].interactWithUser();
		}

	}
}

/// prochaine étape, les interfaces.
//uneInterface monObjet = new UneClasse();
//monObjet.methode1();
//monObjet = new UneAutreClasse();
//monObjet.methode1();
//monObjet.methode2();

