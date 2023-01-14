package Practice.More.MorskojBoj;

import java.util.Random;

class GameBoard {
    int[][] gameBoard;
    int size;

    void createField() {
        gameBoard = new int[size][size];
    }

    void setShip(int shipSize) {   //метод на пустом поле ставит корабль
        int x = (int) (Math.random() * size);   //первая координата
        int y = (int) (Math.random() * (size - 2));  //2я меньше на 2 чтоб не вылетать из массива
        //в том случае если корабль имеет вертикальное расположение
        Random isShipVertical = new Random(); //создадим рандом
            if (isShipVertical.nextBoolean()) {//размещаем наш случайный ВЕРТИКАЛЬНЫЙ корабль
            gameBoard[y][x] = 1;       //процесс размещения
            gameBoard[y + 1][x] = 1;   //процесс размещения
            gameBoard[y + 2][x] = 1;   //роцесс размещения
        } else {//горизонтальный корабль. Меняем x y чтоб не выпасть из массива
            x = x+y;  y = x-y; x = x-y;  //поменяем x и y местами чтоб не вылатеть за массив
            gameBoard[y][x] = 1;       //размещение горизонтально
            gameBoard[y][x + 1] = 1;   //размещение горизонтально
            gameBoard[y][x + 2] = 1;   //размещение горизонтально
        }
    }
//метод пытается поставить на поле рандомным образом корабль 100 раз
    boolean setAnotherShip(int setAnotherShipSize) {//ставим больше кораблей. Самая сложная чать кода
        int x = 0;  //обьявляем координаты
        int y = 0;
        boolean flag = false; //флаг скажет о успехе выполнения метода или неудаче
        for (int z = 0; z < 100; z++) {//попробуем 100 раз поставить корабль или вертикально или горизонтально на выбор
            flag = false;
            x = (int) (Math.random() * size);         //задаем координаты
            y = (int) (Math.random() * (size - 2));   //вторая меньше, ведь корабль из 3х клеток

            Random isShipVertical = new Random();
            if (isShipVertical.nextBoolean()) {//размещаем наш случайный ВЕРТИКАЛЬНЫЙ корабль
                //пишем гибкий цикл фор который будет откидывать значения выходящие за массив
                for (int x1 = x - 1; x1 < x + 2; x1++) { //цикл проверит можно ли еще поставить корабль
                    if (x1 < 0) x1 = 0;                  //если корабль в левом углу то срежем часть массива
                    if (x1 == size) break;               //если корабль справа то срежем часть массива
                    for (int y1 = y - 1; y1 < y + 4; y1++) { //вложенный цикл для второй координаты
                        if (y1 < 0) y1 = 0;                 //если корабль вверху то срежем верхнюю строку
                        if (y1 > size - 1) break;           //если корабль внизу срежем нижнюю строку
                        if (gameBoard[y1][x1] == 1) {      //проверим не попали ли мы на старый корабль
                            flag = true;                   //однять флаг если попали на старый
                        }
                    }                       //конец внутреннего цикла
                }                           //конец внешнего цикла
                if (!flag) {                //если флаг опущен то успех и можно поставить корабль по проверенным координатам
                    gameBoard[y][x] = 1;     //ставим корабль
                    gameBoard[y + 1][x] = 1;
                    gameBoard[y + 2][x] = 1;
                    break;                    //прерываем цикл досрочно чтоб не работать 100 раз
                }
            } else {//все тоже самое только для горизонтального расположения
                x = x+y;  y = x-y; x = x-y;   //меняем x и y местами
                for (int  x1 = x - 1; x1 < x + 4; x1++) {
                    if (x1 < 0) x1 = 0;
                    if (x1 == size) break;
                    for (int y1 = y - 1; y1 < y + 2; y1++) {
                        if (y1 < 0) y1 = 0;
                        if (y1 > size - 1) break;
                        if (gameBoard[y1][x1] == 1) {
                            flag = true;
                        }
                    }
                }
                if (!flag) {
                    gameBoard[y][x] = 1;
                    gameBoard[y][x+1] = 1;
                    gameBoard[y][x+2] = 1;
                    break;
                }
            }
        }
        return !flag;                         //заявляем что метод успешно отработал
    }

    int[][] boardReturner(){
        return gameBoard;
    }

    void print(){                               //распечатать поле для тестировки и отладки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println();
        }

    }
}

