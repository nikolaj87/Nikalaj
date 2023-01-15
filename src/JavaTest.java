import java.util.Arrays;
import java.util.Scanner;

public class JavaTest {
    public static void main(String[] args) {

        String[] mystring = new String[5];
        mystring [0] = "bobek";
        mystring [1] = "tyzek";
        mystring [2] = "kunlao";
        mystring [3] = "pes";

        String[] mystring2 = new String[4];

        String str = new String (mystring[0]);

        mystring2 [0] = str;

        if(mystring[0] == mystring2 [0])
            System.out.println("таже ссылка");
        else
            System.out.println("другая ссылка");




        System.out.println(Arrays.toString(mystring));
        System.out.println(Arrays.toString(mystring2));
            }
        }
