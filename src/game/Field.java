package game;

import java.util.Random;

public class Field {
    private Tile[][] arr;


    public Tile[][] getArr() {
        return arr;
    }

    public void setArr(Tile[][] arr) {
        this.arr = arr;
    }

    public Field() {
        initGame();
    }

    private void initGame() {
        arr = new Tile[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = new Tile();
            }
        }
    }

    public boolean isWinner() {
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j].isValue()) {
                    counter++;
                }
            }
        }
        return counter == 16 || counter==0;
    }

    public void shuffle(){
        Random rnd = new Random();
        for (int i=0;i<20;i++){ //47
            toggleTiled(rnd.nextInt(15));
        }
    }

    public void toggleTiled(int code){
        int x=code % 4; // row
        int y=code / 4;//colum


        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                //if(!(((i==x+1)&&((j==y+1) || (j== y-1)))||((i==x-1)&&((j==y+1 )||( j== y-1)))||(i==x+1)||(j==y))||((i==x-1)||(j==y))||((i==x)||(j==y+1)||((i==x)||(j==y-1)))){
                //!(xcol == icol && yrow == jrow) && Math.abs(xcol-icol) <= 1 && Math.abs(yrow-jrow) <= 1)
                if (!((j==x)&&(i==y))&&(Math.abs(j-x)==0||Math.abs(j-x)==1)&&(Math.abs(i-y)==0||Math.abs(i-y)==1)){
                    arr[i][j].toggle();
                }
            }
        }





    }

    public void print(){
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(arr[i][j].isValue()?" x ":" o ");
            }
            System.out.println();
        }

    }
}
