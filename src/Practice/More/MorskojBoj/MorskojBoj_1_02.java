package Practice.More.MorskojBoj;

class MorskojBoj_1_02 {

    int size;
    int shotToWin;
    int[][]gameBoardInt;
    String[][]gameBoardStr;

    void gameBoardStrCreator() {     //создаем стринг массив. Второй массив чтоб не выдавать корабли.
        gameBoardStr = new String[size][size];
        for (int i = 0; i < gameBoardStr.length; i++) {
            for (int j = 0; j < gameBoardStr[0].length; j++) {
                gameBoardStr[i][j] = "\u00B7";
            }
        }
    }

    void firstBoardPrint(int size){        //метод распечатывает первый экран
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoardStr[i][j] = "\u00B7"+" ";
                System.out.print(gameBoardStr[i][j]);
            }
            System.out.println();
        }
    }

    void game(){               //метод - игра с пользователем
        int count = 0;
        int fire = 0;
        while (count<shotToWin+1){
            printToConsole();
            if (count == shotToWin) break;
            String x1 = RequestParameters.parameterRequestStr("Делайте ход № " + (fire+1) + " Еще есть вражеские корабли(ль) " +
                    "(например 1A)", size);
            System.out.println(x1);
            int y2 = (x1.charAt(1)-97);
            int x2 = Integer.parseInt(x1.charAt(0) + "")-1;
            fire++;
            if (gameBoardInt[x2][y2] == 1 && gameBoardStr[x2][y2].equals("\u00B7")) {
                count ++;
                gameBoardStr[x2][y2] = "\u25A0";
                if (count == shotToWin) System.out.println("ПОБЕДА!!! За " + fire + " хода(ов)!");
                else System.out.println("Корабль подбит!!! ");
            } else if(gameBoardInt[x2][y2] == 1 && gameBoardStr[x2][y2].equals("\u25A0")){
                System.out.println("Не хитри! Такой ход уже был!!!!!");
            }else {
                System.out.println("мимо");
                gameBoardStr[x2][y2] = "*";
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
        for (int h = 0; h < gameBoardStr.length; h++) {
            System.out.print((h + 1) + " | ");
            for (int g = 0; g < gameBoardStr[0].length; g++) {
                if (gameBoardStr[h][g].equals("*")) {
                } else if (gameBoardStr[h][g].equals("\u25A0")) {
                } else {
                gameBoardStr[h][g] = "\u00B7";
                }
                System.out.print(gameBoardStr[h][g] + " ");
            }
            System.out.print("|");
            System.out.println();
        }

    }
}