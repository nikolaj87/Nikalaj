package AllHomeTasks.Home4.Task2;

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArray array1 = new MyArray();
        array1.size = 5;
        array1.arrayCreator();
        System.out.println(array1.toString());

        if(array1.checkMethod())
            System.out.println("массив строго возрастающая последовательность");
        else
            System.out.println("массив НЕ строго_возрастающая последовательность");
    }
}
