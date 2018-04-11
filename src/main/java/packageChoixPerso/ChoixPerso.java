package packageChoixPerso;

import java.util.Scanner;

public class ChoixPerso {
    private static Scanner sc;

    public static void choixPersonnage(){
        sc = new Scanner(System.in);
        boolean choixDePerso = true;

        while (choixDePerso) {
            System.out.println("Que voulez vous être :\n\t1-Guerrier\n\t2-Magicien :  ");
            String choix = sc.nextLine();
            if (choix.equals("1")) {
            System.out.println("vous etes un Guerrier");
                choixDePerso = false;

            } else if (choix.equals("2")) {
                System.out.println("vous etes un Magicien");
                choixDePerso = false;
            } else {
                System.out.println("<----------------------------------------->");
                System.out.println("Deux choix possible : 1-Guerrier 2-Magicien");
                System.out.println("<----------------------------------------->");
            }
        }
    }

    }
