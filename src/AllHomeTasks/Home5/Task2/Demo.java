package AllHomeTasks.Home5.Task2;

//Дан массив из N целых чисел и целое число K , найдите количество пар элементов в
// массиве, сумма которых равна K.

public class Demo {
    public static void main(String[] args) {
        ArrayTask2 task2 = new ArrayTask2();

        int n = task2.sizeRequest("введите размер массива N ");
        task2.creator(n);
        int k = task2.sizeRequest("введите целое число K");
        task2.arrayAnalize(k);
    }
}
