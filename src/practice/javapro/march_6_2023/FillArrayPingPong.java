package practice.javapro.march_6_2023;

public class FillArrayPingPong {


    int[][] array = new int[6][7];

    int x = 3;
    int y = 2;

    void fillArrayPingPongStyle() {

        while(true) {
            while (x > 0 && y < array.length) {
                array[x][y] = (int) (Math.random() * 8 + 1);
                x--; y++;
            } if (check2()) break;

            while (x < array.length && y < array[0].length - 1) {
                array[x][y] = (int) (Math.random() * 8 + 1);
                x++; y++;
            } if (check2()) break;

            while (x < array.length - 1 && y > 0) {
                array[x][y] = (int) (Math.random() * 8 + 1);
                x++; y--;
            } if (check2()) break;

            while (x > 0 && y > 0) {
                array[x][y] = (int) (Math.random() * 8 + 1);
                x--;  y--;
            } if (check2()) break;
        }
        array[x][y] = (int) (Math.random() * 8 + 1);
        printArray();

    }

//    // метод проверяет касание к границе
//    private boolean check1(){
//        return x == 0 || y == 0 || x == array.length || y == array[0].length;
//    }
    // метод проверяет достижение угловых координат
    private boolean check2(){
        return ((x == array.length - 1 && y == array[0].length - 1) ||
                (x == 0 && y == array[0].length - 1) ||
                (x == array.length - 1 && y == 0) ||
                (x == 0 && y == 0));
    }

    void printArray(){
        for (int[] ints : array) {
            System.out.println();
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");

            }
        }
    }

}





