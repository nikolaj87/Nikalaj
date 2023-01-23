package practice.morskojboj;

import java.util.Random;

public class GameBoard {

    static int boardSize = 10;
    static String[][] gameBoard = new String[boardSize][boardSize];
    static int[] shipSizes = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
    static Ship[] ships = new Ship[shipSizes.length];

        void createBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameBoard[i][j] = GameVsUser.symbol_start;
            }
        }
    }

    void createShip() {
        int numberOfShip = 0;
        for (int size : shipSizes) {                                    //для всех размеров кораблей 4-3-3-2-2-2-1...
            while (true) {
                Random random = new Random();
                int isVertical = random.nextInt(2);    //определить вертикальность горизональность
                int x = random.nextInt(10);            //1 координата
                int y = random.nextInt(boardSize-(size - 1));
                if (gameBoardAnalyser(y, x, isVertical, size)) {         //анализируем, можно ли тут поставить корабль
                    setShip(y, x, isVertical, size, numberOfShip);       //если да - записываем координату в обьект
                    numberOfShip++;                                      //корабль из массива кораблей
                    break;
                }
            }
        }
    }

    boolean gameBoardAnalyser(int y, int x, int isVertical, int shipSize) { //метод гибко проверяет координаты x y
        boolean flag = true;                                               //массива не вылетая за его пределы
        int correctLen = 0;                                                //две переменные корректируют цикл 3x5 (для 3х корабля)
        int correctWid = 0;                                                //или 5x3 (для 3х корабля)
        if (isVertical == 0) {  //горизонтальный                             // совершаем универсальную проверку или вертикаль или горизонталь
            correctLen = correctLen + (shipSize - 1);
        } else {                //вертикальный
            correctWid = correctWid + (shipSize - 1);
            x = x + y;
            y = x - y;
            x = x - y;                  //поменяли местами x y
        }
        for (int i = x - 1; i < x + 2 + correctWid; i++) {     //цикл проверит можно ли еще поставить корабль
            if (i < 0) continue;                               //если корабль в левом столбце то срежем -1 элемент цикла
            if (i == 10) break;                                //если корабль в правом столбце то срежем size+1 элемент
            for (int j = y - 1; j < y + 2 + correctLen; j++) { //вложенный цикл для второй координаты
                if (j < 0) continue;                           //если корабль вверху то срежем верхнюю строку
                if (j > 10 - 1) break;                         //если корабль внизу срежем нижнюю строку
                if (gameBoard[j][i].equals("x")) {             //проверим не попали ли мы на старый корабль
                    flag = false;                              //флаг если попали на старый
                    break;
                }
            }
        }
        return flag;
    }

    void setShip(int row, int column, int isVertical, int shipSize, int numberOfShip) { //метод получает проверенные координаты и

        ships[numberOfShip] = new Ship(shipSize, shipSize, isVertical, new Location[shipSize]);
        for (int i = 0; i < shipSize; i++) {
            ships[numberOfShip].location[i] = new Location();

            if (isVertical == 0) {                   //вертикально
                ships[numberOfShip].location[i].x = column;
                ships[numberOfShip].location[i].y = row + i;
                gameBoard[row+i][column] = "x";
            } else {                                 //гоизонтально
                ships[numberOfShip].location[i].x = row + i;
                ships[numberOfShip].location[i].y = column;
                gameBoard[column][row+i] = "x";
            }
        }
    }

    void print(){
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

}

