import game.Field;
import game.Tile;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
private Field field;
    @BeforeEach
    void setUp() {
        field = new Field();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isWinner() {
    /*
        Tile[][] testArr=new Tile[][]{{new Tile(),new Tile(),new Tile(),new Tile()},
                {new Tile(),new Tile(),new Tile(),new Tile()},
                {new Tile(),new Tile(),new Tile(),new Tile()},
                {new Tile(),new Tile(),new Tile(),new Tile()}};

     */

    assertTrue(field.isWinner());
    field.getArr()[1][1].setValue(true);
    }
    @Test
    void shuffle() {
    }

    @Test
    void toggleTiled() {
    }

    @Test
    void print() {
    }
}