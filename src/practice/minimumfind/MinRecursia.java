package practice.minimumfind;

import java.util.ArrayList;

public class MinRecursia {

       Integer min;
       Integer indexOFElement;
       ArrayList<Integer> checkedNumbers = new ArrayList<>();

        public void myFunction(int index, int[] arr){

            if (index > arr.length || index < 0){
                System.out.println("Err: out of array length");
                return;
            }
            if (index == 0) return;
            min = Integer.MAX_VALUE;
            indexOFElement = 0;

            label:
            for (Integer i = 0; i < arr.length; i++) {
                for (Integer num: checkedNumbers)
                    if (num == i) continue label;

                if (arr[i] <= min){
                    min = arr[i];
                    indexOFElement = i;
                }
            }
            System.out.println("наименьший элемент - " + min + " индекс элемента - " + indexOFElement);
            checkedNumbers.add(indexOFElement);
//            System.out.println(checkedNumbers);
            index--;
            myFunction(index, arr);
        }
    }



