package Practice.More.MorskojBoj;

class MorskojBoj_1_03 {

    String[][]gameBoardStr;
    static int size;
    static int shotToWin = 3;
    static String symbol_start = "\u00B7";
    static String symbol_empty = "*";
    static String symbol_ataked = "\u25A0";

    void game(){               //метод - игра с пользователем
        int count = 0;
        int fire = 0;
        while (count<shotToWin+1){
            printToConsole();
            if (count == shotToWin) break;
            //получаем координаты выстрела x y
            String userAtak = RequestParameters.parameterRequestStr("Делайте ход № " + (fire+1) + " Еще есть вражеские корабли(ль) " +
                    "(например 1A)", size);
            int y = (userAtak.charAt(1)-97);
            int x = Integer.parseInt(userAtak.charAt(0) + "")-1;

            fire++;
            if (gameBoardStr[x][y].equals("x")) {
                count ++;
                gameBoardStr[x][y] = symbol_ataked;
                if (count == shotToWin) System.out.println("ПОБЕДА!!! За " + fire + " хода(ов)!");
                else System.out.println(Messanger.messageReturnerGoal());
            } else if(gameBoardStr[x][y].equals(symbol_ataked)){
                System.out.println(Messanger.messageReturnerAgain());
            }else {
                System.out.println(Messanger.messageReturnerMimo());
                gameBoardStr[x][y] = symbol_empty;
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
            if (i>=9){System.out.print((i + 1) + "| ");}
            else{System.out.print((i + 1) + " | ");}
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

    MorskojBoj_1_03(int size) {
        this.size = size;
    }

    MorskojBoj_1_03() {
    }

    void print(){                               //распечатать поле для тестировки и отладки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoardStr[i][j] + " ");
            }
            System.out.println();
        }
    }
}