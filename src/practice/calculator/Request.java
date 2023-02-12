package practice.calculator;

import java.util.Scanner;

public class Request {

    static double requestDouble(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextDouble();
    }

    static String requestOperator(String message) {
        String str;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println(message);
            str = scan.nextLine();
            if (test(str)){
                break;
            }
            else
                System.out.println("некорректно ");
        }
        return str;
    }

    static boolean test(String str){
        char myChar = str.charAt(0);
        return myChar == '+' || myChar == '-' || myChar == '/' || myChar == '*';
    }
}
