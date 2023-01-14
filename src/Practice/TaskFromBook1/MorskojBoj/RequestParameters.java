package Practice.TaskFromBook1.MorskojBoj;

import java.util.Scanner;

class RequestParameters {
    static int parameterRequestInt(String message){
        boolean flag = true;
        String size = "";
        String test = "";
        while (flag) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextLine();
            for (int i = 3; i <10 ; i++) {
                test = i + "";
                if (size.equals(test)){
                    flag = false;
                }
            }
        }
        return Integer.parseInt(size);
    }

    static String parameterRequestStr(String message, int size){
        String str = "";
        boolean flag = true;
        boolean flag1 = true;
        String mychar1;
        String mychar2;

        while (flag || flag1) {
            flag = true;
            flag1 = true;
            char mychar = 'a';
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();

            if (str.length() == 2) {
                mychar2 = str.charAt(0) + "";
                mychar1 = str.charAt(1) + "";

                for (int i = 0; i < size; i++) {
                    String myI = (i + 1) + "";
                    if (mychar1.equals(mychar + "")){
                        flag = false;
                    }
                    if (mychar2.equals(myI)) {
                        flag1 = false;
                    }
//                    System.out.println("проход" + i + " чар" + mychar + " " + mychar1 +
//                            " " + mychar + " " + flag + flag1);
                    mychar++;
                }
            }
        }
        return str;
    }

    static boolean isAddShip (String message){
        boolean yesOrNo = false;
        boolean flag = true;
        String str="";
        while(flag) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str = str.toLowerCase();
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
