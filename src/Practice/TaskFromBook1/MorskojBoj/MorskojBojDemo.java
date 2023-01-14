package Practice.TaskFromBook1.MorskojBoj;

import java.util.Arrays;

class MorskojBojDemo {
    public static void main(String[] args) {
        GameBoard polozenieKorablia = new GameBoard();
        MorskojBoj_1_02 boj = new MorskojBoj_1_02();

        int size = RequestParameters.parameterRequestInt("Введите размер поля(от 3 до 9)");
        //заполним игровое поле кораблями

        boj.shotToWin = 3;
        boj.gameBoardStrCreator();

        polozenieKorablia.size = size;

        polozenieKorablia.createField();
        polozenieKorablia.setShip(2);
        boj.printToConsole();

        while(true) {
            boolean newShip = RequestParameters.isAddShip("На поле уже есть корабль! Поставить еще один? Y/N");
            if (!newShip) break;
            if(polozenieKorablia.setAnotherShip(2)) {
                boj.shotToWin = boj.shotToWin + 3;
            }

        }

        //polozenieKorablia.print();

        //начинаем игру
        boj.size = size;
        boj.gameBoardInt = polozenieKorablia.boardReturner();
        boj.gameBoardStrCreator();
        boj.game();
    }
}
