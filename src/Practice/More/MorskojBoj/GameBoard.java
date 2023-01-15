package Practice.More.MorskojBoj;

class GameBoard {

    static int size = MorskojBoj_1_03.size;
    static String[][] gameBoardStr = new String[size][size];

    void createBoardStr() {//метод создает стринговое поле и заполняет начальными символами
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoardStr[i][j] = MorskojBoj_1_03.symbol_start;
            }
        }
    }

    void setShip() {   //метод на пустом поле ставит корабль
        int x = (int) (Math.random() * size);       //первая координата
        int y = (int) (Math.random() * (size - 2)); //2я меньше на 2 чтоб не вылетать из массива
        int isShipVertical = (int)(Math.random()*2);//вертикальный или горизонтальный 0 или 1
            if (isShipVertical==0)                  //в том случае если корабль имеет вертикальное расположение
                setVerticalShip(x,y);               //ставим корабль вертикально
            else
                setHorizontalShip(y,x);             //ставим горизонтально
    }

//метод позволяет добавить корабль на поле
    void setAnotherShip() {//ставим больше кораблей. Самая сложная чать кода
        boolean whileBreaker = true;  //переменная прерывает while
        while (whileBreaker) {        //начинаем цикл
            if(!RequestParameters.isAddShip("Поставить еще корабль? Y/N")) break;
            for (int z = 0; z < 100; z++) {                   //цикл for 100 раз попробует поставить корабль
                int x = (int) (Math.random() * size);         //задаем координаты
                int y = (int) (Math.random() * (size - 2));   //вторая меньше, ведь корабль из 3х клеток
                int isShipVertical = (int) (Math.random() * 2); //вертикально или горизонатально

                if (isShipVertical == 0) {//размещаем наш случайный ВЕРТИКАЛЬНЫЙ корабль
                    if (gameBoardAnalyser(x, y, isShipVertical)) {  //анализируем нет ли рядом корабля
                        setVerticalShip(x, y);                      //если нету - размещаем новый
                        MorskojBoj_1_03.shotToWin +=3;              //теперь надо не 3 а 6 попаданий по цели
                        System.out.println("корабль № " + MorskojBoj_1_03.shotToWin/3 + " успешно размешен");
                        break;//прерываем цикл досрочно чтоб не работать 100 раз
                    }
                } else {
                    if (gameBoardAnalyser(y, x, isShipVertical)) {
                        setHorizontalShip(y, x);
                        MorskojBoj_1_03.shotToWin +=3;
                        System.out.println("корабль № " + MorskojBoj_1_03.shotToWin/3 + " успешно размешен");
                        break;
                    }
                }
                if (z == 99) {
                    whileBreaker = false; //если не удалось поставить корабль 100 раз прерываем цикл while
                    System.out.println("Начинаем игру");
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

    void setVerticalShip(int x, int y){
        gameBoardStr[y][x] = "x";       //процесс размещения
        gameBoardStr[y + 1][x] = "x";   //процесс размещения
        gameBoardStr[y + 2][x] = "x";   //роцесс размещения
    }

    void setHorizontalShip(int x, int y){
        gameBoardStr[y][x] = "x";       //размещение горизонтально
        gameBoardStr[y][x + 1] = "x";   //размещение горизонтально
        gameBoardStr[y][x + 2] = "x";   //размещение горизонтально
    }

    boolean gameBoardAnalyser(int x, int y, int isVertical){ //метод гибко проверяет координаты x y массива не
        boolean flag = true;                                 //вылетая за его пределы
        if (isVertical==0) isVertical = -1;                  //третяя переменная отвечает за цикл 3x5 или 5х3
        for (int i = x - 1; i < x + 3 + isVertical; i++) { //цикл проверит можно ли еще поставить корабль
            if (i < 0) i = 0;                              //если корабль в левом углу то срежем часть массива
            if (i == size) break;                          //если корабль справа то срежем часть массива
            for (int j = y - 1; j < y + 3 - isVertical; j++) { //вложенный цикл для второй координаты
                if (j < 0) j = 0;                          //если корабль вверху то срежем верхнюю строку
                if (j > size - 1) break;                   //если корабль внизу срежем нижнюю строку
                if (gameBoardStr[j][i].equals("x")) {      //проверим не попали ли мы на старый корабль
                    flag = false;                           //флаг если попали на старый
                }
            }
        }
        return flag;
    }

    String[][] readyGameBoardReturner(){
        return gameBoardStr;
    }

}

