package Practice.TaskFromBook1.MorskojBoj;

import java.lang.ref.Reference;
import java.util.Scanner;

public class Boj {
public void morskojBoj(int[][] array){

    int count = 0;
    int i = 0; int j = 0;
    String[][] myarray2 = new String[4][4];
    for (i = 0; i < myarray2.length; i++){
        for (j = 0; j < myarray2[0].length; j++){
            myarray2[i][j] = ".";
            System.out.print(myarray2[i][j]+" ");
        }
        System.out.println();
    }
    do {
        //сделаем визуальную картинку
//        String[][] myarray2 = new String[3][3];
        int g = 0;
        int h = 0;
        for (g = 0; g < myarray2.length; g++){
           for (h = 0; h < myarray2[0].length; h++){
            if (myarray2[g][h].equals("*")){
            }else if(myarray2[g][h].equals("X")) {

            }else {
                myarray2[g][h] = ".";
            }
//            myarray2[i][j] = ".";
                System.out.print(myarray2[g][h]+" ");
        }
        System.out.println();
    }

    int[][] myarray = array;
    Scanner scaner2 = new Scanner(System.in);
    System.out.println("введите x");
    int x = scaner2.nextInt();
    System.out.println("введите y");
    int y = scaner2.nextInt();
    myarray2[x][y] = "*";
    //проверяем ход
            if (myarray[x][y] == 1) {
            count ++;
            myarray2[x][y] = "X";
            if (count == 3) System.out.println("убит");
            else System.out.println("ранен");
            }
            else System.out.println("мимо");
            }while (count<3);
//    for (int i = 0; i < myarray.length; i++) {
//        for (int j = 0; j < myarray[0].length; j++) {
//            System.out.print(myarray[i][j]+" ");
//        }
//        System.out.println();
//    }

}
}
