package AllHomeTasks.HomeTaskSkill2;

public class Hometask3_4 {
    public static void main(String[] args) {
        // Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо
        // пиццы диаметром 24 см вы купите пиццу диаметром 28 см. Чтобы решить эту проблему,
        // предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.

        int diametr1 = 24;
        int diametr2 = 28;

        double izbutokPizzu = (3.1416 * diametr2/2 * diametr2/2  -
                3.1416 * diametr1/2 * diametr1/2) * 40;

        System.out.println(izbutokPizzu + " лишних калорий");



    }
}
