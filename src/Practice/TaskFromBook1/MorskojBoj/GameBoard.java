package Practice.TaskFromBook1.MorskojBoj;

import java.util.Arrays;
import java.util.Random;

class GameBoard {
    int[][]gameBoard;
    int size;

    void createField() {
        gameBoard = new int[size][size];
    }

    void setShip (int shipSize){
        int x = (int) (Math.random() * size);
        int y = (int) (Math.random() * (size - 2));
        //в том случае если корабль имеет вертикальное расположение
        Random isShipVertical = new Random();
        if(isShipVertical.nextBoolean()){//размещаем наш случайный ВЕРТИКАЛЬНЫЙ корабль
            gameBoard[x][y] = 1;
            gameBoard[x][y + 1] = 1;
            gameBoard[x][y + 2] = 1;
        }else{//горизонтальный корабль
            gameBoard[y][x] = 1;
            gameBoard[y+1][x] = 1;
            gameBoard[y+2][x] = 1;
        }
    }

    int[][] boardReturner(){
        return gameBoard;
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "gameBoard=" + Arrays.deepToString(gameBoard) +
                ", size=" + size +
                '}';
    }

    public int getSize() {
        return size;
    }
}

