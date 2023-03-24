package fr.killya;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
     public void RequeteNonPreparee_Identification_DoitFonctionner()throws SQLException  {
  String ekip="'Or 1=1";
  


        // Agir
       
   
        String dbURL = "jdbc:mysql://localhost:3306/gsb2";
        String username = "root";
        String password = "";
      
        Connection conn = DriverManager.getConnection(dbURL, username, password);
        ResultSet e=ConnexionController.requeteConnexion( conn, ekip);
        int size = 0;
        while (e.next()) {
            size++;
        }
  int f=size;
    
        // ASSert
        assertEquals(4,  f);

    }
    

    @Test
     public void RequetePreparee_Identification_DoitPasFonctionner()throws SQLException  {
  String ekip="'Or 1=1";
  
String mdps="ekedid";

        // Agir
       
   
        String dbURL = "jdbc:mysql://localhost:3306/gsb2";
        String username = "root";
        String password = "";
      
        Connection conn = DriverManager.getConnection(dbURL, username, password);
        ResultSet e=ConnexionController.requeteConnexionPrepared( conn, ekip, mdps);
        
        int size = 0;
        while (e.next()) {
            size++;
        }
  int f=size;
    
        // ASSert
        assertEquals(4,  f);

    }
 
   
}