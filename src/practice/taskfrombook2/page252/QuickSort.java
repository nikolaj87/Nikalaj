package practice.taskfrombook2.page252;

import java.util.Arrays;

class QuickSort {

    static void qsort(char[] items){
        qs(items, 0, items.length-1);
    }

    private static void qs(char[] items, int left, int right) {
        int i,j;
        char x, y;

        i = left; j = right;
        x = items[(left + right) / 2];
        System.out.println(x);

        int count = 1;

        do {
            while((items[i] < x) && (i < right)) {
                System.out.println("left " + i);
                i++;
            }
            System.out.println("nawuhode " + i);
            while((x < items[j]) && (j > left)) {
                System.out.println("right " + j);
                j--;
            }
            System.out.println("vuhod right " + j);
            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
            System.out.println("проход " + count);
            count++;
            System.out.println("после сортировки массив выглядит так " +
                    Arrays.toString(items));
        } while (i <= j );


        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }

}
