package AllHomeTasks.Home4.Task2;

import java.util.Arrays;

class MyArray {
    int size;
    int[] myArray = new int[size];

    void arrayCreator(){
        myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
             myArray[i] = Randomizer.randomizer10_99();
        }
    }

//    void printArray(String message){
//        System.out.println(message);
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print(myArray[i]+" ");
//        }
//        System.out.println();
//    }

    boolean checkMethod(){
        int counter = 0;
        for (int i = 0; i < size - 1; i++) {
            if (myArray[i]<myArray[i+1])
                counter++;
            }
        return counter == size - 1;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
}
