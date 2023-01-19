package AllHomeTasks.Home5.Task1;

import java.util.Scanner;

public class ArrayTask1 {

    int[] myArray;

    public void creator(int size) {                               //метод создает массив и наполняет значениями
        myArray = new int[size - 1];                              //
        boolean flag;
        for (int i = 0; i < myArray.length; i++) {                //внешний цикл отвечает за номер элемента
            while (true) {                                        //вайл пытается призначить
                int number = (int) (Math.random() * size + 1);    //случайное число
                flag = false;
                for (int j = 0; j < myArray.length; j++) {        //внутренний фор проверяет нет ли уже такого числа
                    if (myArray[j] == number) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {                                       //если нету
                    myArray[i] = number;                           //то можно его присвоить элементу из внешнего фор
                    break;
                }
            }
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

    int ArrayAnalize() {
        int count = 0;
        for (int i = 1; i <= myArray.length; i++) {  //сложим все итерации цикла 1+2+3+4+5.....
            count = count + i - myArray[i-1];        //и отнимем от этого числа значение всех myArray[i]
        }
        count = count + myArray.length+1;            //добавим последнюю итерацию ведь их больше на чем элементов массива
        return count;
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
