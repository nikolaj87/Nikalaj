package Practice.TaskFromBook1.MorskojBoj;

class MorskojBojDemo {
    public static void main(String[] args) {

        int x = RequestParameters.gameSize("Введите размер поля");
        //заполним игровое поле кораблями
        SetShip set1 = new SetShip();
        int [][] array1 =  set1.create(x);
        //начинаем игру
        MorskojBoj_version1_01 boy1 = new MorskojBoj_version1_01();
        boy1.morskojBoj(array1);
    }
}
