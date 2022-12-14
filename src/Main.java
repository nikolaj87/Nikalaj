import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cats mycat = new Cats("Tom", true, 0);
        mycat.say("miiiiiiiiiiiiiiy");


        Scanner scan = new Scanner(System.in);
        System.out.println("введите имя кота");
        String name = scan.nextLine();

        System.out.println("это хороший кот?");
        Boolean q = scan.nextBoolean();

        System.out.println("возраст кота?");
        Integer ag = scan.nextInt();

        Cats mycat2 = new Cats(name, q, ag);

        System.out.println(mycat);
        System.out.println(mycat2);
    }
}