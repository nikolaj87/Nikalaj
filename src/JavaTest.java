import java.util.Scanner;

public class JavaTest {
    public static void main(String[] args) {
int size=5;
        int x = (int) (Math.random() * size);//3
        int y = (int) (Math.random() * (size - 2));//0
        x=10;
        y=4;
        System.out.println(y+ " " + x);
        x =x+y;
        y= x-y;
        x = x-y;

        System.out.println(y+ " "+ x);
            }
        }
