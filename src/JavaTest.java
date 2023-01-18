import java.util.Arrays;
import java.util.Scanner;

public class JavaTest {
    public static void main(String[] args) {
        System.out.println("\u06F5");
        String[] array = new String[5];
        array[0] = "bibic";
        String[] array2 = new String[4];

        array2[0] = new String(array[0]);

        System.out.println(array2[0]);
        if (array2[0]==array[0])
            System.out.println("одна ссылка");
        else
            System.out.println("разные ссылки");

        if (array2[0].equals(array[0]))
            System.out.println("equals");
        else System.out.println("not equals");
    }
}
