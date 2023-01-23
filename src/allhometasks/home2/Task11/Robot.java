package allhometasks.home2.Task11;

public class Robot {
    String name;

    public void sayHallo(){
        System.out.println("Hello");
    }
 // мотод вывести имя
    public void sayYourName(){
        System.out.println("My name is " + this.name);
    }
// создаем конструктор
    public Robot (){
    }
// создаем конструктор с параметром имя
    public Robot(String name) {
        this.name = name;
    }
}
