package allhometasks.home3.Task3;

import allhometasks.home3.Request;

public class TemperatureDemo {
//    Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно,
//    если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100
//    градусов. Вы должны написать метод, который проверяет это устройство. Ваша программа
//    должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение
//    true или false.

    public static void main(String[] args) {
        //запрашиваем температуру
        int temperature1 = Request.intRequest("Введите температуру 1 (int)");
        int temperature2 = Request.intRequest("Введите температуру 2 (int)");
        //передаем на анализ
        System.out.println("Ваше устройство работает нормально? - "
                + TemperatureCheck.check(temperature1, temperature2));
    }
}
