package allhometasks.home4.Task2;

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArray array1 = new MyArray(5);
        array1.arrayCreator();
        System.out.println(array1.toString());

        if(array1.checkMethod())
            System.out.println("массив строговозрастающая последовательность, " +
                    "вероятность чего бесконечно близится к нолю в данной задаче :-)");
        else
            System.out.println("массив НЕ строговозрастающая последовательность");
    }
}
