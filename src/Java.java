import java.util.Scanner;

public class Java {

        String parameterRequestStr(String message, int size){
            String str = "";

            boolean flag = true;
            boolean flag1 = true;
            String mychar1;
            String mychar2;

            char mychar = 'a';

            while (flag || flag1) {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                str = scanner.nextLine();

                str = str.toLowerCase();
                mychar1 = str.charAt(0) + "";
                mychar2 = str.charAt(1) + "";

                System.out.println(str.length());



                for (int i = 0 ; i <size; i++) {

                   if(mychar1.equals(mychar+"") && str.length()==2){
                        flag = false;
                   }
                   if(Integer.parseInt(mychar2)==(i+1) && str.length()==2){
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
