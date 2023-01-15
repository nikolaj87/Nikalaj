import java.util.Scanner;

public class Java {

    static  public boolean isArrayIncrease(){

        int [] array = {1,3,5,9,11};


        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (i+1>=array.length){
                break;
            }
            if (array[i]>array[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }

        }

