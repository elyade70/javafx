package fr.killya;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("connexion"), 1080, 720);
        stage.setScene(scene);
        stage.show();

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();

        String dbURL = "jdbc:mysql://localhost:3306/gsb2";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

            String sql = "SELECT * FROM comptable";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {

                // String pass = result.getString("ag_nom");
                // String pass1 = result.getString("ag_nom");
                System.out.println(result.getString("prénom"));
                System.out.println(result.getString("nom"));

                if (result.getString("prénom").equals("el") || result.getString("prénom").equals("massimo")) {
                    System.out.println("oui");
                } else {
                    System.out.println("nn");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } 

}
