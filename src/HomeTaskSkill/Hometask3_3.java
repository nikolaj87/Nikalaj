package HomeTaskSkill;

import java.util.Scanner;

// реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США

class Hometask3_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("введите сумму в евро");
        Integer num1 = scan.nextInt();

        exchange(num1);

    }
    static void exchange(int sum){
        System.out.println("это " + sum*1.0644 + " доллар(ов)");
    }
}
