package allhometasks.home2.Task20;

public class Dog {

    String name;
    Integer age;

    public Dog(final String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void happyBirthday(){
        this.age ++;
    }
    public void voice(){
        System.out.println("name " + this.name + " " + this.age + " years");
    }

}
