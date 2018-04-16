import packageGameInit.GameBoard;
import packageGameStart.*;
import java.sql.*;

public class MainClass {
    public static void main(String[] args) {
//     	gameInit();
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warriorjava","root","");
        }catch(Exception e){
            System.out.println("Echec !");
            e.printStackTrace();
        }
        
        if(conn!=null){
            System.out.println("Succès!");
        }
        else{
            System.out.println("Echec !");
        }
        
        try {
        	
        	statement st=conn.createStatement();
        	ResultSet resultat=st.executeQuery("select * from eleve");
        	
        }catch(Exception e){
        	e.printStackTrace();
        }
    GameStart gameStart = new GameStart();
       gameStart.InGame();

//        GameBoard.GameBoardInit();
    }


}





