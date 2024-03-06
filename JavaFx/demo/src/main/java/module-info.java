module vuhso.javafx.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens vuhso.javafx.demo to javafx.fxml;
    exports vuhso.javafx.demo;
}