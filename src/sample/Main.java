package sample;

import game.Field;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Toe Tic Tac");
        primaryStage.setScene(new Scene(root, 680, 485));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //Field field = new Field();
        //field.toggleTiled(100);
        //field.print();

        // field.shuffle();
        //field.print();
        launch(args);
    }
}