package Practice.TaskFromBook1.MorskojBoj;

import java.util.Scanner;

class RequestParameters {
    static int parameterRequestInt(String message){
        boolean flag = true;
        int size = 0;
        while (flag) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextInt();
            for (int i = 3; i <10 ; i++) {
                if (size == i){
                    flag = false;
                }
            }
        }
        return size;
    }

    static String parameterRequestStr(String message, int size){
        String str = "";
        boolean flag = true;
        boolean flag1 = true;
        String mychar1;
        String mychar2;

        while (flag || flag1) {
            char mychar = 'a';
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();
            mychar1 = str.charAt(0) + "";
            mychar2 = str.charAt(1) + "";

            for (int i = 0 ; i <size; i++) {
                String myI = (i+1) + "";
                if(mychar1.equals(mychar+"") && str.length()==2){
                    flag = false;
                }
                if(mychar2.equals(myI) && str.length()==2){
                    flag1 = false;
                }
//                    System.out.println("проход" + i + " чар" + mychar + " " + mychar1 +
//                            " " + mychar + " " + flag + flag1);
                mychar++;
            }
        }
        return str;
    }
}
