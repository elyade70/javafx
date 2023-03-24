package fr.killya;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ComptableController {
    @FXML
    private TextField nomm;

    @FXML
    private TextField txtnuitéeqté;

    @FXML
    private TextField txtnuitéemu;

    @FXML
    private TextField txtnuitéett;

    @FXML
    private TextField txtrepasqté;

    @FXML
    private TextField txtrepasmu;

    @FXML
    private TextField txtrepastt;

    @FXML
    private TextField txtkmqté;

    @FXML
    private TextField txtkmmu;

    @FXML
    private TextField txtkmtt;

    @FXML
    private TextField matricule;
    @FXML
    private RadioButton pidf;
    @FXML
    private RadioButton lnpdc;
    @FXML
    private RadioButton autres;
    @FXML
    private RadioButton lara;

    public void initialize() {

        txtnuitéemu.setText("800");
        txtrepasmu.setText("297");
        txtkmmu.setText("0.003");

        matricule.setText(common.matricule);
        nomm.setText(common.nom);
    }

    @FXML
    private void region() {
        if (autres.isSelected()) {

            txtnuitéemu.setText("800");
            txtrepasmu.setText("297");
            txtkmmu.setText("0.003");
            String a = txtnuitéeqté.getText();

            String d = txtnuitéemu.getText();

            int qténu = Integer.parseInt(a);

            int munu = Integer.parseInt(d);

            int txtnuitéetot = qténu * munu;

            String totalnuitée = String.valueOf(txtnuitéetot);

            txtnuitéett.setText(totalnuitée);
            String b = txtrepasqté.getText();
            String e = txtrepasmu.getText();
            int qtére = Integer.parseInt(b);
            int mure = Integer.parseInt(e);
            int txtrepastot = qtére * mure;
            String totalrepas = String.valueOf(txtrepastot);
            txtrepastt.setText(totalrepas);
            String c = txtkmqté.getText();
            String f = txtkmmu.getText();
            int qtékm = Integer.parseInt(c);
            double mukm = Double.parseDouble(f);
            double txtkmtot = qtékm * mukm;
            String totalkm = String.valueOf(txtkmtot);
            txtkmtt.setText(totalkm);

        }
        if (lara.isSelected()) {
            txtnuitéemu.setText("825");
            txtrepasmu.setText("350");
            txtkmmu.setText("0.015");
            String a = txtnuitéeqté.getText();

            String d = txtnuitéemu.getText();

            int qténu = Integer.parseInt(a);

            int munu = Integer.parseInt(d);

            int txtnuitéetot = qténu * munu;

            String totalnuitée = String.valueOf(txtnuitéetot);

            txtnuitéett.setText(totalnuitée);
            String b = txtrepasqté.getText();
            String e = txtrepasmu.getText();
            int qtére = Integer.parseInt(b);
            int mure = Integer.parseInt(e);
            int txtrepastot = qtére * mure;
            String totalrepas = String.valueOf(txtrepastot);
            txtrepastt.setText(totalrepas);
            String c = txtkmqté.getText();
            String f = txtkmmu.getText();
            int qtékm = Integer.parseInt(c);
            double mukm = Double.parseDouble(f);
            double txtkmtot = qtékm * mukm;
            String totalkm = String.valueOf(txtkmtot);
            txtkmtt.setText(totalkm);

        }
        if (lnpdc.isSelected()) {
            txtnuitéemu.setText("870");
            txtrepasmu.setText("400");
            txtkmmu.setText("0.050");
            String a = txtnuitéeqté.getText();

            String d = txtnuitéemu.getText();

            int qténu = Integer.parseInt(a);

            int munu = Integer.parseInt(d);

            int txtnuitéetot = qténu * munu;

            String totalnuitée = String.valueOf(txtnuitéetot);

            txtnuitéett.setText(totalnuitée);
            String b = txtrepasqté.getText();
            String e = txtrepasmu.getText();
            int qtére = Integer.parseInt(b);
            int mure = Integer.parseInt(e);
            int txtrepastot = qtére * mure;
            String totalrepas = String.valueOf(txtrepastot);
            txtrepastt.setText(totalrepas);
            String c = txtkmqté.getText();
            String f = txtkmmu.getText();
            int qtékm = Integer.parseInt(c);
            double mukm = Double.parseDouble(f);
            double txtkmtot = qtékm * mukm;
            String totalkm = String.valueOf(txtkmtot);
            txtkmtt.setText(totalkm);

        }
        if (pidf.isSelected()) {
            txtnuitéemu.setText("100");
            txtrepasmu.setText("500");
            txtkmmu.setText("0.0100");
            String a = txtnuitéeqté.getText();

            String d = txtnuitéemu.getText();

            int qténu = Integer.parseInt(a);

            int munu = Integer.parseInt(d);

            int txtnuitéetot = qténu * munu;

            String totalnuitée = String.valueOf(txtnuitéetot);

            txtnuitéett.setText(totalnuitée);
            String b = txtrepasqté.getText();
            String e = txtrepasmu.getText();
            int qtére = Integer.parseInt(b);
            int mure = Integer.parseInt(e);
            int txtrepastot = qtére * mure;
            String totalrepas = String.valueOf(txtrepastot);
            txtrepastt.setText(totalrepas);
            String c = txtkmqté.getText();
            String f = txtkmmu.getText();
            int qtékm = Integer.parseInt(c);
            double mukm = Double.parseDouble(f);
            double txtkmtot = qtékm * mukm;
            String totalkm = String.valueOf(txtkmtot);
            txtkmtt.setText(totalkm);

        }
    }

    @FXML
    private void valeurnuitée() {

        String a = txtnuitéeqté.getText();

        String d = txtnuitéemu.getText();

        int qténu = Integer.parseInt(a);

        int munu = Integer.parseInt(d);

        int txtnuitéetot = qténu * munu;

        String totalnuitée = String.valueOf(txtnuitéetot);

        txtnuitéett.setText(totalnuitée);

        common.totalnuitee = totalnuitée;

    }

    public void valeurrepas() {
        String b = txtrepasqté.getText();
        String e = txtrepasmu.getText();
        int qtére = Integer.parseInt(b);
        int mure = Integer.parseInt(e);
        int txtrepastot = qtére * mure;
        String totalrepas = String.valueOf(txtrepastot);
        txtrepastt.setText(totalrepas);

        common.totalreppas = totalrepas;

    }

    public void valeurkm() {
        String c = txtkmqté.getText();
        String f = txtkmmu.getText();
        int qtékm = Integer.parseInt(c);
        double mukm = Double.parseDouble(f);
        double txtkmtot = qtékm * mukm;
        String totalkm = String.valueOf(txtkmtot);
        txtkmtt.setText(totalkm);

        common.totalkmm = totalkm;

    }

    public void confirmer() throws IOException {

        String z = txtkmtt.getText();
        App.setRoot("liste");

    }
}