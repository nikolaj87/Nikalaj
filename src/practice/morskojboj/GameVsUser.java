package practice.morskojboj;

public class GameVsUser {

    static String symbol_start = "\u00B7";
    static String symbol_empty = "*";
    static String symbol_ataked = "X";
    static String symbol_destroyed = "\u25A0";
    static int shotToWin = 20;

    void gameVsUser() {

        int counter = 0;
        while (shotToWin > 0) {
            printToConsole();
            counter++;
            String str = RequestParameters.requestShot("делайте выстрел № " + counter, GameBoard.boardSize);
            str = interpretateUserShot(str);
            analizeShot(Integer.parseInt(str.substring(0,1)), Integer.parseInt(str.substring(1,2)));
        }
        printToConsole();
        System.out.println("победа за " + counter + " ходов");
    }

    String interpretateUserShot(String str){

        String first = str.substring(0,1);
//        first = String.valueOf(Integer.parseInt(first));
        int second = (str.charAt(1) - 97);
        str = first + second;
        return str;
    }

    void analizeShot(int row, int column) {

        boolean flag = false;
        for (int i = 0; i < GameBoard.ships.length; i++) {
            for (int j = 0; j < GameBoard.ships[i].location.length; j++) {

                if (GameBoard.ships[i].location[j].x == column &&
                GameBoard.ships[i].location[j].y == row) {

                    flag = true;
                    GameBoard.ships[i].shotToDestroy -= 1;
                    GameBoard.ships[i].location[j].x -= 100;
                    shotToWin--;
                    if (GameBoard.ships[i].shotToDestroy > 0) {
                        System.out.println("ранен");
                        GameBoard.gameBoard[row][column] = symbol_ataked;
                    } else {
                        System.out.println("убит");
                        GameBoard.gameBoard[row][column] = symbol_destroyed;
                        destroyedAutoFill(GameBoard.ships[i].location[0].y, GameBoard.ships[i].location[0].x + 100,
                                GameBoard.ships[i].isVertical, GameBoard.ships[i].size);
                    }
                }
            }
        }
        if (GameBoard.gameBoard[row][column].equals(symbol_ataked) ||
                GameBoard.gameBoard[row][column].equals(symbol_destroyed)) {
            flag = true;
        }
        if(!flag) {
            GameBoard.gameBoard[row][column] = symbol_empty;
            System.out.println("мимо");
        }
    }

    void printToConsole() {       //метод печатаем поле в консоль
        char mychar = 'a';
        System.out.print("    ");
        for (int k = 0; k < GameBoard.gameBoard.length; k++) {
            System.out.print(mychar + " ");
            mychar++;
        }
        System.out.println();
        for (int i = 0; i < GameBoard.gameBoard.length; i++) {
            System.out.print((i) + " | ");
            for (int j = 0; j < GameBoard.gameBoard[0].length; j++) {
                if (GameBoard.gameBoard[i][j].equals("x")) {
                    System.out.print(symbol_start + " ");
                } else {
                    System.out.print(GameBoard.gameBoard[i][j] + " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    void destroyedAutoFill(int y, int x, int isVertical, int shipSize) {
//метод автоматически заполняет пространство вокруг уничтоженного корабля
        int correctLen = 0;
        int correctWid = 0;
        if (isVertical == 0) {  //вертикальный
            correctLen = correctLen + (shipSize - 1);
        } else {                //горизонтальный
            correctWid = correctWid + (shipSize - 1);
        }
        for (int i = x - 1; i < x + 2 + correctWid; i++) {
            if (i < 0) continue;
            if (i == 10) break;
            for (int j = y - 1; j < y + 2 + correctLen; j++) {
                if (j < 0) continue;
                if (j > 10 - 1) break;
                if(GameBoard.gameBoard[j][i].equals(symbol_start)) {
                    GameBoard.gameBoard[j][i] = symbol_empty;
                }
                if(GameBoard.gameBoard[j][i].equals(symbol_ataked)){
                    GameBoard.gameBoard[j][i] = symbol_destroyed;
                }
            }
        }
    }

}
