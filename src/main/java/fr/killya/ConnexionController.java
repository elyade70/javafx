package fr.killya;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ConnexionController {
    @FXML
    private TextField login;

    @FXML
    private PasswordField mdp;

    @FXML
    private Button identification;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;


    @FXML
    private void identification() throws IOException, SQLException {
        System.out.println(login.getText());
        System.out.println(mdp.getText());




        String dbURL = "jdbc:mysql://localhost:3306/gsb";
        String username = "root";
        String password = "";
 
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
     
            String sql = "SELECT * FROM agents";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            String co = "SELECT * from agents WHERE ag_login ='" + login.getText() + "' AND ag_password ='" + mdp.getText() + "'";
            ResultSet cor = statement.executeQuery(co);

            


                if(cor.next()) {
                    if(AdminControl() == true) {
                        System.out.println("adddmin");
                        App.setRoot("gsb");
                    } else {
                        System.out.println("non admin");
                        
                    }
                  
                } else {
                    System.out.println("non");
                }
           
        }

      
    }
    private boolean AdminControl() {
        System.out.println("Admin");
        boolean debug = true;

        return debug;
        
    }
}