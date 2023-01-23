package allhometasks.home3.Task5;

public class Lift {
    static int numberOfLifts(int floor, int stepUp, int stepDown){
        int counter = 0;
        while (floor - stepUp > 0){
            counter++;
            floor = floor - stepUp + stepDown;
        }

        return counter+1;
    }
}
