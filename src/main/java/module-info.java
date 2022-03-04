module fr.killya {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens fr.killya to javafx.fxml;
    exports fr.killya;
    
}
