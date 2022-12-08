import java.util.Scanner;

//        Дано трехзначное число. Вывести на экран все цифры этого числа по одной

//        Уверен что это решается как-то проще но пока не знаю как..

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите трехзначное число ");
        Integer num1 = scanner.nextInt();

        int a = num1 / 100;
        int b = (num1-a*100)/10;
        int c = (num1-(a*100+b*10));


        System.out.println("1 цифра: " + a);
        System.out.println("2 цифра: " + b);
        System.out.println("3 цифра: " + c);
    }
}