package Practice.TaskFromBook1.MorskojBoj;

import java.util.Arrays;

class MorskojBojDemo {
    public static void main(String[] args) {

        int size = RequestParameters.parameterRequestInt("Введите размер поля(от 3 до 9)");
        //заполним игровое поле кораблями
        GameBoard game1 = new GameBoard();
        game1.size = size;

        game1.createField();
        game1.setShip(2);
        //начинаем игру
        MorskojBoj_1_02 boj = new MorskojBoj_1_02();
        boj.size = size;
        boj.gameBoardInt = game1.boardReturner();
//        System.out.println(Arrays.deepToString(boj.gameBoardInt));

        boj.gameBoardStrCreator();
//        System.out.println(Arrays.deepToString(boj.gameBoardStr));
//        System.out.println(boj.size);
        boj.game();
//        MorskojBoj_version1_01 boy1 = new MorskojBoj_version1_01();
//        boy1.morskojBoj(game1.gameBoard);

    }
}
