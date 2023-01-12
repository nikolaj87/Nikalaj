package Practice.TaskFromBook1.MorskojBoj;

import java.util.Arrays;

public class BojDemo {
    public static void main(String[] args) {

        int x = RequestParameters.gameSize("Введите размер поля");
        //заполним игровое поле кораблями
        SetShip set1 = new SetShip();
        int [][] array1 =  set1.create(x);
        //начинаем игру
        Boj boy1 = new Boj();
        boy1.morskojBoj(array1);
    }
}
