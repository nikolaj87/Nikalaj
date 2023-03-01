package practice.minimumfind;

public class TwoMin {
    public static void main(String[] args) {

        int[] arr = {2,2,9,4,3,9,11,22,7,10};

        int min = arr[0];
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min2 = min;
                min = arr[i];

            } else if (arr[i] < min2){
               min2 = arr[i];
            }
        }
        System.out.println(min +" "+ min2);
    }
}
