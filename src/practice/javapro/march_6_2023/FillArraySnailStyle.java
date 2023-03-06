package practice.javapro.march_6_2023;

public class FillArraySnailStyle {

    public static void main(String[] args) {

        int[][] array = new int[2][3];
        int startI = 0;
        int finishI = array[0].length;
        int startJ = 0;
        int finishJ = array.length;

        while(startI < finishI && startJ < finishJ){

            if(finishJ - startJ == 1){
                for (int i = startI; i < finishI; i++) {
                    array[startJ][i] = (int) (Math.random() * 9 + 1);
//                    System.out.println(startJ + " " + i);
                }
                break;
            }

            if(finishI - startI == 1){
                for (int j = startJ; j < finishJ; j++) {
                    array[j][finishI - 1] = (int) (Math.random() * 9 + 1);
//                    System.out.println(j + " " + (finishI - 1));
                }
                break;
            }


            for (int i = startI; i < finishI; i++) {
                array[startJ][i] = (int) (Math.random() * 9 + 1);
//                System.out.println(startJ + " " + i);
            }
            for (int j = startJ + 1; j < finishJ; j++) {
                array[j][finishI - 1] = (int) (Math.random() * 9 + 1);
//                System.out.println(j + " " + (finishI - 1));
            }
            for (int i = finishI - 2; i >= startI; i--) {
                array[finishJ - 1][i] = (int) (Math.random() * 9 + 1);
//                System.out.println((finishJ - 1) + " " + i);
            }
            for (int j = finishJ - 2; j > startI; j--) {
                array[j][startI] = (int) (Math.random() * 9 + 1);
//                System.out.println(j + " " + (startI));
            }

            startI++;
//            System.out.println(startI);
            finishI--;
//            System.out.println(finishI);
            startJ++;
//            System.out.println(startJ);
            finishJ--;
//            System.out.println(finishJ);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

    }

}
