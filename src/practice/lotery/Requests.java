package practice.lotery;

import java.util.Scanner;

 class Requests {

    static String userNameRequest(){
        System.out.println("Заполните лотерейный билет: \n Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int numberRequest(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
