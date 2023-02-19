package practice.lotery;

import java.util.Scanner;

 class Requests {

    static String userNameRequest(){
        System.out.println("Заполните лотерейный билет: \n Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int numberRequest(String message) {
        while (true) {
            System.out.println(message);
            int input = 0;
            Scanner scanner = new Scanner(System.in);
            try {
                input = scanner.nextInt();
            } catch (Throwable exp) {
                System.out.println("пробуем еще раз");
            }
            if (input > 0) {
                return input;
            }
        }
    }

}
