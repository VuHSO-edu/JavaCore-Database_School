module vuhso.javafx.javafxtutorlals {
    requires javafx.controls;
    requires javafx.fxml;


    opens vuhso.javafx.javafxtutorlals to javafx.fxml;
    exports vuhso.javafx.javafxtutorlals;
}