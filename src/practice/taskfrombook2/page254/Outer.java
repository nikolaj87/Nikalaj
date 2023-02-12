package practice.taskfrombook2.page254;

public class Outer {
    private int[]  nums;

    Outer(int[] n){
        nums = n;
    }

    void Analyze(){
        Inner inOb = new Inner();
        System.out.println("минимум " + inOb.min(2));
        System.out.println("максимум " + inOb.max());

    }


    class Inner{



        int min(int y){
            int m = nums[0];
            for (int i = 1; i < nums.length ; i++) {
                if(nums[i] < m) m = nums[i];
            }

            return m;
        }
        int min(int ... r){
            return 1;
        }

        int max(){
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] > m) m = nums[i];
            }
            return m;
        }
    }


}
