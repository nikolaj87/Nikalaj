package Practice.TaskFromBook1.MorskojBoj;

import java.util.Random;
import java.util.Scanner;

class RequestParameters {
    public static int gameSize(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
