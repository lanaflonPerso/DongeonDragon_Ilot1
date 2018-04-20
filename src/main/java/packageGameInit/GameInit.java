package packageGameInit;

import java.util.ArrayList;
import java.util.Random;
import packageEvent.Event;
import packageGameInit.packageAllList.ListEvent;

public class GameInit {
	
	public Event[] gameBoardInit(){
		Event[] boardTest = new Event[64]; 
		int boardLength = boardTest.length;
		ArrayList<Event> myList = ListEvent.listEvent();
		int count = 0; 
		Random r = new Random(boardLength); 
		int boardPos; 

		while( count < myList.size()) {	
	
			boardPos = r.nextInt(boardLength); 
	
			if (boardTest[boardPos] == null )
			{
				boardTest[boardPos] = myList.get(count);  
				count = count + 1;
			}
		}
	
		//System.out.println("nombre de tours de ma boucle : " + count);
		
		/*for (int i = 0; i < boardTest.length; i++) {
			if (boardTest[i] != null)
				boardTest[i].interactWithUser();
		}*/
		return boardTest;
	}
}
