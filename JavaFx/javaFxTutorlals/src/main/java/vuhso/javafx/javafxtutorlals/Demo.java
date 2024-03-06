package vuhso.javafx.javafxtutorlals;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Demo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;


        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        Button button = new Button("OK");
        gridPane.getChildren().addAll(button);
        Scene scene = new Scene(gridPane, 300, 200);

        window.setScene(scene);
        window.show();


    }
}
