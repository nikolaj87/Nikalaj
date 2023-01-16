package Practice.More.MorskojBoj;

//задача. Исспользуя знания полученные за начальный курс написать в консоли игру
//морской бой. Только своим кодом. Стараться придерживаться ооп. Изменяемый размер поля.
//1 версия включает поле и 1 корабль
//2 версия добавляет большее количество кораблей
//3 работаем с архитектурой
//4 версия делает корабли разного размера
//5 версия добавляется игра против кумпьютера

//напоминания. Написать метод возвращающий сообщения из спика рандомно. чтоб сообщение менялось

public class Demo {
    public static void main(String[] args) {

        int size = RequestParameters.parameterRequestInt("Введите размер поля(от 3 до 9)");
        MorskojBoj_1_03 boj = new MorskojBoj_1_03(size);
        GameBoard board = new GameBoard();

        board.createBoardStr();      //обьявление массива
//        board.print();             //отладка
        board.setShip();             //установка корабля по умолчанию
        board.setAnotherShip();      //добавление корабля
//        board.print();             //печать для отладки
        boj.gameBoardStr=board.readyGameBoardReturner();  //передаю массив для игры
//        boj.print();               //печать для отладки
        boj.game();                  //начало игры





    }
}
