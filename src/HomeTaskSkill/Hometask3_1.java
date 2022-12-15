package HomeTaskSkill;

import java.util.Scanner;

class Hometask3_1 {
    public static void main(String[] args) {

//        введите 2 слова, используйте сканер, состоящий из четного количества букв
//        (проверьте количество букв в слове). Получить слово, состоящее из первой половины
//        первого слова и второй половины второго слова. распечатать на консоль.

        Scanner scan = new Scanner(System.in);
        System.out.println("введите слово из четного кол-ва букв");
        String str1 = scan.nextLine();

        System.out.println("введите еще одно слово из четного кол-ва букв");
        String str2 = scan.nextLine();

        System.out.println((str1.substring(0,str1.length()/2)) + str2.substring(str2.length()/2));
        System.out.println();
    }
}
