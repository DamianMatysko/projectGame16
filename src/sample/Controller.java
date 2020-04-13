package sample;

import game.Game;
import game.Tile;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;


public class Controller {
    public Button restartGame;
    public Button endGame;
    public Button newGame;

    public Button b0, b1, b2, b3;
    public Button b4, b5, b6, b7;
    public Button b8, b9, b10, b11;
    public Button b12, b13, b14, b15;

    private Game game;
    public Controller() {
        game = new Game();
    }

    public void newGameOnAction(ActionEvent actionEvent) {
        game.start();
        newGame.setDisable(true);
        restartGame.setDisable(false);
        endGame.setDisable(true);
    }

    public void endGameOnAction(ActionEvent actionEvent) {
        game.end();
        newGame.setDisable(false);
        restartGame.setDisable(false);
        endGame.setDisable(true);
    }

    public void restartGameOnAction(ActionEvent actionEvent) {
        game.reset();
        restartGame.setDisable(true);
        newGame.setDisable(false);
        endGame.setDisable(false);
    }

    public void clickBtn(ActionEvent actionEvent) {
        int value = Integer.parseInt(((Button)actionEvent.getSource()).getId().substring(((Button)actionEvent.getSource()).getId().lastIndexOf("b")+1));
        System.out.println(value);
        game.nextMove(value);
        if (game.getField()!=null) {
            rePaint();
        }
    }
    public void rePaint(){
        Tile[][] tiles = game.getField().getArr();

        b0.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        b0.setText(tiles[0][0].isValue()?"X":"O");
        b1.setText(tiles[1][0].isValue()?"X":"O");
        b2.setText(tiles[2][0].isValue()?"X":"O");
        b3.setText(tiles[3][0].isValue()?"X":"O");

        b4.setText(tiles[0][1].isValue()?"X":"O");
        b5.setText(tiles[1][1].isValue()?"X":"O");
        b6.setText(tiles[2][1].isValue()?"X":"O");
        b7.setText(tiles[3][1].isValue()?"X":"O");

        b8.setText(tiles[0][2].isValue()?"X":"O");
        b9.setText(tiles[1][2].isValue()?"X":"O");
        b10.setText(tiles[2][2].isValue()?"X":"O");
        b11.setText(tiles[3][2].isValue()?"X":"O");

        b12.setText(tiles[0][3].isValue()?"X":"O");
        b13.setText(tiles[1][3].isValue()?"X":"O");
        b14.setText(tiles[2][3].isValue()?"X":"O");
        b15.setText(tiles[3][3].isValue()?"X":"O");
    }
}
