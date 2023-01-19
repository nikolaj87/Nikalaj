package Practice.More.MorskojBoj;

public class Analizators {

    static boolean strTester1to3(String str){
        return str.equals("1") || str.equals("2") || str.equals("3");
    }

    static boolean strTester3to10(String str){
        for (int i = 3; i < 11; i++) {
            if (str.equals(i + "")){           //только цифра 3-9 пройдет проверку
                return true;
            }
        }
        return false;
    }

}
