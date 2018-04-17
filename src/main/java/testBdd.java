import java.sql.*;
import java.util.Scanner;

public class testBdd {
    private static Scanner sc;
    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Driver O.K.");


            String url = "jdbc:mysql://localhost:3306/donjon_dragon";

            String user = "david";

            String passwd = "Axel1+Lulu2";


            Connection conn = DriverManager.getConnection(url, user, passwd);

            System.out.println("Connexion effective !");
            //creation perso
            sc = new Scanner(System.in);
            System.out.println("Création Personnage:");
            System.out.println("Nom du personnage:");
            String nameNewPerso=sc.nextLine();
            System.out.println("Vie du personnage:");
            int lifeNewPerso=sc.nextInt();
            sc.nextLine();
            System.out.println("Type du personnage:");
            String typeNewPerso=sc.nextLine();

            PreparedStatement newPersonnage = conn.prepareStatement("INSERT  into personnage(name, life, type) VALUE (?,?,?) ");
            newPersonnage.setString(1,nameNewPerso);
            newPersonnage.setInt(2,lifeNewPerso);
            newPersonnage.setString(3,typeNewPerso);
            newPersonnage.executeUpdate();


//recuperation perso en bdd
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM personnage");
             int id ;
             String name = "";
             int life;
             String type = "";
            System.out.println("<------------------->");
            while(result.next()){

                id = result.getInt("id");
                name = result.getString("name");
                life =result.getInt("life");
                type =result.getString("type");
                 System.out.println("id Perso:"+id+"\nNom personnage:"+name+"\nVie:"+life+"\nType de Personnage:"+type);

            }



            //selectionner un personnage

//            sc = new Scanner(System.in);
            System.out.println("Saisir l'id du personnage dessiré:");
            int idPersoSelect = sc.nextInt();
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT name from personnage where id = ?");
            preparedStatement.setInt(1, idPersoSelect);
            result = preparedStatement.executeQuery();
            result.next();
            name = result.getString("name");
            System.out.println("Vous Avez selectionné :"+ name);

            // suprimer un personnage
            System.out.println("Saisir l'id du personnage à suprimer:");
            int idPersoDelet = sc.nextInt();
            PreparedStatement deletePerso=conn.prepareStatement("DELETE  from personnage where id = ? ");
            deletePerso.setInt(1,idPersoDelet);
            deletePerso.executeUpdate();



//            System.out.println("Vous Avez suprimé :"+ id);


        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
