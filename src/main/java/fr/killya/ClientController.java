package fr.killya;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ClientController {

    @FXML
    private TextField matriculev;

    public void ekip() throws IOException, SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/gsb2";
        String username = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            Statement statement = conn.createStatement();
            String co = "INSERT INTO données(totalrepas,totalkilométrage,totalnuitées,fk_matricule) VALUES(0, 0, 0, 1)";
            statement.executeUpdate(co);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // String co = "INSERT INTO données
        // (totalrepas,totalkilométrage,totalnuitées,fk_matricule) VALUES("
        // + common.totalreppas + "," + common.totalkmm + ","
        // + common.totalnuitee + "," + common.matricule + ")";
        // statement.executeUpdate(co);
        // } catch (Exception ex) {
        // ex.printStackTrace();
        // }

    }
}