package vuhso.javafx.javafxtutorlals;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main1 extends Application  {

    public static void main(String[] args) {
        launch(args);
    }
    // StackPane: xếp trồng các button
    @Override
    public void start(Stage primaryStage) {
    primaryStage.setTitle("Hello World");
        Button button = new Button();
        button.setText("Say Hello World");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @java.lang.Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello DuyVu");
            }
        });
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(button);
        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
