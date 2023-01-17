package AllHomeTasks.Home4.Task2;

import java.util.Arrays;

public class StringEquals {
    public static void main(String[] args) {

        String[] mystring = new String[1];
        mystring [0] = "bobek";
//------------------------------------------------
        String[] mystring2 = new String[1];
//------------------------------------------------
        String str = new String (mystring[0]);

        mystring2 [0] = str;
//-------------------------------------------

        if(mystring[0] == mystring2 [0])
            System.out.println("таже ссылка");
        else
            System.out.println("другая ссылка");
        System.out.println();




        System.out.println(Arrays.toString(mystring));
        System.out.println(Arrays.toString(mystring2));
            }
        }
