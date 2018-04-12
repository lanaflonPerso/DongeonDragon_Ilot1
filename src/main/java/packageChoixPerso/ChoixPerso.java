package packageChoixPerso;


import packageAllList.AllList;
import packageCharacters.Magician;
import packageCharacters.Warrior;
import packageWeaponsOffense.WeaponsOffense;
import packageAllList.*;
import packageWeaponsOffense.*;
import packageWeaponsOffense.*;
import packageCharacters.*;
import packageDefenseTools.*;


import java.util.ArrayList;
import java.util.Scanner;


public class ChoixPerso {
    private static Scanner sc;
    
    public void choixPersonnage(){
        sc = new Scanner(System.in);
        AllList newList = new AllList();
        boolean choixDePerso = true;
        boolean choixWeappon = true;
        String sChoiceWeappon; 
        String choix="";
        int nChoiceWeappon;
        int val = 0;

        while (choixDePerso) {
        	
            if(val == 0)
        	{
            	System.out.println("Que voulez vous être :\n\t1-Guerrier\n\t2-Magicien :  ");
            	choix = sc.nextLine();
        	}
            else if(val > 0)
            {   
            	System.out.println("Veux-tu créer un autre perso ? ");
            	System.out.println("\t1-Guerrier\n\t2-Magicien :  ");
            	System.out.println("\t0-Quiter : ");
            	choix = sc.nextLine();
            	
            	if(choix.equals("1") || choix.equals("2"))
            		choixWeappon = true;
            	else 
            		choixDePerso = false;
            }
            
            if (choix.equals("1")) {
	            System.out.println("Vous etes un Guerrier");
	            System.out.println("Choisis tes armes dans la liste : \n");
	            System.out.println("Tu as le droit à 2 armes.");
            
	            ArrayList<WeaponsOffense> alArmeListWarrior = newList.armeListWarrior();

	            for(int i=0; i< alArmeListWarrior.size();i++) {
	            	System.out.println("\t---- " + i + " ----");
	            	System.out.println(alArmeListWarrior.get(i));
	            }
	            
	            System.out.println("while(choixWeappon) : " + choixWeappon);
	            while(choixWeappon) {
	            	sChoiceWeappon = sc.nextLine();

	            	switch(sChoiceWeappon){

	            		case "0" :
	            			nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
	            			newList.charactersWarriorList.add(new Warrior("Naia", "Je suis un Guerrier", "100", "15", alArmeListWarrior.get(nChoiceWeappon), null));
	            			newList.displayArrayList(newList.charactersWarriorList);
	            			choixWeappon = false;
		            		break;
		            	
		            	case "1" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersWarriorList.add(new Warrior("Conan", "Je suis un Guerrier", "100", "15", alArmeListWarrior.get(nChoiceWeappon), null));
		            		newList.displayArrayList(newList.charactersWarriorList);
		            		choixWeappon = false;
		            		break;
		            		
		            	case "2" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersWarriorList.add(new Warrior("Aragorn", "Je suis un Guerrier", "100", "15", alArmeListWarrior.get(nChoiceWeappon), null));
		            		newList.displayArrayList(newList.charactersWarriorList);
		            		choixWeappon = false;
		            		break;
		            		
		            	default : 
		            		System.out.println("Rentre le bon choix");
		            		choixWeappon = true;
		            		break;
	            	}
	            }

            } else if (choix.equals("2")) {
                System.out.println("Vous etes un Magicien");
	            System.out.println("Choisis tes Sorts dans la liste : \n");
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
	            			nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
	            			newList.charactersMagicianList.add(new Magician("HellRose", "Je suis un Magicien", "100", "15", alSortListMagician.get(nChoiceWeappon), null));
	            			newList.displayArrayList(newList.charactersMagicianList);
		            		choixWeappon = false;
		            		break;
		            	
		            	case "1" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersMagicianList.add(new Magician("Mr Majax", "Je suis un Magicien", "100", "15", alSortListMagician.get(nChoiceWeappon), null));
		            		newList.displayArrayList(newList.charactersMagicianList);
		            		choixWeappon = false;
		            		break;
		            		
		            	case "2" :
		            		nChoiceWeappon = Integer.parseInt(sChoiceWeappon);
		            		newList.charactersMagicianList.add(new Magician("Glandalf", "Je suis un Magicien", "100", "15", alSortListMagician.get(nChoiceWeappon), null));
		            		newList.displayArrayList(newList.charactersMagicianList);
		            		choixWeappon = false;
		            		break;
		            		
		            	default : 
		            		System.out.println("Rentre le bon choix");
		            		choixWeappon = true;
		            		break;
	            	}
	            }

            } else if(! "0".equals(choix)){
                System.out.println("<----------------------------------------->");
                System.out.println("Deux choix possibles : 1-Guerrier 2-Magicien");
                System.out.println("<----------------------------------------->");
            }
            
            if(! "0".equals(choix))
            	val++;
        }
	}
    }
