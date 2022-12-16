package Lessons;

public class WorkWithString {
    public static void main(String[] args) {

    String text = "Это очень важный текст для учебы";
    System.out.println(text.length());
    System.out.println(text.isEmpty());
    System.out.println(text.charAt(0));
    String text2 = text.substring(1,6);
    System.out.println(text2);
    System.out.println(text.contains("очеm"));     //поиск символов да\нет
    System.out.println(text.toUpperCase());        //в верхний регистр
    System.out.println(text.toLowerCase());        //в нижний регистр
    System.out.println(text.trim());               //убираем пробелы по бокам

    System.out.println();
    System.out.println(text.lastIndexOf("ы"));  // ищем индекс этого элемента
    System.out.println(text.indexOf(" оче"));       //номер индекс




    }


}
