package fr.killya;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ClientController {

    @FXML
    private TextField matriculev;

    public void ekip() throws IOException {

        if (matriculev.getText().equals("2")) {
            App.setRoot("connexion");

        }
    }
}