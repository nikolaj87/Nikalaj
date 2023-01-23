package allhometasks.home4.Task1;

import java.util.Arrays;

public class MyArray {
    int size;
    int[] myArray = new int[size];

    void arrayCreator(){
        myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Randomizer.randomizer0_50();
        }
    }

    void printArray(String message){
        System.out.println(message);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
    }

    void zeroAdd(){
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0)
                myArray[i] = 0;
        }
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }

    public MyArray(int size) {
        this.size = size;
    }
}
