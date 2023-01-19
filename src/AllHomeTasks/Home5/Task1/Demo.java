package AllHomeTasks.Home5.Task1;

import java.util.Arrays;

// First level: 1. Дан массив размера  N-1, который должен содержать только
// целые числа в диапазоне от 1 до N . Каждое число представлено в одном экземпляре,
// кроме одного числа. Найдите недостающий элемент.


public class Demo {
    public static void main(String[] args) {

        ArrayTask1 task1 = new ArrayTask1();

        int n = task1.sizeRequest("задайте параметр N");
        task1.creator(n);
        System.out.println("Массив размером N - 1: " + Arrays.toString(task1.myArray));
        System.out.println("java считает что недостающая цифра это " + task1.ArrayAnalize());
        }
    }

