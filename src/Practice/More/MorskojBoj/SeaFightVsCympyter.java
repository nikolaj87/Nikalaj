package Practice.More.MorskojBoj;

public class SeaFightVsCympyter {

    String[][] userArray;
    String[][] pcArray;


    void userArrayCreate() {
        myArrayInitialization();
        myArrayPrintToConsole();

    }

    void myArrayInitialization() {
        userArray = new String[10][10];
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray.length; j++) {
                userArray[i][j] = SeaFight_1_04_user.symbol_start;
            }
        }
        //метод строит поле для юзера по его координатам. Но как это сделать наглядно и юзерфрендли?
    }

    void printArr() {
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray.length; j++) {
                System.out.println(userArray[i][j] + " ");
            }
            System.out.println();
        }
        //метод строит поле для юзера по его координатам. Но как это сделать наглядно и юзерфрендли?
    }

    void myArrayPrintToConsole() {

        char mychar = 'a';
        System.out.print("    ");
        for (int k = 0; k < userArray.length; k++) {
            System.out.print(mychar + " ");
            mychar++;
        }
        System.out.println();
        for (int i = 0; i < userArray.length; i++) {
            if (i > 9) {
                System.out.print((i) + "| ");
            } else {
                System.out.print((i) + " | ");
            }
            for (int j = 0; j < userArray.length; j++) {
                if (userArray[i][j].equals("x")) {
                    System.out.print("\u00B7" + " ");
                } else {
                    System.out.print(userArray[i][j] + " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        char mychar2 = 'a';
        System.out.print("    ");
        for (int k = 0; k < userArray.length; k++) {
            System.out.print(mychar2 + " ");
            mychar2++;
        }
        System.out.println();

        for (int m = 0; m < userArray.length; m++) {
            if (m > 9) {
                System.out.print((m) + "| ");
            } else {
                System.out.print((m) + " | ");
            }
            for (int n = 0; n < userArray.length; n++) {
                if (userArray[m][n].equals("x")) {
                    System.out.print("\u00B7" + " ");
                } else {
                    System.out.print(userArray[m][n] + " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }


    void shotPc() {
        //метод принимает выстрел от компьютера.
    }

    void pcShipPosition() {
        // получаем готовое поле оз класса GameBoard. Логика реализована в классе seaFight
    }

    void gameVsPc() {
        //тут будет сам бой
    }

}