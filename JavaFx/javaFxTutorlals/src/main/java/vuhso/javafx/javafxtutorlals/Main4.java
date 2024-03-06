package vuhso.javafx.javafxtutorlals;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.Optional;

public class Main4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("login Dialog");
        dialog.setHeaderText("Sign Up");

        ButtonType loginButtonType = new ButtonType("login in", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        GridPane gridPane = new GridPane();

        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20,150, 10, 10));

        TextField userName = new TextField();
        userName.setPromptText("Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        gridPane.add(new Label("Username:"), 0, 0);
        gridPane.add(userName, 1, 0);
        gridPane.add(new Label("Password:"), 0 , 1);
        gridPane.add(passwordField, 1, 1);

        Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);

        userName.textProperty().addListener((observableValue, oldValue, newValue) -> {
            loginButton.setDisable(newValue.trim().isEmpty());
        } );

        dialog.getDialogPane().setContent(gridPane);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(userName.getText(), passwordField.getText());
            } else {
                return null;
            }
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();
        result.ifPresent(userNamepassword -> {
            System.out.println("Username = " + userNamepassword.getKey() + ", Password = " + userNamepassword.getValue());
        });
    }
}
