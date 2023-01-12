package Practice.TaskFromBook1.MorskojBoj;

import java.util.Scanner;

class MorskojBoj_version1_01 {
    public void morskojBoj(int[][] array){
//сделаем визуальную картинку из массива String. Второй массив нужен чтоб не выдавать корабли
//инициализируем массив и все элементы массива
    String[][] myarray2 = new String[array.length][array.length];
    for (int i = 0; i < myarray2.length; i++){
        for (int j = 0; j < myarray2[0].length; j++){
                myarray2[i][j] = ".";
        }
    }
    int count = 0;
        while (count<3){
            System.out.print("  ");
            for (int k = 0; k < myarray2.length; k++) {
                 System.out.print(k + " ");
            }
            System.out.println();

            for (int g = 0; g < myarray2.length; g++){
                System.out.print((g) + " ");
                for (int h = 0; h < myarray2[0].length; h++){
                    if (myarray2[h][g].equals("*")){
                    }else if(myarray2[h][g].equals("X")) {
                    }else {
                        myarray2[h][g] = ".";
                    }
                    System.out.print(myarray2[h][g]+" ");
                }
                System.out.println();
            }
// поле готово начинаем битву
            int[][] myarray = array;
            Scanner scaner2 = new Scanner(System.in);
            System.out.println("Делайте выстрел. На поле есть 3Х корабль. (например 00)");
            String x1 = scaner2.nextLine();
            int x2 = Integer.parseInt(x1.charAt(0) + "");
            int y2 = Integer.parseInt(x1.charAt(1) + "");
            myarray2[x2][y2] = "*";
//проверяем ход
            if (myarray[x2][y2] == 1) {
                count ++;
                myarray2[x2][y2] = "X";
                if (count == 3) System.out.println("ПОБЕДА!!!");
                else System.out.println("Корабль подбит!!! ");
            }
            else System.out.println("мимо");
        }
//игра окончена! Распечатаем результат
        System.out.print("  ");
        for (int k = 0; k < myarray2.length; k++) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int g = 0; g < myarray2.length; g++){
            System.out.print((g) + " ");
            for (int h = 0; h < myarray2[0].length; h++){
                if (myarray2[h][g].equals("*")){
                }else if(myarray2[h][g].equals("X")) {
                }else {
                    myarray2[h][g] = ".";
                }
                System.out.print(myarray2[h][g]+" ");
            }
            System.out.println();
        }



    }
}
