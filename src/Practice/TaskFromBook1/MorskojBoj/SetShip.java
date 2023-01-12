package Practice.TaskFromBook1.MorskojBoj;

import java.util.Random;

public class SetShip {
    public int[][] create(int size){
        //мы получили размер квадратного игрового поля size и поставим на него корабль из трех точек
        //рандомно определим будет ли корабль вертикальным. И рандомно разместим его на поле
        int[][] gamePole = new int[size][size];
        //массив создан и заполнен по умолчанию нолями.
        int x = (int) (Math.random() * size);
        int y = (int) (Math.random() * (size - 2));
        //в том случае если корабль имеет вертикальное расположение
        Random isShipVertical = new Random();
        if(isShipVertical.nextBoolean()){//размещаем наш случайный ВЕРТИКАЛЬНЫЙ корабль
            gamePole[x][y] = 1;
            gamePole[x][y + 1] = 1;
            gamePole[x][y + 2] = 1;
        }else{//горизонтальный корабль
            gamePole[y][x] = 1;
            gamePole[y+1][x] = 1;
            gamePole[y+2][x] = 1;
        }
//                //распечатаем результат
//        for (int j = 0; j < size; j++) {
//            for (int i = 0; i < size; i++) {
//                System.out.print(gamePole[j][i] + " ");
//            }
//            System.out.println();}
        return gamePole;
    }
    }

