package Practice.More.MorskojBoj;

import java.util.Scanner;

class RequestParameters {


    static int chooseGame (){ //метод запрашивает во что играем. Примет 1-2-3

        while (true) {
            System.out.println("Приветствую в консольной игре морской бой." +
                    " Вы скажете: \"Этих МОРСКИХ БОЕВ уже море зачем нам еще один?\" \n" +
                    "Все просто - отвечу я. Важен не рузультат, а процесс.\n" +
                    "Итак выберите игру\n\n" +
                    "1. Игра с компьютером\n" +
                    "2. Игра с собой 10х10 стандартный Set кораблей\n" +
                    "3. Игра с собой. Я сам настрою поле.");
            String str = requestStr();
            if (Analizators.strTester1to3(str)) {
                return Integer.parseInt(str);
            } else {
                System.out.println("ошибка ввода");
            }
        }
    }

    static int parameterRequestInt(String message){//метод просит размер игры и тестирует ввод

        while (true) {
            System.out.println("введите размерполя от 3 до 10");
            String size = requestStr();
            if (Analizators.strTester3to10(size)) {
                return Integer.parseInt(size);
            } else {
                System.out.println("ошибка ввода с клавиатуры");
            }
        }
    }


    static String requestFire(String message, int size){

                            //метод запрашивает ход и примет только букву +цифру
        while (true) {       //спрашивать пока не будет корректного ввода
            System.out.println(message);
            String str = requestStr();
            if (Analizators.shotInputAnalize(str, size)) {
                return str;
            } else {
                System.out.println("ошибка ввода с клавиатуры " + str);
            }
        }
    }


    static int isAddShip (){ //метод спрашивает Y/N и примет только корректный ввод
        while (true) {
            System.out.println("Какой корабль поставить? (1-2-3-4). Выход - Q");
            String str = requestStr();
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

    static String requestStr(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        return str;
    }
}
