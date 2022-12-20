package Practice;

import java.util.Scanner;

class ParseInt2 {
    public static void main(String[] args) {
        String str, str2 ="";
        Integer i, result;
        Boolean flag;
        //do - while
        do {
            flag = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число и получите х2: ");
            str = scanner.nextLine();
// целый час не мог понять почему не работает логическое или || нужен именно equals
            for (i = 0; i < str.length(); i++) {
                    str2 = str.charAt(i) + "";
                if (str2.equals("0")|str2.equals("1")|str2.equals("2")|
                        str2.equals("3")|str2.equals("4")|str2.equals("5")|
                        str2.equals("6")|str2.equals("7")|str2.equals("8")|
                        str2.equals("9")){
                }else flag = true; break;
            }
        }while(flag);
        System.out.println(Integer.parseInt(str)*2);
    }
}
