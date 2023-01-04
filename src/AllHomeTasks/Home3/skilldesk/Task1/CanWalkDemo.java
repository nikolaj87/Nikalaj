package AllHomeTasks.Home3.skilldesk.Task1;

//    First level: - Создайте две переменные isWeekend и isRain. Создайте переменную canWalk,
//    значение которой должно быть истинным, если это выходной день (isWeekend=true) и не идет
//    дождь (isRain=false).

import AllHomeTasks.Home3.skilldesk.Request;

class CanWalkDemo {
    public static void main(String[] args) {
        boolean isWeekend;
        boolean isRain;
        // обращаемся за вводными данными в сканер, передаем туда запрос
        isWeekend = Request.booleanRequest("Сегодня выходной? true/false");
        isRain = Request.booleanRequest("Сегодня идет дождь? true/false");
        // передаем данные для анализа;
        System.out.println("Можно ли сегодня гулять? - " + CanWalk.isCanWalk(isWeekend,isRain));

    }
}
