package AllHomeTasks.Home5.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask2 {

    int[]myArray;

    void creator(int size) {
        myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random() * 10);
        }
    }

    int sizeRequest(String message) {
        while (true) {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (inputAnalize(str)) {
                return Integer.parseInt(str);
            } else {
                System.out.println("ошибка ввода");
            }
        }
    }

    void arrayAnalize (int number){            //не работает

        System.out.println(Arrays.toString(myArray));
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            int j = i+1;
            for (    ; j < myArray.length; j++) {        //j=i+1 позволяет не сравнивать число само с собой
                if(myArray[j] + myArray[i] == number){   //а также не сравниватьего с теми что слева от него
                    counter++;                           //ведь это сравнение уже было проведено
 //                   System.out.println(i + " " + j);
                }
            }
        }
        System.out.println("ответ: " + counter + " пара(ы) из массива формируют K");
    }

    boolean inputAnalize(String str) {   //проверим ввод пользователя

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            flag = str.charAt(i) != '0' && str.charAt(i) != '1' && str.charAt(i) != '2' &&
                    str.charAt(i) != '3' && str.charAt(i) != '4' && str.charAt(i) != '5' &&
                    str.charAt(i) != '6' && str.charAt(i) != '7' && str.charAt(i) != '8' &&
                    str.charAt(i) != '9';
        }
        return !flag;
    }

}
