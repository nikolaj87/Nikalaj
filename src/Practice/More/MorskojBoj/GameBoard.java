package Practice.More.MorskojBoj;

class GameBoard {

    int size;
    String[][] gameBoardStr;
    int shipCounter=0;

    void createBoardStr() {//метод создает стринговое поле и заполняет начальными символами
        gameBoardStr = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoardStr[i][j] = "\u00B7";
            }
        }
    }

    void print() {  //распечатать поле для тестировки и отладки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoardStr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void setStandartBoard() {
        setShip(4);
        setShip(3);
        setShip(3);
        setShip(2);
        setShip(2);
        setShip(2);
        setShip(1);
        setShip(1);
        setShip(1);
        setShip(1);
    }

    void setMoreShips() {                 //ставим больше кораблей.
        while (true) {                    //начинаем цикл
            int count = RequestParameters.isAddShip();
            if(count==5) break;
            else setShip(count);
        }
    }

    void setShip(int shipSize) {                     //метод ставит корабль

        for (int z = 0; z < 100; z++) {              //цикл for 100 раз попробует поставить корабль
            int x, y;                                //обьявляем координаты
            int isVertical = Randomizer.setterVerticalHorizontal();
            if (isVertical == 0) {                   //вертикальный или горизонтальный 0 или 1
                x = Randomizer.randomSize(shipSize, size);       //первая координата
                y = Randomizer.randomSize_2(shipSize, size);     //2я меньше на 2(для 3х корабля) чтоб не вылетать из массива
            } else {
                y = Randomizer.randomSize(shipSize, size);
                x = Randomizer.randomSize_2(shipSize, size);
            }
            if (gameBoardAnalyser(x, y, isVertical, shipSize)) {       //анализируем нет ли рядом корабля
                setAddShip(x, y, isVertical, shipSize);                //если нету - размещаем новый
                SeaFight_1_04_user.shotToWin = SeaFight_1_04_user.shotToWin + shipSize;                 //параметр считает необходимое количество попаданий по цели
                shipCounter++;                                         //сколько кораблей поставлено уже
                System.out.println("Корабль " + shipCounter + " успешно!!!");
                break;                                       //прерываем цикл досрочно чтоб не работать 100 раз
            }
            if (z == 99) {
                System.out.println("не удалось разместить корабль");
            }
        }
    }

    void setAddShip(int x, int y, int isVertical, int shipSize) { //метод получает проверенные координаты и
        if (isVertical == 0) {                                    //по ним ставит корабль заданной длины
            for (int i = 0; i < shipSize; i++) {
                gameBoardStr[y + i][x] = "x";
            }
        } else {
            for (int i = 0; i < shipSize; i++) {
                gameBoardStr[y][x + i] = "x";
            }
        }
    }

    boolean gameBoardAnalyser(int x, int y, int isVertical, int shipSize) { //метод гибко проверяет координаты x y
        boolean flag = true;                                               //массива невылетая за его пределы
        int correctLen = 0;              //две переменные корректируют цикл 3x5 (для 3х корабля)
        int correctWid = 0;              //или 5x3 (для 3х корабля)
        if (isVertical == 0) {           // совершаем универсальную проверку или вертикаль или горизонталь
            correctLen = correctLen + (shipSize - 1);
        } else {
            correctWid = correctWid + (shipSize - 1);
        }
        for (int i = x - 1; i < x + 2 + correctWid; i++) {   //цикл проверит можно ли еще поставить корабль
            if (i < 0) i = 0;                                //если корабль в левом столбце то срежем -1 элемент цикла
            if (i == size) break;                            //если корабль в правом столбце то срежем size+1 элемент
            for (int j = y - 1; j < y + 2 + correctLen; j++) { //вложенный цикл для второй координаты
                if (j < 0) j = 0;                             //если корабль вверху то срежем верхнюю строку
                if (j > size - 1) break;                      //если корабль внизу срежем нижнюю строку
                if (gameBoardStr[j][i].equals("x")) {         //проверим не попали ли мы на старый корабль
                    flag = false;                             //флаг если попали на старый
                }
            }
        }
        return flag;
    }

    public GameBoard(int size) {
        this.size = size;
    }

    String[][] readyGameBoardReturner() {
        return gameBoardStr;
    }
}



