package Hometask.Task11;

import Hometask.Task11.Robot;

public class RobotDemo {
    public static void main(String[] args) {

        Robot myrobot = new Robot();
        myrobot.sayHallo();

        Robot myrobot2 = new Robot("Rider");
        myrobot2.sayYourName();

        Robot myrobot3 = new Robot("John");
        myrobot3.sayYourName();

    }
}
