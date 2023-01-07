package AllHomeTasks.Home3.skilldesk.Task5;

import AllHomeTasks.Home3.skilldesk.Request;

public class LiftDemo {
//    сломанный лифт
//    лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт
//    сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем
//    подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх.
//    Найдите количество подьемов, которые понадобятся лифту.
//    реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)

    public static void main(String[] args) {
        //запрашиваем ввод данных
        int flour = Request.intRequest("Сколько этажей в здании? (int)");
        int stepUp = Request.intRequest("Сколько этажей лифт едет вверх? (int)");
        int stepDown = Request.intRequest("На сколько этажей лифт возвращается?\n" +
                "Цифра дожна быть меньше предыдущей (int)");
        //передаем данные в цикл while
        System.out.println("Лифт достигнет последнего этажа за " +
                Lift.numberOfLifts(flour, stepUp, stepDown)
        + " попыток!");
    }
}
