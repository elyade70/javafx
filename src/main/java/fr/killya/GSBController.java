package fr.killya;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GSBController {

    @FXML
    private TableView view;

    @FXML
    private TableColumn<GSBController, Integer> matricule;

    @FXML
    private TableColumn<GSBController, String> nom;

    @FXML
    private TableColumn<GSBController, String> prenom;

    @FXML
    private TableColumn<GSBController, Integer> montant;


  


    public void initialize() {
        nom.setCellValueFactory(new PropertyValueFactory<>("Martelossi"));
        prenom.setCellValueFactory(new PropertyValueFactory<>("Massimo"));
    }
}
