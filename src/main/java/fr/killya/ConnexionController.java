package fr.killya;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ConnexionController {
    @FXML
    private TextField login;

    @FXML
    private  PasswordField mdp;

    @FXML
    private Button identification;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private Text iderreur;

    @FXML
    public void identification() throws IOException, SQLException {
        System.out.println(login.getText());
        System.out.println(mdp.getText());
        String ekip = login.getText();
        String mdps=mdp.getText();
        String dbURL = "jdbc:mysql://localhost:3306/gsb2";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            ResultSet cor = requeteConnexion(conn,ekip);

            if (cor.next()) {
                System.out.println(cor.getString("admin"));
                common.matricule = cor.getString("ag_matricule");
                common.nom = cor.getString("ag_nom");
                if (cor.getString("admin").equals("1")) {
                    System.out.println("adddmin");
                    App.setRoot("client");

                    iderreur.setText(" ");
                } else {
                    System.out.println(common.matricule);
                    System.out.println("non admin");
                    App.setRoot("comptable");
                    iderreur.setText(" ");

                }

            } else {
                System.out.println("non");
                iderreur.setText("Erreur, Mot de passe ou login incorrect");
            }

        }

    }

    ResultSet requeteConnexion(Connection conn, String ekip) throws SQLException {
        Statement statement = conn.createStatement();
        String co = "SELECT * from comptable WHERE ag_login ='" + ekip + "' AND ag_password ='"
                + mdp.getText() + "'";
        ResultSet cor = statement.executeQuery(co);
        return cor;
    }

    
/*public static ResultSet requeteConnexion(Connection conn, String ekip) throws SQLException {
        Statement statement = conn.createStatement();
        String co = "SELECT * from comptable WHERE ag_login ='" + ekip ;
        ResultSet cor = statement.executeQuery(co);
        return cor;
    }
    public static ResultSet requeteConnexionPrepared(Connection conn, String ekip,String mdps) throws SQLException {
        Statement statement = conn.createStatement();
        String co = "SELECT * from comptable WHERE ag_login ='" + ekip + "' AND ag_password ='"
        + mdp.getText() + "'";
            PreparedStatement preparedStatement = conn.prepareStatement(co); 
            preparedStatement.setString(1,ekip); 
            preparedStatement.setString(2,mdps); 
       
            ResultSet cor = statement.executeQuery(co);
            preparedStatement.executeUpdate();
            return cor;

    }*/

}
