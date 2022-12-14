package Hometask.Task11;

import com.sun.source.util.SourcePositions;

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
