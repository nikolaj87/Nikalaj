package javatasks.march_6_2023;

import java.util.Arrays;

public class FillArrayBothSides {

    public static void main(String[] args) {

        int[] array = new int[21];
        int i = 0;
        int j = array.length - 1;

        while(i <= j){
            array[i] = (int)(Math.random()*100);
            array[j] = (int)(Math.random()*100);
            i++;
            j--;
        }

        System.out.println(Arrays.toString(array));
    }


}
