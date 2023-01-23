package allhometasks.home3.Task3;

public class TemperatureCheck {
    static boolean check(int t1, int t2){

        boolean istrue = false;
        if (t1>100 && t2<100){
            istrue = true;
        }
        return istrue;
    }

}
