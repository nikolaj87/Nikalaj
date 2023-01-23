import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaTest {
    public static void main(String[] args) {

        int num = 0;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            num = random.nextInt(2);
            System.out.println(num);
        }

    }

    }

