package packageGameInit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import packageAllList.AllList;
import packageBox.*;
import packageEnemies.*;


public class GameBoard {
	
	public static Object boardTest[] = new Object[64];
	
	
	public static void GameBoardInit(){
		
		ArrayList<Object> myList =  AllList.listEvent();
		int count = 0;
		Random r = new Random();
		int boardPos;
		
		
		while( count < myList.size()) {
			
			boardPos = r.nextInt(64);
			
			if (boardTest[boardPos] == null) {
				boardTest[boardPos] = myList.get(count);
				count = count + 1;
			}
		}
		
		System.out.println("nombre de tours de ma boucle : " + count);
		
		System.out.println(myList.size());
		
		System.out.println(Arrays.toString(boardTest));
		
		//AllList.displayArrayList(AllList.listEvent());
		
		for (int i = 0; i < boardTest.length; i++) {

			if (boardTest[i] instanceof Wizzard) {
				System.out.println("Je suis tombé sur un " + ((Wizzard)boardTest[i]).getName() + " à la case " + i);
				System.out.println("Il possède une puissance de : " + ((Wizzard)boardTest[i]).getAttackLevel());

			} else if (boardTest[i] instanceof BoxBonus) {
			
			System.out.println("Je suis tombé sur une " + ((BoxBonus)boardTest[i]).getName() + " à la case " + i
					+ "qui me fais avancer de " + ((BoxBonus)boardTest[i]).getBoxBonus() + " cases");
			
			} else if (boardTest[i] instanceof Succube) {
				System.out.println("Je suis tombé sur une " + ((Succube)boardTest[i]).getName() + " à la case " + i);
				System.out.println("Elle possède une puissance de : " + ((Succube)boardTest[i]).getAttackLevel());
			} else if (boardTest[i] instanceof Dragon) {
				System.out.println("Je suis tombé sur un " + ((Dragon)boardTest[i]).getName() + " à la case " + i);
				System.out.println("Il possède une puissance de : " + ((Dragon)boardTest[i]).getAttackLevel());
			} else if (boardTest[i] instanceof BoxJoker) {
				System.out.println("Je suis tombé sur une " + ((BoxBonus)boardTest[i]).getName() + " à la case " + i);
			} else if (boardTest[i] instanceof BoxItemDefenseTools) {
				System.out.println();
			} else if (boardTest[i] instanceof BoxItemOffense) {
				System.out.println();
			}
		}
	}
}

// 
// 
// 
// 
// 


//uneInterface monObjet = new UneClasse();
//monObjet.methode1();
//monObjet = new UneAutreClasse();
//monObjet.methode1();
//monObjet.methode2();

