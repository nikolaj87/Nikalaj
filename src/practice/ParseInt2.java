package practice;

import java.util.Scanner;

class ParseInt2 {
    public static void main(String[] args) {
        String str;
        boolean flag;
        int i = 0;

        //do - while
        do metka1:{
            flag = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число и получите х2: ");
            str = scanner.nextLine();
            // чтоб пропустить цифры с + и - проводим проверку
            if (str.charAt(0) == '-'||str.charAt(0) =='+') i++;
            // запускаем цикл посимвольной проверки
            for (; i < str.length(); i++) {
                if (str.charAt(i)=='0'|str.charAt(i)=='1'|str.charAt(i)=='2'|
                        str.charAt(i)=='3'|str.charAt(i)=='4'|str.charAt(i)=='5'|
                        str.charAt(i)=='6'|str.charAt(i)=='7'|str.charAt(i)=='8'|
                        str.charAt(i)=='9'){}
                else flag = true;
                if (flag) break metka1;
            }
        }while(flag);
        System.out.println(Integer.parseInt(str)*2);
    }
}