package AllHomeTasks.HomeTaskSkill2;
import java.util.Scanner;

class Hometask3_2 {
    public static void main(String[] args) {
//        Реализовать программу, выводящую на экран результаты сложения, вычитания, умножения и деления
//        двух чисел. Каждая из арифметических операций должна быть реализована как отдельный метод

        Scanner scan = new Scanner(System.in);
        System.out.println("введите целое число");
        Integer num1 = scan.nextInt();

        System.out.println("введите еще одно целое число");
        Integer num2 = scan.nextInt();

        if (num2==0) {
            System.out.println("замените 0 на другое число");
            num2 = scan.nextInt();
        }
        multi(num1,num2);
        minys(num1,num2);
        plus(num1,num2);
        div(num1,num2);


    }
    static void multi(int x,int y){
        System.out.println("умножение " + x*y);
    }
    static void minys(int x, int y){
        System.out.println("разница " + (x-y));
    }
    static void plus(int x, int y){
        System.out.println("сложение " + (x+y));
    }
    static void div(double x, double y){
        System.out.println("деление " + x/y);
    }
}
