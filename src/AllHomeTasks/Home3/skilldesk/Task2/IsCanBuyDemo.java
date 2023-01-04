package AllHomeTasks.Home3.skilldesk.Task2;

import AllHomeTasks.Home3.skilldesk.Request;

class IsCanBuyDemo {
//    Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
//    открыты магазины или нет. Реализует логический метод canBuy, возвращающий true **
//    Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//    Отобразите строку «Я могу купить еду, это ……» и значение.

    public static void main(String[] args) {
        boolean isEdekaOpen;
        boolean isReweOpen;
        //даем запрос по магазинам
        isEdekaOpen = Request.booleanRequest("Открыт ли магазин Edeka? true/false");
        isReweOpen = Request.booleanRequest("Открыт ли магазин Rewe? true/false");
        //передаем на анализ
        System.out.println("Могу ли я купить еду? - " + IsCanBuy.canBuy(isReweOpen, isEdekaOpen));
    }
}
