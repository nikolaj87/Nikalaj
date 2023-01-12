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
    int fire = 0;
        while (count<4){
//----------------------------------------------------------------
            System.out.print("  ");                              //р
            for (int k = 0; k < myarray2.length; k++) {          //а
                 System.out.print(k + " ");                      //с
            }                                                    //п
            System.out.println();                                //е
                                                                 //ч
            for (int g = 0; g < myarray2.length; g++){           //а
                System.out.print((g) + " ");                     //т
                for (int h = 0; h < myarray2[0].length; h++){    //а
                    if (myarray2[h][g].equals("*")){             //е
                    }else if(myarray2[h][g].equals("X")) {       //м
                    }else {                                      //в
                        myarray2[h][g] = ".";                    //к
                    }                                            //о
                    System.out.print(myarray2[h][g]+" ");        //н
                }                                                //с
                System.out.println();                            //о
            }                                                    //ль!
//если есть 3 попадания то прерываем цикл. Но мы дошли до этой точки чтоб распечатать резльтат
            if (count == 3) break;
//поле готово начинаем игру
            int[][] myarray = array;
            Scanner scaner2 = new Scanner(System.in);
            System.out.println("Делайте выстрел. На поле есть 3Х корабль. (например 00)");
            String x1 = scaner2.nextLine();
            int x2 = Integer.parseInt(x1.charAt(0) + "");
            int y2 = Integer.parseInt(x1.charAt(1) + "");
            myarray2[x2][y2] = "*";
//проверяем ход
            fire++;
            if (myarray[x2][y2] == 1) {
                count ++;
                myarray2[x2][y2] = "X";
                if (count == 3) System.out.println("ПОБЕДА!!! За " + fire + " хода(ов)!");
                else System.out.println("Корабль подбит!!! ");
            }
            else System.out.println("мимо");

        }
    }
}
