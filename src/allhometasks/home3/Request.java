package allhometasks.home3;

import java.util.Scanner;

public class Request {

        public static boolean booleanRequest(String str)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(str);
            return scanner.nextBoolean();
        }

        public static int intRequest(String str){
            Scanner scanner = new Scanner(System.in);
            System.out.println(str);
            return scanner.nextInt();
        }

        public static int intRandom(int min, int max){
            return (int)(Math.random() * ++max) + min;
        }
}
