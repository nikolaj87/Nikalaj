package practice.morskojboj;

import java.util.Scanner;

class RequestParameters {

    static String requestShot(String message, int size){

                            //метод запрашивает ход и примет только букву +цифру
        while (true) {       //спрашивать пока не будет корректного  ввода
            System.out.println(message);
            String str = requestStr();
            if (shotInputAnalize(str, size)) {
                return str;
            } else {
                System.out.println("ошибка ввода с клавиатуры " + str);
            }
        }
    }

    static String requestStr(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        return str;
    }

    static boolean shotInputAnalize(String str, int size) {
        char mychar;
        for (int i = 0; i < size; i++) {
            String test = String.valueOf(i);
            mychar = 'a';
            for (int j = 0; j < size; j++) {
                test += mychar;
                mychar++;
                if (str.equals(test)) {
                    return true;
                }
                test = String.valueOf(test.charAt(0));
            }
        }
        return false;
    }
}
