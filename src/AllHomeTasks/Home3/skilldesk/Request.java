package AllHomeTasks.Home3.skilldesk;

import java.util.Scanner;

public class Request {

        public static boolean booleanRequest(String str)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(str);
            boolean isTrue = scanner.nextBoolean();
            return isTrue;
        }

        public static int intRequest(String str){
            Scanner scanner = new Scanner(System.in);
            System.out.println(str);
            int number = scanner.nextInt();
            return number;
        }

        public static int intRandom(int min, int max){
            double number = (Math.random() * ++max) + min;
            return (int)number;

        }
}
