package AllHomeTasks.Home4.Task1;

class MyArrayDemo {
    public static void main(String[] args) {

        MyArray array1 = new MyArray(5);
        array1.arrayCreator();
        array1.printArray("массив рандомных чисел от 1 до 50 ");
        array1.zeroAdd();
        array1.printArray("нечетные номера заменены на 0");
//        System.out.println(array1.toString());
    }
}
