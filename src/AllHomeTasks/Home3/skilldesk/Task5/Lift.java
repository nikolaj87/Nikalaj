package AllHomeTasks.Home3.skilldesk.Task5;

public class Lift {
    static int numberOfLifts(int floor, int stepUp, int stepDown){
        int counter = 0;
        while (floor - stepUp > 0){
            counter += 1;
            floor = floor - stepUp + stepDown;
        }

        return counter+1;
    }
}
