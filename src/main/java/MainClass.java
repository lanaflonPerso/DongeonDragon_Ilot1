
import packageCharacters.CharactersPlayer;
import packageDefenseTools.DefenseTools;
import packageEnemies.CharactersEnemies;
import packageWeapons.Weapons;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class MainClass {

    private static Scanner sc;


    public static void main(String[] args) {

        sc = new Scanner(System.in);

        ArrayList<CharactersPlayer> characters = new ArrayList();
        ArrayList<Weapons> weapons = new ArrayList();
        ArrayList<DefenseTools> defenseTools = new ArrayList();
        ArrayList<CharactersEnemies> charactersEnemies = new ArrayList();

        System.out.println("_________________________________________________________________________________________________\n" +
                "|                                                                                               |\n" +
                "|                                                                                               |\n" +
                "| ,--.                                                 |    ,--.                                |\n" +
                "| |   |,---.,---.,---.,---.,---.,---.    ,---.,---.,---|    |   |,---.,---.,---.,---.,---.,---. |\n" +
                "| |   ||   ||   ||   ||---'|   ||   |    ,---||   ||   |    |   ||    ,---||   ||   ||   |`---. |\n" +
                "| `--' `---'`   '`---|`---'`---'`   '    `---^`   '`---'    `--' `    `---^`---|`---'`   '`---' |\n" +
                "|               `---'                                                     `---'                 |\n" +
                "|                                                                                               |\n" +
                "|                                                                                               |\n" +
                "|  /'                                                                                           |\n" +
                "|  ||                                                                                           |\n" +
                "|  ||      ** *                                                                                 |\n" +
                "|  ||      __X_                                                                                 |\n" +
                "|  ||     ( ___\\                        .     _///_,                                            |\n" +
                "|  ||     |:  \\\\                      .      / ` ' '>                                           |\n" +
                "| ><><  ___)..:/_#__,                   )   o'  __/_'>                                          |\n" +
                "| (X|) (|+(____)+\\ _)                  (   /  _/  )_\\'>                                         |\n" +
                "|  o|_\\/>> + + + << \\                   ' \"__/   /_/\\_>                                         |\n" +
                "|     |:\\/|+ + + +| \\_\\<                   ____/_/_/_/                                          |\n" +
                "|     \\./  XXXXXX.  (o_)_                 /,---, _/ /                                           |\n" +
                "|        /+ + + |   \\:|                  \"\"  /_/_/_/                                            |\n" +
                "|       /+ +/+ +|  -/->>>----.              /_(_(_(_                 \\                          |\n" +
                "|      /+ +|+ /XX /   _--,  _ \\            (   \\_\\_\\\\_               )\\                         |\n" +
                "|    \\+ + + /  |X   (,\\- \\/_ ,              \\'__\\_\\_\\_\\__            ).\\                        |\n" +
                "|     /\\+ + /\\  |X \\    /,//_/              //____|___\\__)           )_/                        |\n" +
                "|    +_+_+_( )o_)X  \\  (( ///               |  _  \\'___'_(           /'                         |\n" +
                "|     (_o(  /__/ X   \\  \\\\//                \\_ (-'\\'___'_\\      __,'_'                          |\n" +
                "|      \\_|  |_/  X    \\ ///                 __) \\  \\\\___(_   __/.__,'                           |\n" +
                "|      \\_| >(_/        \\,/               ,((,-,__\\  '\", __\\_/. __,'                             |\n" +
                "| ,////__o\\ /__////,    V                           '\"./_._._-'                                 |\n" +
                "|_______________________________________________________________________________________________|");

        ////////////////////////////______________DESSIN_____________________////////////////////////////////

        boolean lanceDe=true;
        while(lanceDe) {
            System.out.println("Que voulez vous faire :\n\t1-Lancer le Dé\n\t2-Sortir");
            String choixDeSix=sc.nextLine();
            if(choixDeSix.equals("1")){
                deSix();
            }else if(choixDeSix.equals("2")){
                lanceDe=false;
            }else{
                System.out.println("2 choix seulement : 1 ou 2");
            }

        }
    }
    ///////////////////////////////////////_________________Méthode_______________//////////////////////////////
private static void deSix(){
Random deSix= new Random();
    System.out.println("Résultat de votre Lancé : " + (deSix.nextInt(6)+1));
}
}
