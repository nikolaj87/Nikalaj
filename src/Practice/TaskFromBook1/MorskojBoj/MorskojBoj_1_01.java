package Practice.TaskFromBook1.MorskojBoj;

import java.util.Scanner;

class MorskojBoj_1_01 {

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
            char mychar = 'a';
            System.out.print("  ");                              //р
            for (int k = 0; k < myarray2.length; k++) {          //а
                 System.out.print(mychar + " ");                 //c
                 mychar++;                                       //п
            }                                                    //е
            System.out.println();                                //ч
                                                                 //а
            for (int g = 0; g < myarray2.length; g++){           //т
                System.out.print((g+1) + " ");                   //а
                for (int h = 0; h < myarray2[0].length; h++){    //е
                    if (myarray2[h][g].equals("*")){             //м
                    }else if(myarray2[h][g].equals("X")) {       //в
                    }else {                                      //к
                        myarray2[h][g] = ".";                    //о
                    }                                            //н
                    System.out.print(myarray2[h][g]+" ");        //с
                }                                                //о
                System.out.println();                            //л
            }                                                    //ь!
//если есть 3 попадания то прерываем цикл. Но мы дошли до этой точки чтоб распечатать резльтат
            if (count == 3) break;
//поле готово начинаем игру
            int[][] myarray = array;
            Scanner scaner2 = new Scanner(System.in);
            System.out.println("Делайте выстрел. На поле есть 3Х корабль. (например a1)");
            String x1 = scaner2.nextLine();
            int x2 = (x1.charAt(0)-97);
            int y2 = Integer.parseInt(x1.charAt(1) + "")-1;
            //проверяем ход
            fire++;
            if (myarray[x2][y2] == 1 && myarray2[x2][y2].equals(".")) {
                count ++;
                myarray2[x2][y2] = "X";
                if (count == 3) System.out.println("ПОБЕДА!!! За " + fire + " хода(ов)!");
                else System.out.println("Корабль подбит!!! ");
            } else if(myarray[x2][y2] == 1 && myarray2[x2][y2].equals("X")){
                System.out.println("Не хитри! Такой ход уже был!!!!!");
            }else {
                System.out.println("мимо");
                myarray2[x2][y2] = "*";
            }
        }
    }
}
