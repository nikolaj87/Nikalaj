package Practice.TaskFromBook1.MorskojBoj;

import java.util.Scanner;

class RequestParameters {
    static int parameterRequestInt(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String parameterRequestStr(String message, int size){
        String str = "";
        boolean flag = true;
        while(flag) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();




        }
        return str;
    }

}
