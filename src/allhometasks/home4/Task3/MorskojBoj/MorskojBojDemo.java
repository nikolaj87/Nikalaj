package allhometasks.home4.Task3.MorskojBoj;

//задача. Исспользуя знания полученные за начальный курс написать в консоли игру
//морской бой. Только своим кодом. Стараться придерживаться ооп. Изменяемый размер поля.
//1 версия включает поле и 1 корабль
//2 версия добавляет большее количество кораблей
//3 версия делает корабли разного размера
//4 версия добавляется игра против кумпьютера

//напоминания. Написать метод возвращающий сообщения из спика рандомно. чтоб сообщение менялось

class MorskojBojDemo {
    public static void main(String[] args) {
        GameBoard polozenieKorablia = new GameBoard();
        MorskojBoj_1_02 boj = new MorskojBoj_1_02();

        int size = RequestParameters.parameterRequestInt("Введите размер поля(от 3 до 9)");
        boj.shotToWin = 3; //устанавлеваем счетчик на 3 попадания
        boj.size = size;   //настраиваю размер игры
        boj.gameBoardStrCreator();  //создаю массив
        boj.firstBoardPrint(size);  //печатаю первое поле

        polozenieKorablia.size = size;
        polozenieKorablia.createField();
        polozenieKorablia.setShip(2);        //ставлю первый случайный корабль

        while(true) {                        //ставлю еще корабли по желанию
            boolean newShip = RequestParameters.isAddShip("На поле уже есть корабль! Поставить еще один? Y/N");
            if (!newShip) break;
            if(polozenieKorablia.setAnotherShip(2)) {
                boj.shotToWin = boj.shotToWin + 3;
                System.out.println("корабль № " + boj.shotToWin/3 + " успешно размешен");
            }else System.out.println("не получилось разместить корабль");
        }

        //polozenieKorablia.print();      //выводит готовое поле с кораблями для отладки

        //начинаем игру
        boj.gameBoardInt = polozenieKorablia.boardReturner();
        boj.gameBoardStrCreator();

        boj.game();                       //запуск игры
    }
}
