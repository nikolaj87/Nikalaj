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
        boolean flag = true;
        String size = "";
        String test = "";
        while (flag) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextLine();
            for (int i = 3; i <11 ; i++) {
                test = i + "";
                if (size.equals(test)){           //только цифра 3-9 пройдет проверку
                    flag = false;
                }
            }
            if(flag)System.out.println("ошибка ввода с клавиатуры");
        }
        return Integer.parseInt(size);          //возвращаю размер игры в интежер
    }


    static String requestFire(String message, int size){
        String str = "";                 //метод запрашивает ход и примет только букву +цифру
        boolean flag = true;            //флаг для цифры
        boolean flag1 = true;           //флаг для буквы
        String mychar1;
        String mychar2;

        while (flag || flag1) {       //спрашивать пока не будет корректного ввода
            flag = true;
            flag1 = true;
            char mychar = 'a';           //поле универсального размера а значит буду через чар задавать координату
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();         //на всякий случай к нижнему регистру

            if (str.length() == 2) {
                mychar2 = str.charAt(0) + "";   //разбиваю ввод на 2 символа
                mychar1 = str.charAt(1) + "";   //второй символ

                for (int i = 0; i < size; i++) {
                    String myI = (i) + "";   //привожу символ к строке
                    if (mychar1.equals(mychar + "")){   //только буква a b c d... пройдет проверку
                        flag = false;                //упускаем флаг при успехе
                    }
                    if (mychar2.equals(myI)) {    //только цифра пройдет проверку
                        flag1 = false;            //опускаем флаг при успехе
                    }
                    mychar++;  //char приростает. Это для универсальности поля
                }
            }
            if (flag||flag1)System.out.println("ошибка ввода с клавиатуры");
        }
        return str;     //возвращаем проверенную строку в формате 1a
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
