package Practice;

import java.util.Scanner;

class ParseInt {
    public static void main(String[] args) {
        // получить на входе строку-число и если это число то сделать парсинт
        // а если там есть лишние символы то снова запросить строку - число

        Integer res;
        String str1;
        Boolean flag;
        // в эту строку можно дописать лубых символов любого языка для проверки
        String counter = "qwertyuiop[]asdfghjkl;'zxcvbnm,./!@#$%^&*()_-=\"\t\'" +
                "йцукенгшщзхъфывапролджэячсмитьбю.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число и получите х2 ");
        do  {       //исспользуем do while чтоб пройти хотяб 1 раз по циклу

            flag = false;
            str1 = scanner.nextLine();
            str1 = str1.toLowerCase();         //приводим к нижнему регистру
            for (int i = 0; i < counter.length(); i++) { //цикл подставляет значения
                String str2 = counter.charAt(i) + "";
                if (str1.contains(str2)) {flag = true; break;}
            }
            if (!flag) {
                res = Integer.parseInt(str1);
                System.out.println(res * 2);
            } else System.out.println("введите корректное число и получите x2 ");
        } while (flag==true);
    }
}
