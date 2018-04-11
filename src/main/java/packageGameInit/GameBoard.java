package packageGameInit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import packageAllList.AllList;
import packageBox.*;
import packageEnemies.*;


public class GameBoard {
	
	public static Object boardTest[] = new Object[64]; /* Instance d'un nouveau tableau d'objets qui sera initialisé 
														à 64 case mémoires qui prendrons comme valeurs null par défaut. */
	
	
	public static void GameBoardInit(){
		
		ArrayList<Object> myList =  AllList.listEvent(); /*  Instance d'une nouvelle ArrayList nommé myList
		qui prend pour valeur la liste des évènements.*/
		
		int count = 0; // Création d'une variable de type int qui a pour valeur zero.
		
		Random r = new Random(); // instance d'un nouveal objet nommer r en utilisant la méthode random.
		
		int boardPos; /* Attribution d'une d'une case mémoire 
		qui va acceuillire la valeur de la position aléatoire des évènements dans le plateau.*/
		
		 
		
		while( count < myList.size()) {	/* Boucle qui va implémenter aléatoirement les évènements sur le plateau
		et compter les nombres de tours effectués par la boucle.*/
			
			boardPos = r.nextInt(64); // variable qui prend pour valeur un int aléatoire de 0 à 64
			
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
		
		for (int i = 0; i < boardTest.length; i++) { /* Boucle qui va exécuter autant de fois le code
		 									par rapport à la taille maximal de mon tableau qui est initialisé à 64*/

			if (boardTest[i] instanceof Wizzard) {/* Je vérifie et j'execute Si l'objet stocker dans le tableau
			 									est une instance de la classe Wizzard et j'effectue le code suivant*/
				
				/* Je Caste l'objet stocker à l'emplacememt dans le tableau qui est détèrminer par la valeur de [i] 
				 * avec la Classe Wizzard afin de lui 'rappeller' qu'elle et une instance de cette classe 
				 * je vais ainsi pouvoir accéder à la méthodes getName() ou autres de mon choix de la classes
				 * CharactersEnemies <= better use toString() ? et j'affiche la position actuel avec la variable i */ 
				System.out.println("Je suis tombé sur un " + ((Wizzard)boardTest[i]).getName() + " à la case " + i);
				
				System.out.println("Il possède une puissance de : " + ((Wizzard)boardTest[i]).getAttackLevel() + "\n");

			} else if (boardTest[i] instanceof BoxBonus) {
			
			System.out.println("Je suis tombé sur une " + ((BoxBonus)boardTest[i]).getName() + " à la case " + i
					+ "qui me fais avancer de " + ((BoxBonus)boardTest[i]).getBoxBonus() + " cases" + "\n");
			
			} else if (boardTest[i] instanceof Succube) {
				
				System.out.println("Je suis tombé sur une " + ((Succube)boardTest[i]).getName() + " à la case " + i);
				System.out.println("Elle possède une puissance de : " + ((Succube)boardTest[i]).getAttackLevel() + "\n");
				
			} else if (boardTest[i] instanceof Dragon) {
				
				System.out.println("Je suis tombé sur un " + ((Dragon)boardTest[i]).getName() + " à la case " + i);
				System.out.println("Il possède une puissance de : " + ((Dragon)boardTest[i]).getAttackLevel() + "\n");
				
			} else if (boardTest[i] instanceof BoxJoker) {
				
				System.out.println("Je suis tombé sur une " + ((BoxJoker)boardTest[i]).getName() + " à la case " + i + "\n");
				
			} else if (boardTest[i] instanceof BoxItemDefenseTools) {
				
				System.out.println("Une box défense sa mèèèère ! " + ((BoxItemDefenseTools)boardTest[i]).toString() + " chopé à la case " + i  + "\n");
				
			} else if (boardTest[i] instanceof BoxItemOffense) {
				
				System.out.println("Yeah un Item offensif ! Sort ou Arme ? c'est ... " + ((BoxItemOffense)boardTest[i]).toString() + "\n");
				
			}
		}
	}
}

/// prochaine étape, les interfaces.
//uneInterface monObjet = new UneClasse();
//monObjet.methode1();
//monObjet = new UneAutreClasse();
//monObjet.methode1();
//monObjet.methode2();

