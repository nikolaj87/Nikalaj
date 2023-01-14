package Practice.More.MorskojBoj;

import java.util.Scanner;

class RequestParameters {
    static int parameterRequestInt(String message){//метод просит размер игры и тестирует ввод
        boolean flag = true;
        String size = "";
        String test = "";
        while (flag) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextLine();
            for (int i = 3; i <10 ; i++) {
                test = i + "";
                if (size.equals(test)){           //только цифра 3-9 пройдет проверку
                    flag = false;
                }
            }
        }
        return Integer.parseInt(size);          //возвращаю размер игры в интежер
    }

    static String parameterRequestStr(String message, int size){
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
                    String myI = (i + 1) + "";   //привожу символ к строке
                    if (mychar1.equals(mychar + "")){   //только буква a b c d... пройдет проверку
                        flag = false;                //упускаем флаг при успехе
                    }
                    if (mychar2.equals(myI)) {    //только цифра пройдет проверку
                        flag1 = false;            //опускаем флаг при успехе
                    }
//                    System.out.println("проход" + i + " чар" + mychar + " " + mychar1 +
//                            " " + mychar + " " + flag + flag1);
                    mychar++;  //char приростает. Это для универсальности поля
                }
            }
        }
        return str;     //возвращаем проверенную строку в формате 1a
    }

    static boolean isAddShip (String message){ //метод спрашивает Y/N и примет только корректный ввод
        boolean yesOrNo = false;
        boolean flag = true;
        String str="";
        while(flag) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();              //на всякий случай к нижнему регистру
            if (str.equals("y")) {
                yesOrNo = true;
                flag = false;
            } else if (str.equals("n")) {
                yesOrNo = false;
                flag = false;
            } else
                flag = true;
        }
        return yesOrNo;
    }

}
