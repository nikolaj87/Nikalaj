package practice.taskfrombook1.page94;

class Islands {
    public static void main(String[] args) {

        String[] islands = new String[4];

        int[] index = new int[4];

        islands[0] = "Bermydu";
        islands[1] = "Fiji";
        islands[2] = "Azorsky islands";
        islands[3] = "Kosymel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            y = y + 1;
            System.out.print("ostrava = ");
            System.out.println(islands[ref]);

        }
    }
}


















