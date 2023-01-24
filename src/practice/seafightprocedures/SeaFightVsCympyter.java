package practice.seafightprocedures;

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
                userArray[i][j] = SeaFightUser.symbol_start;
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


        System.out.print("    ");
        char mychar = 'a';
        for (int k = 0; k < userArray.length; k++) {

            System.out.print(mychar + " ");
            mychar++;
        }
        System.out.print("                        ");
        mychar = 'a';
        for (int k = 0; k < userArray.length; k++) {

            System.out.print(mychar + " ");
            mychar++;
        }
        //=======================================================
        System.out.println();
        for (int i = 0; i < userArray.length; i++) {
            if (i > 9) {
                System.out.print((i) + "| ");
            } else {
                System.out.print((i) + " | ");
            }
            //-------------------------------------
            for (int j = 0; j < userArray.length; j++) {
                if (userArray[i][j].equals("x")) {
                    System.out.print("\u00B7" + " ");
                } else {
                    System.out.print(userArray[i][j] + " ");
                }
            }
            System.out.print("|                   " + i + " | ");

            for (int j = 0; j < userArray.length; j++) {
                System.out.print("\u00B7" + " ");

            }
            System.out.print("|");

            System.out.println();
        }
        //=====================================================
        System.out.println("На этапе реализации");
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