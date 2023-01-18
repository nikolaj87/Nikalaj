package Practice.More.MorskojBoj;

class SeaFight_1_04_user {

    public int size;
    String[][]gameBoardStr = new String[size][size];

    static int shotToWin = 0;
    static String symbol_start = "\u00B7";
    static String symbol_empty = "*";
    static String symbol_ataked = "X";
    static String symbol_destroyed = "\u25A0";

    void game(){               //метод - игра с пользователем
        int count = 0;
        int fire = 0;
        while (count<shotToWin+1){
            printToConsole();
            if (count == shotToWin) break;
            //получаем координаты выстрела x y
            String userAtak = RequestParameters.requestFire("Делайте ход № " + (fire+1) + " Еще есть вражеские корабли(ль) " +
                    "(например 0A)", size);
            int x = (userAtak.charAt(1)-97);
            int y = Integer.parseInt(userAtak.charAt(0) + "");

            fire++;
            if (gameBoardStr[y][x].equals("x")) {      //если юзер угадал координату надо проверить это убитый корабль
                count++;
                gameBoardStr[y][x] = "temp";
                if(gameBoardAnalyser(x, y)){
                    gameBoardStr[y][x] = symbol_ataked;
                    System.out.println(Messanger.messageReturnerGoal());
                } else {
                    gameBoardStr[y][x] = symbol_destroyed;
                    System.out.println("КОРАБЛЬ УНИЧТОЖЕН!!!");
                }

                if (count == shotToWin) {
                    System.out.println("ПОБЕДА!!! За " + fire + " хода(ов)!");
                }

            } else if(gameBoardStr[y][x].equals(symbol_ataked) || gameBoardStr[y][x].equals(symbol_destroyed)){
                System.out.println(Messanger.messageReturnerAgain());
            } else {
                System.out.println(Messanger.messageReturnerMimo());
                gameBoardStr[y][x] = symbol_empty;
            }
        }
    }

    void printToConsole() {       //метод печатаем поле в консоль
        char mychar = 'a';
        System.out.print("    ");
        for (int k = 0; k < gameBoardStr.length; k++) {
            System.out.print(mychar + " ");
            mychar++;
        }
        System.out.println();
        for (int i = 0; i < gameBoardStr.length; i++) {
            if (i>9){System.out.print((i) + "| ");}
            else{System.out.print((i) + " | ");}
            for (int j = 0; j < gameBoardStr[0].length; j++) {
                if (gameBoardStr[i][j].equals("x")) {
                    System.out.print(symbol_start + " ");
                } else {
                    System.out.print(gameBoardStr[i][j] + " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

       public SeaFight_1_04_user(int size) {
        this.size = size;
    }

    void print1(){                               //распечатать поле для тестировки и отладки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoardStr[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean gameBoardAnalyser(int x, int y) { //метод гибко проверяет координаты x y
        boolean flag = false;                                               //массива невылетая за его пределы
        for (int i = x - 1; i < x + 2; i++) {   //цикл проверит можно ли еще поставить корабль
            if (i < 0) i = 0;                                //если корабль в левом столбце то срежем -1 элемент цикла
            if (i == size) break;                            //если корабль в правом столбце то срежем size+1 элемент
            for (int j = y - 1; j < y + 2; j++) { //вложенный цикл для второй координаты
                if (j < 0) j = 0;                             //если корабль вверху то срежем верхнюю строку
                if (j == size) break;                      //если корабль внизу срежем нижнюю строку
                if (gameBoardStr[j][i].equals("x")) {         //проверим не попали ли мы на старый корабль
                    flag = true;                             //флаг если попали на старый
                    break;
                }
            }
        }
        return flag;
    }

}