package Practice;

import java.util.Scanner;

public class KamenNoznicy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Давай сыграем в камень ножницы бумага. Введите ваш выбор" +
                "\n1 камень " +
                "\n2 ножницы" +
                "\n3 бумага");
        Double choise = scanner.nextDouble();

        Double casino = Math.random();

        if (casino < 0.33 & choise == 1)
            System.out.println("бумага накрывает ваш камень");
        else if (casino < 0.33 & choise == 2)
            System.out.println("бумага проиграла вашим ножницам");
        else if (casino < 0.33 & choise == 3)
            System.out.println("бумага и бумага это ничья");

        else if (casino >= 0.33 & casino < 0.66 & choise == 1)
            System.out.println("ваш камень победил ножницы");
        else if (casino >= 0.33 & casino < 0.66 & choise == 2)
            System.out.println("ножницы ножницы - ничья!");
        else if (casino >= 0.33 & casino < 0.66 & choise == 3)
            System.out.println("ваша бумага проиграла ножницам");

        else if (casino >= 0.66 & choise == 1)
            System.out.println("камень и камень ничья");
        else if (casino >= 0.66 & choise == 2)
            System.out.println("ваши ножницы проиграли камню");
        else if (casino >= 0.66 & choise == 3)
            System.out.println("ваша бумага победила камень");

    }
}