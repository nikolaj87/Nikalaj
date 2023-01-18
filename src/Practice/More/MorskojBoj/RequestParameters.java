package Practice.More.MorskojBoj;

import java.util.Scanner;

class RequestParameters {


    static int chooseGame (){ //метод запрашивает во что играем. Примет 1-2-3
        String str="";
        while (true) {
            System.out.println("Приветствую в консольной игре морской бой." +
                    " Вы скажете: \"Этих морских боев уже море зачем нам еще один?\" \n" +
                    "Все просто - отвечу я. Важен не рузультат а процесс.\n" +
                    "Итак выберите игру\n\n" +
                    "1. Игра с компьютером\n" +
                    "2. Игра с собой 10х10 стандартный Set кораблей\n" +
                    "3. Игра с собой. Я сам настрою поле.");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();       //на всякий случай к нижнему регистру
            if(str.equals("1") || str.equals("2")|| str.equals("3")){
                return Integer.parseInt(str);
            } else
                System.out.println("ошибка ввода");
        }
    }


//    static Boolean isPlayVsPc(){ //метод примет Y N вернет true false
//        String str="";
//        while(true) {
//            System.out.println("Играем против компьютера? Y Или сам с собой? N");
//            Scanner scanner = new Scanner(System.in);
//            str = scanner.nextLine();
//            str = str.toLowerCase();
//            if (str.equals("y")) {
//                return true;
//            } else if (str.equals("n")) {
//                return false;
//            } else {
//                System.out.println("ошибка ввода с клавиатуры");
//            }
//        }
//    }

//    static boolean isStandartGame (){ //метод примет только Y N
//        String str="";
//        while(true) {
//            System.out.println("поставить стандартный набор кораблей?(Y) " +
//                    "или настроить игровое поле(N)");
//            Scanner scanner = new Scanner(System.in);
//            str = scanner.nextLine();
//            str = str.toLowerCase();
//            if (str.equals("y")) {
//                return true;
//            } else if (str.equals("n")) {
//                return false;
//            } else {
//                System.out.println("ошибка ввода с клавиатуры");
//            }
//        }
//
//    }

    static int parameterRequestInt(String message){//метод просит размер игры и тестирует ввод
        String size = "";
        while (true) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextLine();
            for (int i = 3; i <11 ; i++) {
                if (size.equals(i+"")){           //только цифра 3-9 пройдет проверку
                    return Integer.parseInt(size);
                }
            }
            System.out.println("ошибка ввода с клавиатуры");
        }
    }


    static String requestFire(String message, int size){

                            //метод запрашивает ход и примет только букву +цифру
        while (true) {       //спрашивать пока не будет корректного ввода
            char mychar;           //поле универсального размера а значит буду через чар задавать координату
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            str = str.toLowerCase();         //на всякий случай к нижнему регистру
            for (int i = 0; i < size; i++) {
                String test = i + "";
                mychar = 'a';
                for (int j = 0; j < size; j++) {
                    test +="" + mychar;
                    mychar++;
                    if (str.equals(test)) {
                        return str;
                     }
                    test = test.charAt(0)+"";
                }
            }
            System.out.println("ошибка ввода с клавиатуры " + str);
        }
    }


    static int isAddShip (){ //метод спрашивает Y/N и примет только корректный ввод
        String str="";
        while (true) {
            System.out.println("Какой корабль поставить? (1-2-3-4). Выход - Q");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();       //на всякий случай к нижнему регистру
        if(str.equals("1") || str.equals("2")|| str.equals("3")|| str.equals("4")){
            return Integer.parseInt(str);
            }
        else if(str.equals("q")){
            return 5;
        }
        else
            System.out.println("ошибка ввода");
        }
    }

}
