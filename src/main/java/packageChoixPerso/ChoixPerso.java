package packageChoixPerso;

import packageAllList.*;
import packageWeaponsOffense.*;
import packageWeaponsOffense.*;
import packageCharacters.*;
import packageDefenseTools.*;

import java.util.ArrayList;
import java.util.Scanner;


public class ChoixPerso {
    private static Scanner sc;
//    private static Warrior warrior;
//    private static Magician magician;
    
   
    
    public  void choixPersonnage(){
        sc = new Scanner(System.in);
        AllList newList = new AllList();
        boolean choixDePerso = true;
        boolean choixWeappon = true;
        String sChoiceWeappon; 
        int nChoiceWeappon;
        

        while (choixDePerso) {
        	
            System.out.println("Que voulez vous être :\n\t1-Guerrier\n\t2-Magicien :  ");
            String choix = sc.nextLine();
            
            if (choix.equals("1")) {
	            System.out.println("Vous etes un Guerrier");
	            System.out.println("Choisie tes armes dans la liste : \n");
	            System.out.println("Tu as le droit à 2 armes.");
            
	            ArrayList<WeaponsOffense> alArmeListWarrior = newList.armeListWarrior();

	            for(int i=0; i< alArmeListWarrior.size();i++) {
	            	System.out.println("\t---- " + i + " ----");
	            	System.out.println(alArmeListWarrior.get(i));
	            }

	            while(choixWeappon) {
	            	sChoiceWeappon = sc.nextLine();
	            	
	            	
	            	switch(sChoiceWeappon){

	            		case "0" :
	            			nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
	            			newList.charactersWarriorList.add(new Warrior("Naia", "Je suis un Guerrier", "100", "15", alArmeListWarrior.get(nChoiceWeappon), null));
	            			choixWeappon = false;
		            		break;
		            	
		            	case "1" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersWarriorList.add(new Warrior("HellRose", "Je suis un Guerrier", "100", "15", alArmeListWarrior.get(nChoiceWeappon), null));
		            		choixWeappon = false;
		            		break;
		            		
		            	case "2" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersWarriorList.add(new Warrior("MalchanceMan", "Je suis un Guerrier malchanceux", "100", "15", alArmeListWarrior.get(nChoiceWeappon), null));
		            		choixWeappon = false;
		            		break;
		            		
		            	default : 
		            		System.out.println("Rentre le bon choix");
		            		choixWeappon = true;
		            		break;
	            	}
	            }
	            
            	choixDePerso = false;

            } else if (choix.equals("2")) {
                System.out.println("Vous etes un Magicien");
	            System.out.println("Choisie tes Sorts dans la liste : \n");
	            System.out.println("Tu as le droit à 2 Sorts.");
            
	            ArrayList<WeaponsOffense> alSortListMagician = newList.sortListMagician();
	            
	            for(int i=0; i< alSortListMagician.size();i++) {
	            	System.out.println("\t---- " + i + " ----");
	            	System.out.println(alSortListMagician.get(i));
	            }

	            while(choixWeappon) {
	            	sChoiceWeappon = sc.nextLine();
	            
	            	switch(sChoiceWeappon){

	            		case "0" :
	            			//System.out.println(sChoiceWeappon);
	            			nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
	            			newList.charactersMagicianList.add(new Magician("Docteur Strange", "Je suis un Magicien", "100", "15", alSortListMagician.get(nChoiceWeappon), null));
		            		choixWeappon = false;
		            		break;
		            	
		            	case "1" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersMagicianList.add(new Magician("La Sorciere Rouge", "Je suis un Magicien", "100", "15", alSortListMagician.get(nChoiceWeappon), null));
		            		choixWeappon = false;
		            		break;
		            		
		            	case "2" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersMagicianList.add(new Magician("Gandalf", "Je suis un Magicien", "100", "15", alSortListMagician.get(nChoiceWeappon), null));
		            		choixWeappon = false;
		            		break;
		            		
		            	default : 
		            		System.out.println("Rentre le bon choix");
		            		choixWeappon = true;
		            		break;
	            	}
	            }

                choixDePerso = false;
            } else {
                System.out.println("<----------------------------------------->");
                System.out.println("Deux choix possible : 1-Guerrier 2-Magicien");
                System.out.println("<----------------------------------------->");
            }
        }

    }

    }
