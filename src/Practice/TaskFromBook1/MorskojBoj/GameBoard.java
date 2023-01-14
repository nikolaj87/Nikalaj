package Practice.TaskFromBook1.MorskojBoj;

import java.util.Arrays;
import java.util.Random;

class GameBoard {
    int[][] gameBoard;
    int size;

    void createField() {
        gameBoard = new int[size][size];
    }

    void setShip(int shipSize) {
        int x = (int) (Math.random() * size);
        int y = (int) (Math.random() * (size - 2));
        //в том случае если корабль имеет вертикальное расположение
        Random isShipVertical = new Random();
        if (isShipVertical.nextBoolean()) {//размещаем наш случайный ВЕРТИКАЛЬНЫЙ корабль
            gameBoard[y][x] = 1;
            gameBoard[y + 1][x] = 1;
            gameBoard[y + 2][x] = 1;
        } else {//горизонтальный корабль. Меняем x y чтоб не выпасть из массива
            x = x+y;  y = x-y; x = x-y;
            gameBoard[y][x] = 1;
            gameBoard[y][x + 1] = 1;
            gameBoard[y][x + 2] = 1;
        }
    }
//метод пытается поставить на поле рандомным образом корабль 100 раз
    boolean setAnotherShip(int setAnotherShipSize) {
        int x = 0;
        int y = 0;
        boolean flag = false;
        for (int z = 0; z < 100; z++) {
            flag = false;
            x = (int) (Math.random() * size);
            y = (int) (Math.random() * (size - 2));
//пишем гибкий цикл фор который будет откидывать значения выходящие за массив
            for (int x1 = x - 1; x1 < x + 2; x1++) {
                if (x1 < 0) x1 = 0;
                if (x1 == size) break;
                for (int y1 = y - 1; y1 < y + 4; y1++) {
                    if (y1 < 0) y1 = 0;
                    if (y1 > size - 1) break;
                    if (gameBoard[y1][x1] == 1) {
                        flag = true;
                    }
                }
            }
            if (!flag) break;
        }
        if (flag) {
            System.out.println("не удалось поставить корабль");
        } else {
            gameBoard[y][x] = 1;
            gameBoard[y + 1][x] = 1;
            gameBoard[y + 2][x] = 1;
        }
        return !flag;
    }

    int[][] boardReturner(){
        return gameBoard;
    }

    void print(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println();
        }

    }

    public int getSize() {
        return size;
    }
}

