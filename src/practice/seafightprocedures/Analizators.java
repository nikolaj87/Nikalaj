package practice.seafightprocedures;

public class Analizators {

    static boolean strTester1to3(String str) {
        return str.equals("1") || str.equals("2") || str.equals("3");
    }

    static boolean strTester3to10(String str) {
        for (int i = 3; i < 11; i++) {
            if (str.equals(i + "")) {           //только цифра 3-9 пройдет проверку
                return true;
            }
        }
        return false;
    }

    //только ввод в формате 1цифра + 1 буква будет подтвержден. Учитывается размер игрового поля
    static boolean shotInputAnalize(String str, int size) {
        char mychar;
        for (int i = 0; i < size; i++) {
            String test = i + "";
            mychar = 'a';
            for (int j = 0; j < size; j++) {
                test += "" + mychar;
                mychar++;
                if (str.equals(test)) {
                    return true;
                }
                test = test.charAt(0) + "";
            }
        }
        return false;
    }
}

