package Practice.More.MorskojBoj;

class GameBoard extends MorskojBoj_1_03 {

    static int size = MorskojBoj_1_03.size;
    String[][] gameBoardStr = new String[size][size];

    void createBoardStr() {//метод создает стринговое поле и заполняет начальными символами

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoardStr[i][j] = MorskojBoj_1_03.symbol_start;
            }
        }
    }

    void setShip() {   //метод на пустом поле ставит корабль

        int x, y;                                             //обьявляем координаты
        int isVertical = Randomizer.setterVerticalHorizontal();
        if(isVertical==0) {                         //вертикальный или горизонтальный 0 или 1
            x = Randomizer.randomSize();            //первая координата
            y = Randomizer.randomSize_2();          //2я меньше на 2 чтоб не вылетать из массива
                    } else {
            y = Randomizer.randomSize();
            x = Randomizer.randomSize_2();
        }
        setAddShip(x,y,isVertical);                 //ставим корабль по координатам x y
     }

    void setAnotherShip() {           //ставим больше кораблей.
        boolean whileBreaker = true;  //переменная прерывает while
        while (whileBreaker) {        //начинаем цикл
            if (!RequestParameters.isAddShip("Поставить еще корабль? Y/N")) break;
            for (int z = 0; z < 100; z++) {              //цикл for 100 раз попробует поставить корабль
                int x, y;                                //обьявляем координаты
                int isVertical = Randomizer.setterVerticalHorizontal();
                if (isVertical == 0) {                 //вертикальный или горизонтальный 0 или 1
                    x = Randomizer.randomSize();       //первая координата
                    y = Randomizer.randomSize_2();     //2я меньше на 2 чтоб не вылетать из массива
                } else {
                    y = Randomizer.randomSize();
                    x = Randomizer.randomSize_2();
                }
                if (gameBoardAnalyser(x, y, isVertical)) {       //анализируем нет ли рядом корабля
                    setAddShip(x, y, isVertical);                //если нету - размещаем новый
                    MorskojBoj_1_03.shotToWin += 3;              //теперь надо не 3 а 6 попаданий по цели
                    System.out.println("корабль № " + MorskojBoj_1_03.shotToWin / 3 + " успешно размешен");
                    break;                                       //прерываем цикл досрочно чтоб не работать 100 раз
                }
                if (z == 99) {
                    whileBreaker = false;                 //если не удалось поставить корабль 100 раз прерываем цикл while
                    System.out.println("Не удалось разместить корабль");
                    System.out.println("Начинаем игру!");
                }
            }
        }
    }

    void print(){                               //распечатать поле для тестировки и отладки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoardStr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void setAddShip(int x, int y, int isVertical) {
        if (isVertical == 0) {
            gameBoardStr[y][x] = "x";       //процесс размещения
            gameBoardStr[y + 1][x] = "x";   //процесс размещения
            gameBoardStr[y + 2][x] = "x";   //роцесс размещения
        }else{
            gameBoardStr[y][x] = "x";       //размещение горизонтально
            gameBoardStr[y][x + 1] = "x";   //размещение горизонтально
            gameBoardStr[y][x + 2] = "x";   //размещение горизонтально
        }
    }


    boolean gameBoardAnalyser(int x, int y, int isVertical){ //метод гибко проверяет координаты x y массива не
        boolean flag = true;                                 //вылетая за его пределы
        if (isVertical==0) isVertical = -1;                  //третяя переменная отвечает за цикл 3x5 или 5х3
        for (int i = x - 1; i < x + 3 + isVertical; i++) {   //цикл проверит можно ли еще поставить корабль
            if (i < 0) i = 0;                                //если корабль в левом углу то срежем часть массива
            if (i == size) break;                            //если корабль справа то срежем часть массива
            for (int j = y - 1; j < y + 3 - isVertical; j++) { //вложенный цикл для второй координаты
                if (j < 0) j = 0;                             //если корабль вверху то срежем верхнюю строку
                if (j > size - 1) break;                      //если корабль внизу срежем нижнюю строку
                if (gameBoardStr[j][i].equals("x")) {         //проверим не попали ли мы на старый корабль
                    flag = false;                             //флаг если попали на старый
                }
            }
        }
        return flag;
    }

    String[][] readyGameBoardReturner(){
        return gameBoardStr;
    }

}

