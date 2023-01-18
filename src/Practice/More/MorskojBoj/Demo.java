package Practice.More.MorskojBoj;

//задача. Исспользуя знания полученные за начальный курс написать в консоли игру
//морской бой. Только своим кодом. Изменяемый размер поля.
//1 версия включает поле и 1 корабль
//2 версия добавляет большее количество кораблей
//3 работаем с архитектурой
//4 версия делает корабли разного размера
//5 версия добавляется игра против кумпьютера

//напоминания: нету

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int size;

        switch (RequestParameters.chooseGame()) {
            case (1) -> {
                System.out.println("игра против PC еще не реализована");
                size = 10;
                SeaFight_1_04_user boj = new SeaFight_1_04_user(size);
                GameBoard board = new GameBoard(size);
                SeaFightVsCympyter draka = new SeaFightVsCympyter();

                board.createBoardStr();
                board.setStandartBoard();
                draka.pcArray = board.readyGameBoardReturner();
//                System.out.println(Arrays.deepToString(draka.pcArray));


//                draka.printArr(board.readyGameBoardReturner());

            draka.userArrayCreate();

//                board.createBoardStr();
//                board.setStandartBoard();
//                draka.userArray = board.readyGameBoardReturner();


            }

            case (2) -> {
                size = 10;
                SeaFight_1_04_user boj = new SeaFight_1_04_user(size);
                GameBoard board = new GameBoard(size);
                board.createBoardStr();
                board.setStandartBoard();
//                board.print();
                boj.gameBoardStr = board.readyGameBoardReturner();
                boj.game();
            }
            case (3) -> {
                size = RequestParameters.parameterRequestInt("Введите размер поля(от 3 до 10)");
                SeaFight_1_04_user boj = new SeaFight_1_04_user(size);
                GameBoard board = new GameBoard(size);
                board.createBoardStr();
                board.print();
                board.setMoreShips();
//                board.print();
                boj.gameBoardStr = board.readyGameBoardReturner();
                boj.game();
            }
        }
        }
    }
