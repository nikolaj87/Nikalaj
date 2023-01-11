package AllHomeTasks.Home3.skilldesk.Task6;

class Money {

    static int dayCounter(int money) {
        int delitel;
        int counter = 0;
        while (money > 1) {
            delitel = money-1;
            while (money % delitel != 0) {
                delitel--;
            }
            counter++;
            money = money - delitel;
        }
        return counter+1;
    }
}